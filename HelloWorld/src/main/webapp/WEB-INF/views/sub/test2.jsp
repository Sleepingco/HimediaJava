<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TestTwo</title>

</head>
<body>
<h1>Welcome to sub folder</h1>
<%! 
	/* String getPrime(int num){
		int cnt=0;
		String sum="";
		for(int i=2; i<=num; i++) {
			int j;
			for(j=2; j<=i-1; j++) {
				if(i%j==0) break; 
			} 
			if (i == j) {
				cnt++;
		        sum += i+",";
		        if(cnt>10){
		        	sum+="<br>";
		        	cnt=0;
		        }
	        }
		}return sum;
	} */
	String showTable(int m,int n){
		String Table="<table border=1;>";
		for(int i=0;i<m;i++){
			Table+="<tr>";
			for(int j=0;j<n;j++){
				Table+="<td style=width:60px;height:60px></td>";
			}Table+="</tr>";
		}Table+="</table>";
		return Table;
	}
%>
<%
	/* out.print(getPrime(1000)+"&nbsp"); */
	out.print(showTable(3,3));
	String id=request.getParameter("name");
	out.print("name="+id);
%>
</body>
</html>