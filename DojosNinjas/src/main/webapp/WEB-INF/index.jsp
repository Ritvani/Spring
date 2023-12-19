<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 18-Dec-23
  Time: 17:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page isErrorPage="true" %>
<html>
<head>
    <title>Dojos & Ninjas</title>
</head>
<body>
<h1>Dojos & Ninjas</h1>
<div>
    <c:forEach var="dojo" items="${dojos}">
        <p><a href="/dojos/${dojo.id}"><c:out value="${dojo.name}"></c:out></a></p>
    </c:forEach>
</div>
<div>
    <p><a href="/dojos/new">Create New Dojo</a></p>
    <p><a href="/ninjas/new">Create New Ninja</a></p>
</div>

</body>
</html>
