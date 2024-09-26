<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello </title>
<link href="<%= request.getContextPath()%>/style/mySStyle.css" rel="stylesheet">
</head>
<body>
	<h1>${message}</h1>
	<p>${time}</p>
	
	<p><a href="<%= request.getContextPath() %>/index.jsp">home</a></p>
</body>
</html>