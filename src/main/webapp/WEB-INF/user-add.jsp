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
    <title>New user</title>
</head>
<body>
<%@ include file="/WEB-INF/header.jsp"%>
<form action="/admin/users/add" method="post">
    <label>Name:</label><input type="text" name="name"><br>
    <label>Email:</label><input type="text" name="email"><br>
    <label>Password:</label><input type="text" name="password"><br>
    <label>Group:</label>
        <select name="group">
            <c:forEach items="${groups}" var="group">
                <option value="${group.getId()}">${group.getName()}</option>
            </c:forEach>
        </select><br>
    <input type="submit" value="Add">
</form>
<%@include file="/WEB-INF/footer.jsp"%>
</body>
</html>
