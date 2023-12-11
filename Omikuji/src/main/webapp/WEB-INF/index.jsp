<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 06-Dec-23
  Time: 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Omikuji</title>
</head>
<body>
<div class="container">
    <h1>Omikuji Form</h1>
    <form:form action="/send" method="post" modelAttribute="omikuji">
        <form:label path="number">Pick any number from 5 to 25</form:label><br/>
        <form:select path="number" items="${numberList}" /><br/>

        <form:label path="city">Enter the name of any city</form:label><br/>
        <form:input path="city"/><br/>

        <form:label path="person">Enter the name of any real person</form:label><br/>
        <form:input path="person"/><br/>

        <form:label path="hobby">Enter professional endeavor or hobby</form:label><br/>
        <form:input path="hobby"/><br/>

        <form:label path="thing">Enter any type of living thing</form:label><br/>
        <form:input path="thing"/><br/>

        <form:label path="something">Say something nice to someone</form:label><br/>
        <form:textarea path="something"/><br/>

        <span>Send and show a friend<span><br/>
        <form:button>Send</form:button>
    </form:form>
</div>
</body>
</html>
