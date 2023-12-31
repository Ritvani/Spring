<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 19-Dec-23
  Time: 14:54
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>New Ninja</title>
</head>
<body>
<div style="margin-top:10px">
    <h1>New Ninja</h1>
    <form:form action="/ninjas/new" method="post" modelAttribute="ninjas">
        <div style="margin-top:10px">
        <form:label path="dojo">Dojo</form:label>
        <form:select path="dojo">
            <c:forEach items="${dojos}" var="dojo">
                <option value="${dojo.id}">
                        ${dojo.name}
                </option>
            </c:forEach>
        </form:select>
        </div>
        <div style="margin-top:10px">
            <form:label path="first_name">First Name:</form:label>
            <form:input type="text" path="first_name"></form:input>
        </div>
        <div style="margin-top:10px">
            <form:label path="last_name">Last Name:</form:label>
            <form:input type="text" path="last_name"></form:input>
        </div>
        <div style="margin-top:10px">
            <form:label path="age">Age:</form:label>
            <form:input type="number" path="age"></form:input>
        </div>
        <form:button style="margin-top:10px">Create</form:button>
    </form:form>
</div>
</body>
</html>
