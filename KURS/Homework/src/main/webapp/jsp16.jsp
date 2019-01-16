<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: slawekp
  Date: 16.01.19
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp16</title>
</head>
<body>
<c:forEach items="${pairs}" var="records">
    ${records.key} : ${records.value}<br>
</c:forEach>
</body>
</html>
