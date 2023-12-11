<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 06-Dec-23
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- New line below to use the JSP Standard Tag Library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Form Result</title>
</head>
<body>
<div>
    <h2>Send on Omikuji!</h2>
    <span>${omikujiForm}</span><br/>
    <a href="/omikuji">Go Back</a>
</div>
</body>
</html>
