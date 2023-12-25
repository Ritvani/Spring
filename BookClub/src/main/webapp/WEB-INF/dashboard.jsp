<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 21-Dec-23
  Time: 12:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Dashboard</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>
<div class="container">
    <div class="d-flex justify-content-between mt-2">
        <h1>Welcome, ${user.userName}!</h1>
        <h1>Welcome, ${user.email}!</h1>
        <div class="d-inline p-2">
            <a href="/logout">Logout</a>
            <a href="/new/book">Create Book</a>
        </div>
    </div>

    <div class="mt-5">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Author Name</th>
                <th>Posted By</th>
            </tr>

            </thead>
            <tbody>
            <c:forEach var="book" items="${books}">
                <tr>
                    <td><c:out value="${book.id}"/></td>
                    <td><a href="/books/${book.id}"><c:out value="${book.name}"/></a></td>
                    <td><c:out value="${book.author}"/></td>
                    <td><c:out value="${book.user.userName}"/></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
