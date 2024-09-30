<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>遊樂場</title>
<jsp:include page="/templates/header.jsp"></jsp:include>
</head>
<body>
	<h1>Welcome To My Spring Boot Playground</h1>
	<p>Current Time is : <%= SimpleDateFormat.getInstance().format(new Date()) %>
	
	<p><a href="<%= request.getContextPath() %>/lottery">大樂透</a></p>
	<jsp:include page="/templates/footer.jsp"></jsp:include>
</body>
</html>