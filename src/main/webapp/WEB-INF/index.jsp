<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Demo JSP</title>
    </head>
<body>
	<h1>Welcome, <c:out value="${user}"/> </h1>
	<h1>Hey, let's test this out!</h1>
	<a href="/songs">Checkout my playlist!</a>
</body>
</html>