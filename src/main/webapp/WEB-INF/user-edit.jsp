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
    <title>Edit user</title>
</head>
<body>
<%@ include file="/WEB-INF/header.jsp"%>
<form action="/admin/users/edit" method="post">
    <label>Name:</label><input type="text" name="name" value="${user.getUserName()}"><br>
    <label>Email:</label><input type="text" name="email" value="${user.getEmail()}"><br>
    <label>Group:</label>
    <select name="group">
        <c:forEach items="${groups}" var="group">
            <c:choose>
                <c:when test="${user.getUserGroupId() eq group.getId()}">
                    <option value="${group.getId()}" selected>${group.getName()}</option>
                </c:when>
                <c:otherwise>
                    <option value="${group.getId()}">${group.getName()}</option>
                </c:otherwise>
            </c:choose>
        </c:forEach>
    </select><br>
    <input type="submit" value="Save">
</form>
<%@include file="/WEB-INF/footer.jsp"%>
</body>
</html>
