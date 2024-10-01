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
<div class="w-100 h-100">
  <div class="position-absolute top-50 start-50">
	<div class="container">
	  	<form method="post" action="login">
			<table class="tableset">
				<thead>
					<tr><th>${ requestScope.errorMsg }</th></tr>
				</thead>
				<tbody>
					<tr>
						<td>帳號:</td>
						<td><input class="form-control" name="acc" value=""/></td>
					</tr>
					<tr>
						<td>密碼:</td>
						<td><input class="form-control" name="pwd" value="" type="password"/></td>
					</tr>
					<tr>
						<td><a href="login/signup">建立帳號</a></td>
						<td><input class="btn btn-primary" type="submit" value="登入" /></td>
					</tr>
				</tbody>
			</table>
		</form>
	</div>
  </div>
</div>
	<jsp:include page="/templates/footer.jsp"></jsp:include>
</body>
</html>