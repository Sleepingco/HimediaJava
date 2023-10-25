<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link href="../css/buyment.css" rel="stylesheet"/>
<meta charset="UTF-8">
    <title>책 구매</title>
</head>
<body>
    <header class="header">
        <h1>책 구매</h1>
    </header>
    <div class="container">
        <div class="login-info">
            <c:if test="${userid == ''}">
                <a href="/login">로그인</a> &nbsp;
                <a href="/signup">회원가입</a>
            </c:if>
            <c:if test="${userid != ''}">
                ${userid}님 <a href="/logout">로그아웃</a>
            </c:if>
        </div>
        <div class="book-details">
            <img class="book-image" src="../img/${book.img}.jpg" alt="책 이미지">
            <div class="book-info">
                <div class="book-title">${book.name}</div>
                <div class="book-author">${book.author}</div>
                <div class="book-price">${book.price} 원</div>
            </div>
        </div>
        <div class="purchase-button">
            <a href="/korBook/payment?seq=${book.seq}" class="btn-buy">구매 결정</a>
        </div>
    </div>
</body>
</html>
