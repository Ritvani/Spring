<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 14-Dec-23
  Time: 13:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Edit Expense</title>
</head>
<body>
<div>
    <a href="/expenses">Go Back</a>
    <h1>Create New Expense</h1>
    <form:form action="/expenses/edit/${expense.id}" method="put" modelAttribute="expense">
        <div>
            <form:label path="name">Name:</form:label>
            <form:input path="name" type="text" placeholder="Enter name of expense"></form:input>
            <form:errors path="name"></form:errors>
        </div>
        <div>
            <form:label path="vendor">Vendor:</form:label>
            <form:input path="vendor" type="text" placeholder="Enter vendor of expense"></form:input>
            <form:errors path="vendor"></form:errors>
        </div>
        <div>
            <form:label path="amount">Number:</form:label>
            <form:input path="amount" type="number" placeholder="Enter amount of expense"></form:input>
            <form:errors path="amount"></form:errors>
        </div>
        <button>Create</button>
    </form:form>
</div>
</body>
</html>
