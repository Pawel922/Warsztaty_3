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
    <title>Edit group</title>
</head>
<body>
<%@ include file="/WEB-INF/header.jsp"%>
<form action="/admin/groups/edit" method="post">
    <label>New group name:</label><input type="text" name="name" value="${group.getName()}">
    <input type="submit" value="Save">
</form>
<%@include file="/WEB-INF/footer.jsp"%>
</body>
</html>
