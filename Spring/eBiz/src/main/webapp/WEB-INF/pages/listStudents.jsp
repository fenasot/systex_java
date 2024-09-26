<%@page import="com.systex.eBiz.model.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>spring mvc test</title>
<link href="<%= request.getContextPath() %>/style/myStyle.css" rel="stylesheet">
</head>
<body>
	<% String a = request.getContextPath(); %>
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Age</th>
				<th>Email</th>
				<th>Id</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
		<%
		List<Student> students = (List<Student>)request.getAttribute("students");
		for(Student student : students) { 
		%>
			<tr>
				<td><%= student.getName() %></td>
				<td><%= student.getAge() %></td>
				<td><%= student.getEmail() %></td>
				<td><%= student.getId() %></td>
				<td><a href="<%= a %>/updateStudent/<%= student.getId() %>">修改</a>
				<td><a href="<%= a %>/deleteStudent/<%= student.getId() %>">刪除</a>
			</tr>
		<% } %>
		</tbody>
	</table>
	<p><a href="<%= request.getContextPath() %>/index.jsp">go home</a></p>
</body>
</html>