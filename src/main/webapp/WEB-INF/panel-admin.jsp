<%--
  Created by IntelliJ IDEA.
  User: pawel
  Date: 18.01.2020
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Admin panel</title>
</head>
<body>
<%@ include file="/WEB-INF/header.jsp"%>
<div class="admin-list">
    <p><a href="/admin/exercises">Exercises</a></p>
    <p><a href="/admin/groups">Groups</a></p>
    <p><a href="/admin/users">Users</a></p>
</div>
<%@include file="/WEB-INF/footer.jsp"%>
</body>
</html>
