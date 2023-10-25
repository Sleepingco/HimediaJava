<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First</title>
</head>
<body>
<%	//FrameWork:예를들어 웹페이지를 만들때 로그인이나 회원가입 같은 기능과 화면이 비슷하게 이루어져있어서 반복적으로 만들때 주로쓰는 기능과 screen을 모아놓은것이다
	//Library:같은종류에 함수,메소드를 묶어놓은것
	String name="staname";// == pageContext
	//페이지컨텍스트라는 내장객체에대가 name이라는 변수를 선언하고 그안에 page man이라고 값을 넣어준것 아래도 동일
	//웹페이지라 다르게 표현한거다
	pageContext.setAttribute("name","page man");//firstpage 내에서만 확인가능 
	request.setAttribute("name","request man");	//forward request하고 second에 전달하라하면 second에 값을 전달해서 읽을수있지만 second가 third에 값을 전달한다고 안하면 값을 third에서 값을 못읽음 전달만 가능
	session.setAttribute("name","sessing man");//session은 Application처럼 전체 전달이 가능하나 특별한세팅을 해서 값을 안받을수도있다 로그인후 웹브라우저를 끄거나 장시간 동작이 없거나 인터넷이 끊기면 로그인 세션정보를 지워서 자동으로 로그아웃됨 
	application.setAttribute("name","application man");//프로젝트전체에서 확인가능
	
	out.print("first Page<br>");
	out.print("페이지 변수:속성"+pageContext.getAttribute("name")+"<br>");
	out.print("Request 변수:"+request.getAttribute("name")+"<br>");
	out.print("Session 변수:"+session.getAttribute("name")+"<br>");
	out.print("Application 변수:"+application.getAttribute("name"));
	
	request.getRequestDispatcher("second.jsp").forward(request,response);
%>
</body>
</html>