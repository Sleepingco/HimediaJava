<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<!-- Command Class이용
<form id=frmlogin method="post" action="/dologin2">
로그인아이디: <input type=text name="userid" id="userid"><br>
비밀번호: <input type=password name="passcode" id="passcode"><br>
<input type=submit value="로그인"> -->
<br>
Pathvariable 이용

로그인아이디: <input type=text name="userid" id="userid"><br>
비밀번호: <input type=password name="passcode" id="passcode"><br>
<input type=button id=btnSubmit value='로그인'> &nbsp;  
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script>
$(document)
.on('click','#btnSubmit',function(){
	document.location="/Pathlogin/"+$('#userid').val()+"/"+$("#passcode").val();
	return true;
})
</script>
</body>
</html>