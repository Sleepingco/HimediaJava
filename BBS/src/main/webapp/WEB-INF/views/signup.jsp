<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<body>
<form id=frmSign method="post" action="doSign">
<table id=tblSign>
<tr>
	<td>로긴아이디</td><td><input type=text id=userid name="id" required></td>
</tr>
<tr>
	<td>비밀번호</td><td><input type=password id=passcode name="pw" required></td>
</tr>
<tr>
	<td>비밀번호 확인</td><td><input type=password id=passcode1 required></td>
</tr>
<tr>
	<td colspan=2 align=center>
		<input type=submit id=btnSign name=btnSign value='회원가입'>&nbsp;&nbsp;
		<input type=reset id=btnReset name=btnReset value='비우기'>&nbsp;&nbsp;
	</td>
</tr>
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
		alert("이미있는 아이디 입니다");return false;
	}
	console.log(fl)
})
.on('submit','#frmSign',function(){
	let id=$('#userid').val();
	let pw=$('#passcode').val();
	if(id==''){
		alert('uesrid가 없습니다'); return false;
	}
	if(pw==''){
		alert('비밀번호가 없습니다')
	}
	let pwd = $('#passcode').val()
	let pwd1 = $('#passcode1').val()
	if(pwd!=pwd1){
		alert("비밀번호 확인이 다릅니다");return false;
	}
});
</script>
</html>