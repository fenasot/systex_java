<%@page import="java.util.LinkedList"%>
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
	<form action="LotteryController" method="post">
		<table>
			<thead>
				<tr><td colspan="">大樂透彩號生成器</td></tr>
			</thead>
			<tbody>
				<tr><td>請輸入排除的數字(1~49)，每個數字請用,分隔，超過範圍或非整數將直接忽略。</td></tr>
				<tr><td>範例(1,10,5,36,18)</td></tr>
				<tr><td><input type="text" name="excludeNums" value="<%----%>"/></td></tr>
				<tr><td>請輸入欲生成的組數</td></tr>
				<tr><td><input type="number" name="times" value="<%----%>"/></td></tr>
				<tr><td><input type="submit" value="確認"/></td></tr>
			</tbody>
		</table>
	</form>
	<jsp:include page="../resources/jsp/footer.jsp" />
</body>
</html>