<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/wro/application.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/wro/application.js"></script>
</head>
<body>
    <spring:message code="welcome" text="Welcome text" />
</body>
</html>