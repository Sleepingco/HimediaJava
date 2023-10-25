<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SignOn</title>
</head>
<body>
<table id=tblSignon>
<tr>
	<td>로긴아이디</td><td><input type=text id=userid></td>
</tr>
<tr>
	<td>비밀번호</td><td><input type=password id=passcode></td>
</tr>
<tr>
	<td colspan=2 align=center>
		<input type=button id=btnSend value='SignOn'>
	</td>
</tr>
</table>
</body>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script>
$(document)
.on('click','#btnSend',function(){
	$.post('/signon',{userid:$('#userid').val(), pwd:$('#passcode').val()},
		function(data){
			$('#btnSend').val(data);
		}, 'text'/* <-텍스트형식으로저장 */);
	return false;
})
</script>
</html>