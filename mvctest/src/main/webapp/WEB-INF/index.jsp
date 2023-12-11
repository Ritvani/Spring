<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07-Dec-23
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Art</title>
</head>
<body>
<c:forEach var = "art" items = "${arts}">
    <h1> <c:out value = "${art.getName()}"></c:out> Title</h1>
    <h1> <c:out value = "${art.getDescription()}"></c:out> Description</h1>
</c:forEach>
</body>
</html>
