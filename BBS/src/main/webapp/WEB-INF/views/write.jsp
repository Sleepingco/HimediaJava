<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>detail View (편집할때는 form view)</title>
<style>
table{
	width:80%;
	margin-left: auto;
  	margin-right: auto;
}

table {
	border-collapse:collapse;
	width: 75%
}
table th{
	background-color:black;color:yellow;
	border:1px solid yellow
}
table td{
	border:1px solid black
}
</style>
</head>
<body>
<h1  style=text-align:center>게시물 작성</h1>
<form method="post" action="/insert" id=frmInsert name=frmInsert>
<table>  <!-- ${bpost.seqno}표현언어로 jsp내부 장착이다 -->

<tr><td>제목</td><td><input type= text name=title id=title size=64 maxlength=128></td></tr>
<tr><td>내용</td><td><textarea rows=10 cols=64 name=content id=content></textarea></td></tr>
<%-- <tr><td>작성자</td><td>${bpost.writer}</td></tr>
<tr><td>조회수</td><td>${bpost.hit}</td></tr>
<tr><td>작성시간</td><td>${bpost.created}</td></tr>
<tr><td>수정시간</td><td>${bpost.updated}</td></tr> --%>
<tr><td><a href="/">목록으로</a></td>
<td style='text-align:right'>
	<input type=submit id=btnSubmit name=btnSubmit value='작성완료'>&nbsp;&nbsp;	
</td>
<!-- <td style='text-align:right'><a href="/write">글쓰기</a>&nbsp;&nbsp;<button id=btnDelete>삭제</button></td> -->
</tr>
</table>
</form>
</body>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script>
$(document)
.on('submit','#frmInsert',function(){
	if($('#title').val()==''){
		alert('제목을 입력하시오'); return false;
	}
	if($('#content').val()==''){
		alert('게시물을 입력하시오'); return false;
	}
})
</script>
</html>