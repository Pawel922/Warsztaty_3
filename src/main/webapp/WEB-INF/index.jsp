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
    <title>Welcome</title>
</head>
<body>
<%@ include file="/WEB-INF/header.jsp"%>
    <table>
        <tr>
            <th>Title</th>
            <th>Author</th>
            <th>Date added</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${solutions}" var="solution">
            <tr>
                <td>${solution.getExerciseTitle()}</td>
                <td>${solution.getUserId()}</td>
                <td>${solution.getCreated()}</td>
                <td><a href="/solution/details?id=${solution.getId()}">Details</a></td>
            </tr>
        </c:forEach>
    </table>
<%@include file="/WEB-INF/footer.jsp"%>
</body>
</html>
