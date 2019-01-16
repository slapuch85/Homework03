<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: slawekp
  Date: 15.01.19
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp13</title>
</head>
<body>
    <c:forEach items="${oop}" var="value">
        ${value}<br>
    </c:forEach>
</body>
</html>
