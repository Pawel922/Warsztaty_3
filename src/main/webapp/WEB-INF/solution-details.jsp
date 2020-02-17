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
        <th>Description</th>
        <th>Author</th>
        <th>Date added</th>
        <th>Date updated</th>
    </tr>
        <tr>
            <td>${solution.getDescription()}</td>
            <td>${solution.getUserId()}</td>
            <td>${solution.getCreated()}</td>
            <td>${solution.getUpdated()}</td>
        </tr>
</table>
<%@include file="/WEB-INF/footer.jsp"%>
</body>
</html>
