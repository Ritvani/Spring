<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 22-Dec-23
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Edit Book</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
          crossorigin="anonymous">
</head>
<body>
<a href="/dashboard">Go Back</a>
<div class="bg-light p-5">
    <form:form class="form d-flex flex-column gap-3" action="/books/${editBook.id}/update" method="post" modelAttribute="editBook">
        <div class="d-flex flex-column justify-content-center align-items-center gap-2">
            <form:errors path="name" class="errors text-danger"></form:errors>
            <form:label path="name">Title: </form:label>
            <form:input class="form-control" path="name" type="text"></form:input>
        </div>
        <div class="d-flex flex-column justify-content-center align-items-center gap-2">
            <form:errors path="author" class="errors text-danger"></form:errors>
            <form:label path="author">Author: </form:label>
            <form:input class="form-control" path="author" type="text"></form:input>
        </div>
        <div class="d-flex flex-column justify-content-center align-items-center gap-2">
            <form:errors path="thoughts" class="errors text-danger"></form:errors>
            <form:label path="thoughts">Your thoughts: </form:label>
            <form:input class="form-control" path="thoughts" type="text"></form:input>
        </div>
        <input class="w-50 btn btn-primary align-self-center" type="submit" value="Submit"/>
    </form:form>
</div>
</body>
</html>
