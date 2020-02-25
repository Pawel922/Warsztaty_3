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
<div>
    <a href="/admin/groups/add"><button class="button">Add new</button></a>
</div>
<table>
    <tr>
        <th>Group name</th>
        <th>Actions</th>
    </tr>
    <c:forEach items="${groups}" var="group">
        <tr>
            <td>${group.getName()}</td>
            <td><a href="/admin/groups/edit?id=${group.getId()}">Edit</a></td>
        </tr>
    </c:forEach>
</table>
<div>
    <a href="/panelAdmin"><button class="button">Back</button></a>
</div>
<%@include file="/WEB-INF/footer.jsp"%>
</body>
</html>