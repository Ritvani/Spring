<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 14-Dec-23
  Time: 14:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Expense Details</title>
</head>
<body>
<a href="/expenses/">Go Back</a>
<h1>>Expense Details:</h1>
<h2>>Expense name: <c:out value="${expense.name}"></c:out></h2>
<h2>>Expense vendor: <c:out value="${expense.vendor}"></c:out></h2>
<h2>>Expense amount: <c:out value="${expense.amount}"></c:out></h2>
</body>
</html>
