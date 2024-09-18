<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<script>
let a = document.getElementById('this_one');

a.style.height = "500 px;";
a.style.color = "#000000"
</script>

<link href="style/myStyle.css" rel="stylesheet" />

</head>
<body>
	<h1>Welcome To My Java EE Playground</h1>
	<p>Current Time is: <%= SimpleDateFormat.getInstance().format(new Date()) %></p>
	<p><a href="admin/Hello.aspx">Hello Servlet</a></p>
	<div id="this_one"> LOL</div>
</body>
</html>