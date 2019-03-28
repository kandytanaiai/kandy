<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户编辑</title>
</head>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
    $(document).ready(function() {

    });
</script>
<body>
<form id="frm_sub" method="post" action="${pageContext.request.contextPath}/base/user/save.do">
    <table>
        <tr><td><input type="hidden" name="userId"></td></tr>
        <tr>
            <td>名称：<input type="text" name="userName" /></td>
            <td>类型：<select name="userTypeId"></select></td>
            <td>性别：<select name="sexId"></select></td>
        </tr>
        <tr>
            <td>出生日期：<input type="date" name="birthday" /></td>
            <td>电话：<input type="text" name="tel" /></td>
            <td>email：<input type="text" name="email" /></td>
        </tr>
        <tr>
            <td colspan="3">备注：<input type="text" name="remark" /></td>
        </tr>
    </table>
</form>
</body>
</html>
