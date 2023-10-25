<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link href="../css/detail.css" rel="stylesheet"/>
<meta charset="UTF-8">
<title>책 상세 정보</title>
</head>
<body>
<table>
<tr><td>
	<a href="/">홈으로</a>
</td></tr>
</table>
<table style="margin-left:auto;">
<tr><td>
<c:if test="${userid == ''}">
	<a href="/login" style="text-align:center;">로그인</a>&nbsp;&nbsp;
	<a href="/signup" style="text-align:center;">회원가입</a>
</c:if>
<c:if test="${userid != ''}">
	${userid}<a href="/logout">로그아웃</a>
</c:if>
</td></tr>
</table>
    <header>
        <h1>책 상세 정보</h1>
    </header>
    <div class="container">
    	<div><a href="/">이전</a></div>
        <img class="book-image" src="../img/${book.img}.jpg" alt="책 이미지">
        <div class="book-details">
            <div class="book-title">${book.name}</div>
            <div class="book-author">${book.author}</div>
            <div class="book-price">${book.price} 원</div>
            <br><br>
            <c:if test="${userid == ''}">
            	<div>구매를 하시려면 로그인이 필요합니다.</div>
            </c:if>
           	<c:if test="${userid != ''}">
            	<div><input type=button id=btnbuy value="구매"></div>
            </c:if>
            <br><br><br>

        	<div>
        	<c:if test="${book.seq == 3}">
			    <c:forEach var="i" begin="1" end="21">
			        <img src="../img/상품정보/${book.prodinfo}${i}.jpg">
			    </c:forEach>
			</c:if>
		        <img src="../img/상품정보/${book.prodinfo}.jpg">
			</div>
        </div>
    </div>
</body>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script>
$(document)
.on("click","#btnbuy",function(){
    var seq = "${book.seq}";
    document.location = "/korBook/buyment?seqno=" + seq;
});

</script>
</html>