<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: slawekp
  Date: 15.01.19
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jsp15</title>
</head>
<body>
    <table>
        <tr>
            <th>tab</th>
        </tr>
        <c:forEach items="${tab}" var="number">
            <tr>
                <td>${number}</td>
            </tr>
        </c:forEach>
    </table>
<table>
    <tr>
        <th>sortedTab</th>
    </tr>
    <c:forEach items="${sortedTab}" var="number">
        <tr>
            <td>${number}</td>
        </tr>
    </c:forEach>
</table>
<a href="index.html">Strona domowa</a>
</body>
</html>
