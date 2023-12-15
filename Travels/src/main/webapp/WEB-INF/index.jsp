<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 14-Dec-23
  Time: 09:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Save Travels</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<table class="table table-striped">
    <thead>
    <tr>
        <th>Expenses</th>
        <th>Vendor</th>
        <th>Amount</th>
        <th>Actions</th>
    </tr>

    </thead>
    <tbody>
    <c:forEach var="expense" items="${expenses}">
        <tr>
            <td><a href="/expenses/${expense.id}"><c:out value="${expense.name}"></c:out></a></td>
            <td><c:out value="${expense.vendor}"></c:out></td>
            <td><c:out value="${expense.amount}"></c:out></td>
            <td><a href="/expenses/update/${expense.id}">edit</a> <a href="/expenses/delete/${expense.id}">delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<div>
    <h1>Create New Expense</h1>
    <form:form action="/create/expense" method="post" modelAttribute="expense">
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
