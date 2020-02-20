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
    <title>Exercises</title>
</head>
<body>
<%@ include file="/WEB-INF/header.jsp"%>
<div>
    <a href="">Add new</a>
</div>
<table>
    <tr>
        <th>Title</th>
        <th>Description</th>
    </tr>
    <c:forEach items="${exercises}" var="exercise">
        <tr>
            <td>${exercise.getTitle()}</td>
            <td>${exercise.getDescription()}</td>
            <td><a href="">Edit</a></td>
        </tr>
    </c:forEach>
</table>
<%@include file="/WEB-INF/footer.jsp"%>
</body>
</html>