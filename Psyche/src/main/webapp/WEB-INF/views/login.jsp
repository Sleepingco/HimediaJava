<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<form method="post" action="/dologin">
<table align="center">
<tr><td>로그인아이디:</td><td> <input type=text name=loginid><br></td></tr>
<tr><td>비밀번호:</td><td> <input type=password name=pwd><br></td></tr>
<tr><td align="center" colspan=2>
	<input type=submit id=btnSubmit value="로그인">&nbsp;
	<a href='/'>홈으로</a>
</td></tr>
</table>
</form>
</body>
</html>