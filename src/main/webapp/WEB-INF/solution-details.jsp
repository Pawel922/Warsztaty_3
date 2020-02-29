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
    <title>Solution details</title>
</head>
<body>
<%@ include file="/WEB-INF/header.jsp"%>
<table>
    <tr>
        <th>Exercise title</th>
        <th>Exercise content</th>
        <th>Solution</th>
        <th>Date added</th>
        <th>Date updated</th>
    </tr>
        <tr>
            <td>${exercise.getTitle()}</td>
            <td>${exercise.getDescription()}</td>
            <td>${solution.getDescription()}</td>
            <td>${solution.getCreated()}</td>
            <td>${solution.getUpdated()}</td>
        </tr>
</table>
<div>
    <a href="/"><button class="button">Back</button></a>
</div>
<%@include file="/WEB-INF/footer.jsp"%>
</body>
</html>
