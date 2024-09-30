<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../resources/jsp/errorMsgs.jsp" />
	<% 
	int remains = (int)session.getAttribute("remains");
	int range = (int)session.getAttribute("range");
	%>
	<form action="GameController" method="post">
		<table>
			<tbody>
			<tr><td>數字範圍 1 ~ <%= range %></td></tr>
			<tr><td>剩餘 <%= remains %> 次</td></tr>
			<tr><td><input type="number" name="guess" value=""/></td></tr>
			<tr><td><input type="submit" value="送出"/></td></tr>
			</tbody>
		</table>
	</form>
	<jsp:include page="../resources/jsp/footer.jsp" />
</body>
</html>