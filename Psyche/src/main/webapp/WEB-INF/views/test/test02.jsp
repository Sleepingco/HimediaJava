<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="/test02-1">
<table id=tbl>
<tr><td>x<input type=text name=num1 id=num1></td>
	<td>y<input type=text name=num2 id=num2><br></td>
	<td><input type=submit id=btnSubmit value="result"></td>
</tr>
</table>
</form>
</body>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script>
$(document)
.on('click','#btnSubmit',function(){
	//ajax
	$.post('/test02-1',{num1:$('#num1').val(),num2:$('#num2').val()},
		function(result){
			let str=''
			str+='<tr><td>'+result+'</td></tr>';
			$('#tbl').append(str);
		}, 'text');
	return false;
})
</script>
</html>