<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
</head>
<%@ include file="header.jsp" %>

<table>
<caption><h1>회원가입</h1></caption>
<tbody>
<tr><td>로그인아이디</td><td><input type=text name=userid id='userid' value="xaexal"></td></tr>
<tr><td>비밀번호</td><td><input type=password name=passcode1 id='passcode1'value="1234"></td></tr>
<tr><td>비밀번호확인</td><td><input type=password name=passcode2 id='passcode2'value="1234"></td></tr>
<tr><td>실명</td><td><input type=text name=name id='name'value="park"></td></tr>
<tr><td>생년월일</td><td><input type=date name=birthday id='birthday'value="2023-07-31"></td></tr>
<tr><td>성별</td><td><input type=radio name=gender id='male' value=male checked>남성
					<input type=radio name=gender id='female' value=female>여성</td></tr>
<tr><td>모바일번호</td><td><input type=text name=mobile id='mobile' value="5554444"></td></tr>
<tr><td>관심분야</td>
	<td><input type=checkbox name=interest value='economy' checked>economy
		<input type=checkbox name=interest value='society' checked>society
		<input type=checkbox name=interest value='culture' checked>culture<br>
		<input type=checkbox name=interest value='sports'>sports
		<input type=checkbox name=interest value='international'>international
		<input type=checkbox name=interest value='nature'>nature<br>
		<input type=checkbox name=interest value='space'>space
		<input type=checkbox name=interest value='environments'>environments
		<input type=checkbox name=interest value='others'>others
	</td>
</tr>
<tr><td>region</td>
	<td><select name=region size=4 multiple>
		<option value="ilsandonggu" selected>ilsandonggu</option>
		<option value="ilsanseogu">ilsanseogu</option>
		<option value="duckyangu">duckyanggu</option>
	</select>
<tr><td colspan=2 align=center>
	<input type=button id=btnSubmit value='가입'> &nbsp;  
	<%-- 정보가 request로 넘어감 받을때도 getrequest로 씀 request.setAttribute("adress","ILSAN"); 이렇게 보낼수도 있음--%>
	<input type=button id=btnReset value='비우기'>
	<a href="/signup">로그인</a>
</td></tr>
</tbody>
</table>

</body>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script>
/* <form id=frm은 submit이 발생한다 그러므로 이벤트를 처리할때 .on('submit','#frm' 으로 처리해야한다 */
/* <input type=submit id=btnsubmit은 click이 발생한다 그러므로 이벤트를 처리할때 .on('click','#btnsubmit' 으로 처리하고 
		document.location='/url/~';*/
$(document)
.on('click','#btnSubmit',function(){
	if($('#userid').val()==''||$('#userid').val()==null){
		alert("id값이 입력되지 않음");
		return false;
	}
	if($('#passcode1').val()==''||$('#passcode1').val()==null){
		alert("비번값이 입력되지 않음");
		return false;
	}
	if($('#passcode2').val()==''||$('#passcode2').val()==null){
		alert("비번확인값이 입력되지 않음");
		return false;
	}
	if($('#passcode2').val()!=$('#passcode1').val()){
		alert("비번과 비번확인값이 다름");
		return false;
	}
	if($('#name').val()==''||$('#name').val()==null){
		alert("이름이 입력되지 않음");
		return false;
	}
	if($('#birthday').val()==''||$('#birthday').val()==null){
		alert("생일이 입력되지 않음");
		return false;
	}
	if (!$("#male").is(':checked') && !$("#female").is(':checked')) {
	    alert('성별을 입력하세요');
	     return false;
	 }
	if($('#mobile').val()==''||$('#mobile').val()==null){
		alert("전번값이 입력되지 않음");
		return false;
	}
	document.location="/bemember/"+$('#userid').val()+"/"+$("#passcode1").val()+
	"/"+$("#name").val()+"/"+$("#birthday").val()+"/"+$("input[name=gender]").val()+
	"/"+$("#mobile").val();
	/* if($('#interest:selected').length<1){
		return false;
	}  */
	return true;
})
</script>

</html>