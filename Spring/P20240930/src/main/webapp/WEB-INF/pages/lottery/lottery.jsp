<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" action="/lottery">
		<table>
			<tbody>
				<tr>
					<td><form:label path="numbers">請輸入欲限制的數字，範圍為1~49，超出範圍將直接忽略，最多可限制42個數字，並用,分開，可能出現重複的結果，範例(3,5,9,6)</form:label></td>
					<td><form:input path="numbers"/></td>
				</tr>
				<tr>
					<td><form:label path="times"></form:label></td>
					<td><form:input path="times"></form:input></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="新增"/></td>
				</tr>
			</tbody>
		</table>
	</form:form>
</body>
</html>