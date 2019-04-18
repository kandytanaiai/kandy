<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>用户列表</title>
</head>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery/jquery-3.3.1.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/util/jquery-ui-1.12.1.custom/jquery-ui.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/util/util.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/util/jquery-ui-1.12.1.custom/jquery-ui.css">
<script type="text/javascript">
    $(document).ready(function() {
        cx();

        $('#ipt_userName').keydown(function(e){
            if(e.keyCode==13){
                $("#but_cx").click();
            }
        });
    });

    function deleteId(userId) {
        var ids = new Array();
        ids.push(userId);
        deleteByIds(ids);
    }

    function deleteIds() {
        var ids = new Array();
        $("input[name='ids']:checked").each(function(){
            ids.push($(this).val());
        });

        if(ids.length < 1) {
            alert("请选中记录");
            return;
        }
        deleteByIds(ids);
    }

    function deleteByIds(userIds) {
        if (!confirm("是否删除已选择记录?")) {
            return;
        }

        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/base/user/delete.do",
            data:JSON.stringify(userIds),
            contentType: 'application/json;charset=utf-8',
            dataType:"json",
            success:function(data){
                submitOut($("#pager_currPage").val());
                alert("删除成功");
            },
            error:function(data){
                alert("删除失败");
            }
        });
    }
    
    function edit(userId) {
        var title = "用户新增";
        var url = "${pageContext.request.contextPath}/base/user/toUserEdit.do";
        if(userId!=null&&userId!=undefined&&userId!="") {
            title = "用户编辑";
            url = url + "?userId=" + userId;
        }
        $("#ifr_userEdit").attr("src", url);

        $("#div_edit").dialog({
            height: 500,
            width: 800,
            title: title
        });
    }

    function cx() {
        $("#hidden_userName").val($("#ipt_userName").val());
        query(1, 5);
    }

    function query(currPage, pageSize) {
        var userName = $("#hidden_userName").val();
        // alert(userName);
        reloadData(userName, currPage, pageSize);
    }

    function reloadData(userName, currPage, pageSize) {
        $("#table_data tr:not(:first)").empty("");
        // $("#table_data tr").html("");
        $("#div_pager").html("");
        $.ajax({
            type:"POST",
            url:"${pageContext.request.contextPath}/base/user/selectPager.do",
            data:JSON.stringify({"userName":userName, "pager":{"currPage":currPage, "pageSize":pageSize}}),
            contentType:'application/json;charset=utf-8',
            dataType: "json",
            success:function(pager){
                 fillData(pager);
                // $("#table_data tr:not(:first)").empty("");
                // $("#table_data tr").append("<td>22</td>");
                fillPager(pager);
            },
            error:function(data){
                alert("加载失败");
            }
        });

    }
    
    function fillData(pager) {
        $.each(pager.dataList, function (n, baseUserVO) {
            $("#table_data").append("<tr>" +
                "<td><input type=\"checkbox\" id=\"ids\" name=\"ids\" value=\""+baseUserVO.userId+"\"></td>" +
                "<td>" + baseUserVO.userName + "</td>" +
                "<td>" + baseUserVO.userTypeName + "</td>" +
                "<td>" + baseUserVO.sexName + "</td>" +
                "<td>" + timestampToDate(baseUserVO.birthday) + "</td>" +
                "<td>" + baseUserVO.tel + "</td>" +
                "<td>" + baseUserVO.email + "</td>" +
                "<td>" + baseUserVO.remark + "</td>" +
                "<td>" + timestampToTime(baseUserVO.createTime) + "</td>" +
                "<td>" + baseUserVO.isEnableName + "</td>" +
                "<td>" + baseUserVO.oper + "</td>"+"</tr>");
        });

    }


</script>
<body>
<div id="div_edit" style="display:none;">
    <iframe id ="ifr_userEdit" style="border: 0px;" width='100%' height='100%'></iframe>
</div>
    <input type="hidden" id="hidden_userName" name="hidden_userName">
    <input type="text" id="ipt_userName" name="ipt_userName">
    <input id="but_cx" name="but_cx" type="button" onclick="cx();" value="查询">
    <input type="button" onclick="edit();" value="新增">
    <input type="button" onclick="deleteIds();" value="删除">
<table id="table_data" border="1">
    <tr>
        <th>选择</th>
        <th>用户名称</th>
        <th>用户类型</th>
        <th>性别</th>
        <th>出生日期</th>
        <th>电话号码</th>
        <th>电子邮箱</th>
        <th>备注</th>
        <th>创建时间</th>
        <th>是否可用</th>
        <th>操作</th>
    </tr>
</table>
    <c:import url="../util/pager.jsp" />

</body>
</html>
