<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="css/home.css" rel="stylesheet" />
<title>Listview</title>
</head>

<body>
<h1>자유 게시판</h1>
<table>
<tr><td style='text-align:right;'>
${loginstr}
</td></tr>
</table>
<table id=tblBoard >
<thead>
	<tr><th>게시물번호</th><th>글제목</th><th>작성자</th><th>조회수</th><th>작성시각</th><th>수정시각</th></tr>
</thead>
<tbody id=tbl>
<c:forEach items="${bpost}" var="bpost">
	<%-- <tr><td><a href="view?seqno=${bpost.seqno}">${bpost.seqno}</a></td> --%>
	<td>${bpost.seqno}</td>
	<td>${bpost.title}</td><td>${bpost.writer}</td>
	<td>${bpost.hit}</td><td>${bpost.created}</td><td>${bpost.updated}</td></tr>

</c:forEach>
</tbody>
</table>
<table style='margin-right:auto;margin-left:auto'>
<tr>
	<%--페이지 다음 이전 버튼 <td style='text-algin:left'>${prev}&nbsp;${next}</td> --%>
	<td>${pagestr}</td>
	<td style='text-align:right'>
		${write}
	</td>
</tr>
</table>
</body>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script src="js/home.js">
</script>
</html>