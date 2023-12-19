<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 19-Dec-23
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<html>
<head>
    <title>New Dojo</title>
</head>
<body>
<div>
    <form:form action="/dojos/new" method="post" modelAttribute="dojos">
        <form:label path="name">Name:</form:label>
        <form:input type="text" path="name"></form:input>
        <form:button>Create</form:button>
    </form:form>
</div>
</body>
</html>
