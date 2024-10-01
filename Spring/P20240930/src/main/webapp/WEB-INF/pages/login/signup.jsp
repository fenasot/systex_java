<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登入頁面</title>
<jsp:include page="/templates/header.jsp"></jsp:include>
</head>
<body>
	<form method="post" action="signup">
		<table class="tableset">
			<thead>
				<tr><th>${ requestScope.errorMsg }</th></tr>
			</thead>
			<tbody>
				<tr>
					<td>帳號:</td>
					<td><input class="form-control" name="acc" value="${ requestScope.acc }"/></td>
				</tr>
				<tr>
					<td>密碼:</td>
					<td><input class="form-control" name="pwd" value="" type="password"/></td>
				</tr>
				<tr>
					<td></td>
					<td><input class="btn btn-primary" type="submit" value="建立" /></td>
				</tr>
			</tbody>
		</table>
	</form>
	<jsp:include page="/templates/footer.jsp"></jsp:include>
</body>
</html>