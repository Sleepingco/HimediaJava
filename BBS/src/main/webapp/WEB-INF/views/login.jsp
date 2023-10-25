<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
</head>
<body>
<form id=frmLogon method="post" action="doLogin">
<table>
<tr><td>아이디</td><td><input type=text name=id id=id></td></tr>
<tr><td>비밀번호</td><td><input type=text name=pw id=pw></td></tr>
<tr><td colspan=2 align=center>
	<input type=submit id=btnSubmit name=btnSubmit value='로그인'>&nbsp;&nbsp;
	<input type=reset id=btnReset name=btnReset value='비우기'>&nbsp;&nbsp;
</td></tr>
</table>
<input type="hidden" value='${fail}' readonly id=fail>
</form>
</body>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script>
$(document)
.ready(function(){
	let fl=$('#fail').val();
	if(fl=='-1'){
		alert("아이디 혹은 비밀번호가 틀렸습니다");return false;
	}
	console.log(fl)
})
.on('click','#btnSubmit',function(){
	let id=$('#id').val();
	let pw=$('#pw').val();
	if(id==''){
		alert('아이디를 입력하세요'); return false;
	}
	if(pw==''){
		alert('비밀번호가 없습니다'); return false;
	}
});
</script>
</html>