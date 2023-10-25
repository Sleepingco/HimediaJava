<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View</title>
</head>
<style>
table { border-collapse: collapse}
td,th{ border:1px solid blue}
th{color:yellow; background-color:black;}
</style>
<body>
<!-- 한명id만 찾음 -->
<%-- 사번: ${person.employee_id}<br>
이름: ${person.emp_name}<br>
급여: ${person.salary}<br>
매니저: ${person.manager}<br>
부서: ${person.department_name}<br> --%>
<table>
<thead>
	<tr>
		<th>사번</th><th>이름</th><th>연봉</th><th>매니저</th><th>부서명</th>
	</tr>
</thead>
<tbody>
<c:forEach var="emp" items="${person}"> <!-- ${person} == DTO -->
	<tr>
		<td>${emp.employee_id}</td>
		<td>${emp.emp_name}</td>
		<td>${emp.salary}</td>
		<td>${emp.manager}</td>
		<td>${emp.department_name}</td>
	</tr>
</c:forEach>
</tbody>
</table>
</body>
</html>