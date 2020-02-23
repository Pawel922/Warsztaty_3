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
    <title>Edit exercise</title>
</head>
<body>
<%@ include file="/WEB-INF/header.jsp"%>
<form action="/admin/exercises/edit" method="post">
    <label>Title:</label><input type="text" name="title" value="${exercise.getTitle()}"><br>
    <label>Description:</label><input type="text" name="description" value="${exercise.getDescription()}"><br>
    <input type="submit" value="Save">
</form>
<%@include file="/WEB-INF/footer.jsp"%>
</body>
</html>

