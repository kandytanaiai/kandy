<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>用户列表</title>
</head>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
    $(document).ready(function() {
        // alert("加载成功。。");
    });
    function submitOut(currPage) {
        // alert(currPage);
        // return;
        if(currPage!=null&&currPage!=undefined&&currPage!="")
            $("#ipt_currPage").val(currPage);
        $("#ipt_pageSize").val($("#sel_pageSize").val());

        $("#frm_query").submit();
    }

    function deleteIds() {
        var ids = new Array();
        $("#ids").each(function(){
            ids.push($(this).val());
        })
        alert(ids);
    }

    function append() {

    }
    
    function edit() {
        
    }

</script>
<body>
<form id="frm_query" name="frm_query" action="${pageContext.request.contextPath}/base/user/selectPager.do" method="post">
    <input type="hidden" id="ipt_currPage" name="ipt_currPage">
    <input type="hidden" id="ipt_pageSize" name="ipt_pageSize">
    <input type="text" id="ipt_userName" name="ipt_userName" value="${ipt_userName}">
    <input type="button" onclick="submitOut();" value="查询">
    <input type="button" onclick="append();" value="新增">
    <input type="button" onclick="deleteIds();" value="删除">
</form>
<table>
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
    </tr>
    <c:forEach var="baseUserVO" items="${pager.dataList}">
<tr>
    <td>
        <input type="checkbox" id="ids" name="ids" value="${baseUserVO.userId}">
    </td>
    <td>
            ${baseUserVO.userName}
    </td>
    <td>
            ${baseUserVO.userTypeName}
    </td>
    <td>
            ${baseUserVO.sexName}
    </td>
    <td>
            ${baseUserVO.birthday}
    </td>
    <td>
            ${baseUserVO.tel}
    </td>
    <td>
            ${baseUserVO.email}
    </td>
    <td>
            ${baseUserVO.remark}
    </td>
    <td>
            ${baseUserVO.createTime}
    </td>
    <td>
            ${baseUserVO.isEnableName}
    </td>
</tr>
    </c:forEach>
</table>
    <c:import url="../util/pager.jsp" />


</body>
</html>
