<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- ID: ${login}<br>
PW: ${pwd}
 --%>
 // Command Class이용<br>
아이디: ${info.userid}<br>
비번: ${info.passcode}<br>
//project ->clean<br>
<br><br><br>
아이디: ${user_id}<br>
비번: ${passcode}<br>
</body>
</html>