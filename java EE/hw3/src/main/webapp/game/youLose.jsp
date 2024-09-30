<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% int luckyNumber = (int)request.getAttribute("luckyNumber"); %>
	<p>你輸了!!正確數字是 <%= luckyNumber %></p>
	<jsp:include page="../resources/jsp/footer.jsp" />
</body>
</html>