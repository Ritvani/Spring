<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 23-Dec-23
  Time: 14:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Book Details</title>
</head>
<body>
<h1>${book.name}</h1>
<a href="/dashboard">Back to the shelves</a>
<c:choose>
    <c:when test="${book.user.equals(user)}">
        <p>${book.user.userName} read ${book.name} by ${book.author}</p>
    </c:when>
    <c:otherwise>
        <p>${book.user.userName} read ${book.name} by ${book.author}</p>
    </c:otherwise>
</c:choose>
<p>Here are ${book.user.userName}'s thoughts:</p>
<p>${book.thoughts}</p>

<div>
    <c:if test="${book.user.equals(user)}">
        <a href="/books/${book.id}/edit">Edit</a>
        <form:form action="/books/${book.id}/delete" method="post">
            <button>Delete</button>
        </form:form>
    </c:if>
</div>
</body>
</html>
