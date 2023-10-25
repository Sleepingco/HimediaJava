<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<link href="../css/list.css" rel="stylesheet"/>
<meta charset="UTF-8">
<title>국내 카테고리</title>
</head>
<body>
<div class="container">
  <div class="header">
    <h1>국내 도서 리스트</h1>
  </div>
  <div class="links">
    <c:if test="${userid!= ''}">
      <a href="/korBook/addBook">책 추가</a>
    </c:if>
    <c:choose>
      <c:when test="${userid == ''}">
        <a href="/login">로그인</a>
        <a href="/signup">회원가입</a>
      </c:when>
      <c:otherwise>
        <span>${userid}님</span>
        &nbsp;&nbsp;
        <a href="/logout">로그아웃</a>
      </c:otherwise>
    </c:choose>
  </div>
  <div class="categories">
    <table>
      <tr>
      	<td><a href="/korBook/korbook">전체보기</a></td>
      	<td>베스트셀러</td>
        <td>신상품</td>
        <td><a href="/korBook/kornovel">소설</a></td>
        <td><a href="/korBook/korhistory">역사</a></td>
        <td><a href="/korBook/koreconomy">경제/경영</a></td>
        <td><a href="/korBook/korpolitics">정치</a></td>
        <td><a href="/korBook/korcomic">만화</a></td>
      </tr>
    </table>
  </div>
  <div class="table-container">
    <table id="korBook">
      <thead>
        <tr>
          <th>상품번호</th>
          <th>장르</th>
          <th>작가</th>
          <th>
            <select id="optSort" name="optSort" style="width:200px">
              <option value="popular">인기순</option>
              <option value="sales">판매순</option>
              <option value="newest">최신순</option>
              <option value="highprice">높은가격순</option>
              <option value="lowprice">낮은가격순</option>
            </select>
            <input type="submit" value="검색">
          </th>
        </tr>
      </thead>
      <tbody style="text-align:center">
        <c:forEach items="${alHistory}" var="alist">
          <tr>
            <td>${alist.seq}</td>
            <td>${alist.genre}</td>
            <td>${alist.author}</td>
            <td colspan="5">
              <img src="../img/${alist.img}.jpg" alt="이미지"><br>
              ${alist.name} ${alist.price}원
            </td>
          </tr>
        </c:forEach>
        <tr><td colspan="6">${pagestr}</td></tr>
      </tbody>
    </table>
  </div>
</div>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script>
$(document).ready(function() {
    $('#korBook tbody').on('click', 'tr img', function() {
        var seqno = $(this).closest('tr').find('td:eq(0)').text();
        var genre = $(this).closest('tr').find('td:eq(1)').text();
        var url = '/korBook/detail?seqno=' + seqno + '&genre=' + genre;
        document.location = url;
        return false;
    });
})
$(document)
.on("click","#btnbuy",function(){
	let seqno = $(this).closest('tr').find('td:eq(0)').text();
    let url = '/korBook/buyment?seqno=' + seqno
    document.location = url;
    return false;

})
</script>
</body>