<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户编辑</title>
</head>
<style>
    .invalid {
        color: red;
    }
</style>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/resources/js/jquery/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/util/jquery.serializejson.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/util/jquery.validate.min.js"></script>
<script type="text/javascript">
    $(document).ready(function () {
        dataLoad();

        $("#frm_sub").validate({
            rules: {
                userName: {
                    required: true
                },
                userTypeId: {
                    required: true
                },
                sexId: {
                    required: true
                },
                tel: {
                    required: true,
                    remote: {
                        type: "POST",
                        url: "${pageContext.request.contextPath}/base/user/noExist.do",
                        data: {
                            tel: function () {
                                return $("#tel").val();
                            },userId:"${userId}"
                        }
                    }
                },
                email: {
                    required: true,
                    remote: {
                        type: "POST",
                        url: "${pageContext.request.contextPath}/base/user/noExist.do",
                        data: {
                            email: function () {
                                return $("#email").val();
                            },userId:"${userId}"
                        }
                    }
                }
            },
            messages:
                {
                    userName: {
                        required: "请输入名称"
                    }
                    ,
                    userTypeId: {
                        required: "请选择类型"
                    }
                    ,
                    sexId: {
                        required: "请选择性别"
                    }
                    ,
                    tel: {
                        required: "请输入电话",
                        remote:
                            "该电话已存在"
                    }
                    ,
                    email: {
                        required: "请输入email",
                        remote:
                            "该邮箱已存在"
                    }
                }
            ,
            // onfocusout: function(element) {
            //     $(element).valid();
            //     },
            focusInvalid: true,
            focusCleanup:
                true,
            errorClass:
                "invalid"
        });
    })
    ;

    function dataLoad() {
        var userId = "${userId}";
        editDataLoad(userId);
    }

    function editDataLoad(userId) {
        $.ajax({
            type: "POST",
            url: "${pageContext.request.contextPath}/base/code/selectList.do",
            data: JSON.stringify({"codeType": "user_type_id"}),
            contentType: 'application/json;charset=utf-8',
            dataType: "json",
            async: false,
            success: function (baseCodeVOList) {
                $.each(baseCodeVOList, function (n, baseCodeVO) {
                    $("#userTypeId").append("<option value='" + baseCodeVO.codeId + "'>" + baseCodeVO.codeName + "</option>");
                });
                $("#userTypeId").trigger("userTypeIdChange");
            },
            error: function (data) {
                alert("加载失败");
            }
        });

        $.ajax({
            type: "POST",
            url: "${pageContext.request.contextPath}/base/code/selectList.do",
            data: JSON.stringify({"codeType": "sex_id"}),
            contentType: 'application/json;charset=utf-8',
            dataType: "json",
            async: false,
            success: function (baseCodeVOList) {
                $.each(baseCodeVOList, function (n, baseCodeVO) {
                    $("#sexId").append("<option value='" + baseCodeVO.codeId + "'>" + baseCodeVO.codeName + "</option>");
                });
            },
            error: function (data) {
                alert("加载失败");
            }
        });

        if (userId != null && userId != undefined && userId != "") {
            $.ajax({
                type: "POST",
                url: "${pageContext.request.contextPath}/base/user/selectOne.do",
                data: JSON.stringify({"userId": userId}),
                contentType: 'application/json;charset=utf-8',
                dataType: "json",
                success: function (baseUserVO) {
                    $("#userName").val(baseUserVO.userName);
                    $("#userTypeId").val(baseUserVO.userTypeId);
                    $("#sexId").val(baseUserVO.sexId);
                    $("#birthday").val(timestampToDate(baseUserVO.birthday));
                    $("#tel").val(baseUserVO.tel);
                    $("#email").val(baseUserVO.email);
                    $("#remark").val(baseUserVO.remark);

                    resetModifyMark();
                },
                error: function (data) {
                    alert("加载失败");
                }
            });
        }
    }

    function timestampToDate(timestamp) {
        if("" == timestamp)
            return "";
        var date = new Date(timestamp);//时间戳为10位需*1000，时间戳为13位的话不需乘1000
        Y = date.getFullYear() + '-';
        M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
        D = (date.getDate() < 10 ? '0'+(date.getDate()) : date.getDate());

        h = date.getHours() + ':';
        m = (date.getMinutes() < 10 ? '0'+(date.getMinutes()) : date.getMinutes()) + ':';
        s = (date.getSeconds() < 10 ? '0'+(date.getSeconds()) : date.getSeconds());

        // return Y+M+D+h+m+s;
        return Y+M+D;
    }

    function resetModifyMark() {
        $("#frm_sub").data("changed", false);
        $("#frm_sub :input").change(function () {
            $("#frm_sub").data("changed", true);
        });
    }

    function save() {
        // var str = JSON.stringify($('#frm_sub').serializeJSON());
        // alert(str);
        // return;

        if (!$("#frm_sub").validate().form()) {
            return;
        }

        $.ajax({
            type: "POST",
            url: "${pageContext.request.contextPath}/base/user/save.do",
            data: JSON.stringify($('#frm_sub').serializeJSON()),
            contentType: 'application/json;charset=utf-8',
            dataType: "json",
            success: function (operResult) {
                if (operResult.flag) {
                    alert("保存成功");

                    window.parent.submitOut(window.parent.$("#pager_currPage").val());
                    window.parent.jQuery('#div_edit').dialog('close');
                } else {
                    alert(operResult.msg);
                }
            },
            error: function (data) {
                alert("保存失败");
            }
        });
    }

    function cancel() {
        if ($("#frm_sub").data("changed")) {
            if (!confirm("是否取消已修改内容?")) {
                return;
            }
        }
        window.parent.jQuery('#div_edit').dialog('close');
    }

</script>
<body>
<div>
    <input type="button" id="btn_reset" name="btn_reset" value="重置" onclick="dataLoad();">
    <input type="button" id="btn_save" name="btn_save" value="保存" onclick="save();">
    <input type="button" id="btn_cancel" name="btn_cancel" value="取消" onclick="cancel();">
</div>
<form id="frm_sub" method="post" action="${pageContext.request.contextPath}/base/user/save.do">
    <table>
        <tr>
            <td><input type="hidden" id="userId" name="userId" value="${userId}"></td>
        </tr>
        <tr>
            <td>名称*：<input type="text" id="userName" name="userName"/></td>
            <td>类型*：<select id="userTypeId" name="userTypeId"></select></td>
            <td>性别*：<select id="sexId" name="sexId"></select></td>
        </tr>
        <tr>
            <td>出生日期：<input type="date" id="birthday" name="birthday"/></td>
            <td>电话*：<input type="text" id="tel" name="tel"/></td>
            <td>email*：<input type="text" id="email" name="email"/></td>
        </tr>
        <tr>
            <td colspan="3">备注：<input type="text" id="remark" name="remark"/></td>
        </tr>
    </table>
</form>
</body>
</html>
