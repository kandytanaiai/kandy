<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
yes我最爱
<c:forEach var="testVO" items="${testVOList}">

    ${testVO.sName}
</c:forEach>
</body>
</html>
