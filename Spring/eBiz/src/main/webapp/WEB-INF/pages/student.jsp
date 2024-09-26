<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta charset="UTF-8">
<title>spring mvc form handling</title>
<link href="<%= request.getContextPath() %>/style/myStyle.css" rel="stylesheet">
</head>
<body>
	<h2>student information</h2>
	<form:form method="post" action="/eBiz/addStudent">
		<table class="tableset">
			<tbody>
				<tr>
					<td><form:label path="name">Name</form:label></td>
					<td><form:input path="name"/></td>
				</tr>
				<tr>
					<td><form:label path="age">Age</form:label></td>
					<td><form:input path="age"/></td>
				</tr>
				<tr>
					<td><form:label path="email">email</form:label></td>
					<td><form:input path="email"/></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="新增" /></td>
				</tr>
			</tbody>
		</table>
	</form:form>
</body>
</html>
















