<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TestOne</title>
</head>
<body>
<h1>Hello JSP World</h1>
<a href='testtwo?name=홍길동'>go to Sub Folder</a>
<!-- Scriptlet -->
<%
	String title="<h1>Les Miserable2</h1>";
	out.println(title);
	out.println("<h2>Les Miserable</h2>");
	out.println("<table border=1><tr><td style='width:50px;height:50px;'>Hello VN</td></tr></table>");
	/* for (int i=0; i<=10;i++){
		out.println(i+"<br>");
	} */
	for (int i=2; i<10;i++){
		for (int j=1; j<10;j++){
			out.print(i+"x"+j+"="+i*j+"<br>");
		}
	}
%>
<%!	//<!% 는 웹페이지가 실행될때 최초 한번만 실행됨 새로고침하면 유관순 누나가 나옴 WS가 리스타트하면 초기화됨
	/* String name="이순신 장군님";
	
	int showTotal(){
		int sum=0;
		for(int i=1;i<=100;i++){
			sum+=i;
		}
		return sum;
	} */
	
%>
<%
 	/* out.print(name+"<br>");
	name="유관순 누나";
	out.print("1+2+...+99+100 = "+showTotal()); */
%>
<!-- <p>Les Miserable</p>
<p>아파치는 클라이언트가 test1을 요청했을때 이를 톰캣에 불러오게하고 톰캣은 jsp파일을</p>
<p>톰캣은 하드 안에있는 jsp파일을 톰캣이 'jsp,c:,% %' 같은 태그를 처리해서 아파치에 html로 보내고 아파치는 그걸 요청한 클라이언트한테 보낸다</p>
<p>HTML/CSS/JS는 브라우저가 처리한다</p>
 --></body>
</html>