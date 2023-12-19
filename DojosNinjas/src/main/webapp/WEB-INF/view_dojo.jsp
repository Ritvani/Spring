<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 19-Dec-23
  Time: 13:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title><c:out value="${dojos.name}"></c:out></title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<table class="table table-striped">
    <thead>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Age</th>
    </tr>

    </thead>
    <tbody>
    <c:forEach var="ninja" items="${dojos.ninjas}">
        <tr>
            <td><c:out value="${ninja.first_name}"></c:out></td>
            <td><c:out value="${ninja.last_name}"></c:out></td>
            <td><c:out value="${ninja.age}"></c:out></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
