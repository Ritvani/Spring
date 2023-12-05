<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 05-Dec-23
  Time: 17:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Fruits</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css"/>
</head>
<body>
<div class="container">
    <h1>Fruit Store</h1>
    <table>
        <tr class="content">
            <th>Name</th>
            <th>Price</th>
        </tr>
        <c:forEach var="fruit" items="${fruits}">
            <tr>
                <td><c:out value="${fruit.name}" /></td>
                <td><c:out value="${fruit.price}" /></td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>