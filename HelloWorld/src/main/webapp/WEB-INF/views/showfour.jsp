<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>show four</title>
</head>
<body>
<% //<-스크립틀리
	
	float nx = Float.parseFloat(request.getParameter("x"));
	float ny = Float.parseFloat(request.getParameter("y"));
	if(nx<0||ny<0){
		out.print("더하기:"+"("+nx+")"+"+"+"("+ny+")"+"="+(nx+ny)+"<br>");
		out.print("빼기:"+"("+nx+")"+"-"+"("+ny+")"+"="+(nx-ny)+"<br>");
		out.print("곱하기:"+"("+nx+")"+"x"+"("+ny+")"+"="+(nx*ny)+"<br>");
		out.print("나누기:"+"("+nx+")"+"&divide;"+"("+ny+")"+"="+(nx/ny)+"<br>");
	}else{
		out.print("더하기:"+nx+"+"+ny+"="+(nx+ny)+"<br>");
		out.print("빼기:"+nx+"-"+ny+"="+(nx-ny)+"<br>");
		out.print("곱하기:"+nx+"x"+ny+"="+(nx*ny)+"<br>");
		out.print("나누기:"+nx+"&divide;"+ny+"="+(nx/ny)+"<br>");
	}
%>
이렇게 출력도 가능:<%=nx %>+<%=ny %>=<%=nx+ny %>
<%="더하기:"+nx+"+"+ny+"="+(nx+ny)+"<br>" %>
<%="빼기:"+nx+"-"+ny+"="+(nx-ny)+"<br>" %>
<%="곱하기:"+nx+"x"+ny+"="+(nx*ny)+"<br>" %>
<%="나누기:"+nx+"&divide;"+ny+"="+(nx/ny)+"<br>" %>

</body>
</html>