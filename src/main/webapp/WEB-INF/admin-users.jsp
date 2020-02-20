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
    <title>Users</title>
</head>
<body>
<%@ include file="/WEB-INF/header.jsp"%>
<div>
    <a href="">Add new</a>
</div>
<table>
    <tr>
        <th>Name</th>
        <th>Email</th>
        <th>Group</th>
        <th>Action</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.getUserName()}</td>
            <td>${user.getEmail()}</td>
            <td>${user.getGroupName()}</td>
            <td><a href="">Edit</a></td>
        </tr>
    </c:forEach>
</table>
<%@include file="/WEB-INF/footer.jsp"%>
</body>
</html>