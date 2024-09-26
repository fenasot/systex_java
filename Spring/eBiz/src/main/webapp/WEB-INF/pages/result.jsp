<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>spring mvc form handing</title>
</head>
<body>

	<h2>submitted student information</h2>
	<table>
		<tbody>
			<tr>
				<td>Name</td>
				<td>${ student.name }</td>
			</tr>
			<tr>
				<td>Age</td>
				<td>${ student.age }</td>
			</tr>
			<tr>
				<td>Email</td>
				<td>${ student.email }</td>
			</tr>
			<tr>
				<td>id</td>
				<td>${ student.id }</td>
			</tr>
		</tbody>
	</table>
	
	<p><a href="<%= request.getContextPath() %>/index.jsp">go home</a></p>
</body>
</html>