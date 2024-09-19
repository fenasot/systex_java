<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error/error.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%! int a = 100;%>>
	<% int a = 500; %>
	a = <%= a %> <br/>
	Current Time is : <%= SimpleDateFormat.getInstance().format(new Date()) %>
	<!-- Html Comment -->
	<%//java single line comment %>
	<%--JSP Comment --%>
	User-Agent: <%= request.getHeader("User-Agent") %> <br/>
	User-Agent: <% out.println(request.getHeader("User-Agent")); %>
	
	
</body>
</html>