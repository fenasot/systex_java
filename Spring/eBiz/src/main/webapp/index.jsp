<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome To My Spring Boot Playground</title>
<link href="<%= request.getContextPath() %>/style/myStyke,css" rel="stylesheer"></link>
</head>
<body>
	<h1>Welcome To My Spring Boot Playground</h1>
	<p>Current Time is : <%= SimpleDateFormat.getInstance().format(new Date()) %>
</body>
</html>