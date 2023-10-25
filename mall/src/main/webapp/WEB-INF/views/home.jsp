<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>책 쇼핑몰</title>
</head>
<style>
table#tblbook{
	border-collapse:collapse;
	width:1000px;
	margin-left:auto;
	margin-right:auto;
}
table th{
	background-color:green; color:yellow;
	border:1px solid red;
}
table td{
	border:1px solid black;
}
</style>
<body>
<table>
<tr><td>
	<a href="/">홈으로</a>
</td></tr>
</table>
<table style="margin-left:auto;">
<tr><td>

<!-- 로그인시 관리자 권한 체크 -->
	
<c:if test="${empty userid}">
    <a href="/login">로그인</a>
    <a href="/signup">회원가입</a>
</c:if>
<c:if test="${not empty userid}">
	<c:if test="${not empty sessionScope.admin}">
	    <c:choose>
	        <c:when test="${sessionScope.admin eq 1}">
	            ${userid}<a href="/logout">로그아웃</a>
	            <a href="/adminPage">회원관리</a>
	            <p>Admin: ${sessionScope.admin}</p>
	        </c:when>
	        <c:when test="${sessionScope.admin eq 0}">
	            ${userid}<a href="/logout">로그아웃</a>
	            <p>Admin: ${sessionScope.admin}</p>
	        </c:when>
	    </c:choose>
	</c:if>
</c:if>

</td></tr>
</table>
<h1 style="text-align:center;">뭘 팔지는 모르겠지만 아무튼 만드는 쇼핑몰</h1>
<table>
<tr>
<table id="tblbook">
<thead>
<tr><th><a href="/korBook/korbook" style=color:white;>국내도서</a></th><th>서양도서</th><th>일본도서</th><tr>
</thead>
<tbody>
</tbody>
</table>
</tr>
</table>
<table style="text-align:center">

</table>
</body>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script>
	console.log(${session.admin});
</script>
</html>