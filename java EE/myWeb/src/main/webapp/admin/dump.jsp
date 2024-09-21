<%@page import="java.sql.Date"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="text-align: center;">
	<%= session.isNew() %><br>
	<%= session.getId() %><br>
	<%= new Date(session.getLastAccessedTime()) %><br>
	<%= new Date(session.getCreationTime()) %><br>
	<%= session.getMaxInactiveInterval() %><br>
	
	<p><img src="../images/wqeqwe.jpg"/></p>
	<table border="1" style="margin: auto;">
		<tbody>
			<% for(int i = 1; i <= 9; i++) { %>
			<tr>
				<% for(int j = 1; j <= 9; j++) { %>
				<td><%= i %> * <%= j %> = </td><td><%= i*j %></td>
				<% } %>
			</tr>
			<% } %>
		</tbody>
	</table>
	
	<table border="1" style="margin: auto;">
		<tbody>
			<thead><tr><th>Header Name</th><th>Header Value</th></tr></thead>
			<% request.setCharacterEncoding("utf-8"); %>
			<% Enumeration<String> headerNames = request.getHeaderNames(); %>
			<% while(headerNames.hasMoreElements()) { %>
				<% String headerName = headerNames.nextElement(); %>
				<% String headerValue = request.getHeader(headerName); %>
				<tr>
					<td> <%= headerName  %></td>
					<td> <%= headerValue %></td>
				</tr>
			<% } %>
		</tbody>
	</table>
	
	<h2>接收表單上傳資料</h2>
	<table id='tabletwo' border='1' style='margin: auto; width: 50%;'>
		<thead><tr><th>Name</th><th>Value</th></tr></thead>
			<tbody>
			<% Enumeration<String> getNames = request.getParameterNames(); %>
			<% while(getNames.hasMoreElements()) { %>
				<% String getName = getNames.nextElement(); %>
				<% String[] getValue = request.getParameterValues(getName); %>
				<% int count = 0; %>
				<% for(String i : getValue) { %>
					<tr>
						<td><%= getName %> [ <%= count  %> ] </td>
						<td> <%= i %></td>
					</tr>
					<% count++; %>
				<% } %>
			<% } %>
		</tbody>
	</table>	
</body>
</html>