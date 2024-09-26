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
	<form:form method="post" action="/eBiz/updateStudent">
		<table style="margin: auto; text-align: left;">
			<tbody>
				<tr>
					<td><form:label path="id">Id</form:label></td>
					<td><form:input path="id" readonly="true"/></td>
				</tr>
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
					<td><input type="submit" value="修改" /></td>
				</tr>
			</tbody>
		</table>
	</form:form>
</body>
</html>
















