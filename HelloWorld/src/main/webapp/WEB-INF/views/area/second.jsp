<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Second</title>
</head>
<body>
<%
out.print("second Page<br>");
out.print("페이지 변수:속성"+pageContext.getAttribute("name")+"<br>");
out.print("Request 변수:"+request.getAttribute("name")+"<br>");
out.print("Session 변수:"+session.getAttribute("name")+"<br>");
out.print("Application 변수:"+application.getAttribute("name"));
%>
<a href="/third">세번째 페이지로 이동</a>
</body>
</html>