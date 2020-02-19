<%--
  Created by IntelliJ IDEA.
  User: pawel
  Date: 18.01.2020
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>User details</title>
</head>
<body>
<%@ include file="/WEB-INF/header.jsp"%>
<table>
    <tr>
        <td>Name:</td>
        <td>${user.getUserName()}</td>
    </tr>
    <tr>
        <td>Email:</td>
        <td>${user.getEmail()}</td>
    </tr>
</table>

<table>
    <tr>
        <th>Description</th>
        <th>Date added</th>
        <th>Date updated</th>
    </tr>
    <c:forEach items="${solutions}" var="solution">
        <tr>
            <td>${solution.getDescription()}</td>
            <td>${solution.getCreated()}</td>
            <td>${solution.getUpdated()}</td>
        </tr>
    </c:forEach>
</table>
<%@include file="/WEB-INF/footer.jsp"%>
</body>
</html>
