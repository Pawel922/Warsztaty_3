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
    <table class="table-form">
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name" value="${user.getUserName()}"></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><input type="text" name="email" value="${user.getEmail()}"></td>
        </tr>
        <tr>
            <td>Group:</td>
            <td>
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
                </select>
            </td>
        </tr>
        <tr>
            <td><a href="/admin/users"><button class="button-form">Back</button></a></td>
            <td><input type="submit" value="Save" class="button-form"></td>
        </tr>
    </table>
</form>
<%@include file="/WEB-INF/footer.jsp"%>
</body>
</html>
