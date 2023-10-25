<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원정보</title>
</head>
<jsp:include page="header.jsp" />
<body>
<%-- <!-- client가 서버에 요청함 아파치가 이름 톰캣에 요청함 컨트롤러를 가지고 있는 톰캣이 하드에서 파일을 찾을 톰캣이 JSP파일을 계산해서 순수한 html파일로 아파치한테 전달 아파치는 순수 html을 클라이언트에게 보내줌 이를 화면에 띄움 -->
<% %> <!--톰캣이 해석해줌  -->
<%
	String id =request.getParameter("userid");
	String pw =request.getParameter("passcode1");
	String name =request.getParameter("name");
	String bday =request.getParameter("birthday");
	String g =request.getParameter("gender");
	String ph =request.getParameter("mobile");
	
	
	out.print("아이디: "+id+"<br>");
	out.print("비번: "+pw+"<br>");
	out.print("이름: "+name+"<br>");
	out.print("생일: "+bday+"<br>");
	out.print("성별: "+g+"<br>");
	out.print("번호: "+ph+"<br>");
	
%>
<br><br><br>
컨텍스트패스 : <%=request.getContextPath() %><br>
요청방식 : <%=request.getMethod() %><br>
요청한URL : <%=request.getRequestURL() %><br>
요청한 URI : <%=request.getRequestURI() %><br>
서버의 이름 : <%=request.getServerName() %><br>
프로토콜 : <%=request.getProtocol() %><br><br><br>
GetParameterNames :<br>
<%
	Enumeration <String> e=request.getParameterNames();
	while(e.hasMoreElements()){
		String pname = e.nextElement();
		out.print(pname+"<br>");
	}
%>
<br><br><br>
아이디: <%=request.getParameter("userid")+"<br>" %>
비번: <%=request.getParameter("passcode1")+"<br>" %>
이름: <%=request.getParameter("name")+"<br>" %>
생일: <%=request.getParameter("birthday")+"<br>" %>
성별: <%=request.getParameter("gender")+"<br>" %>
전번: <%=request.getParameter("mobile")+"<br>" %>
<br><br><br>
interest: 
<% 
	String sItem="";
	String items[]=request.getParameterValues("interest");
	for(String item : items){
		if(!sItem.equals("")) sItem+=",";
		sItem+=item;
	}
	out.print(sItem);
%>
<br>
region: 
<% 
	String sRegion="";
	String regions[]=request.getParameterValues("region");
	if(regions==null){
		response.sendRedirect("http://www.amazon.com");// JAVACODE
		//* document.location="www.amazon.com" // JSCODE */
	}else{
		for(String region : regions){
			if(!sRegion.equals("")) sRegion+=",";
			sRegion+=region;
		}
		out.print(sRegion);
	}
%>

<br><br><br>

아이디: ${login}<br>
비번: ${pwd}<br>
이름: ${nme}<br>
생일: ${bday}<br>
성별: ${gender}<br>
전번: ${mb}<br>
관심: ${interest}<br>
지역: ${region}<br>
<br><br><br> --%>

아이디: ${user_id}<br>
비번: ${passcode}<br>
이름: ${name}<br>
생일: ${birthday}<br>
성별: ${gender}<br>
전번: ${mobile}<br>
<%-- 관심: <c:forEach var="item" items="${member.interest}"> --%>
<%-- 		${item}, --%>
<%-- 	</c:forEach> --%>
<!-- <br> -->
<%-- 지역: <c:forEach var="region" items="${member.region}"> --%>
<%-- 		${region}, --%>
<%-- 	</c:forEach> --%>
<!-- <br><br><br> -->
<%-- <% --%>
// 	if(request.getParameter("gender").equals("male")){ 
<%-- %> --%>
<!-- 	남성:<a href='http://amazon.com'>아마존으로 이동</a>  -->
<%-- <% --%>
// } else if(request.getParameter("gender").equals("female")){ 
<%-- %> --%>
<!-- 	여성:<a href='http://instagram.com'>인스타로 이동</a> -->
<%-- <%} %> --%>
</body>
</html>