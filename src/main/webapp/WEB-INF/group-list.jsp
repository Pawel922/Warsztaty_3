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
    <title>Group list</title>
</head>
<body>
<%@ include file="/WEB-INF/header.jsp"%>
<table>
    <tr>
        <th>Group name</th>
        <th>Actions</th>
    </tr>
    <c:forEach items="${groups}" var="group">
        <tr>
            <td>${group.getName()}</td>
            <td><a href="/group/users/list?id=${group.getId()}">Users</a></td>
        </tr>
    </c:forEach>
</table>
<div>
    <a href="/"><button class="button">Back</button></a>
</div>
<%@include file="/WEB-INF/footer.jsp"%>
</body>
</html>