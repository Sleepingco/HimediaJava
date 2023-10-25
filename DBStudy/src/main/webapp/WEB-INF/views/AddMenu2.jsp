<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Menu2</title>
</head>
<style>
table { border-collapse: collapse}
td,th{ border:1px solid blue}
th{color:yellow; background-color:black;}
</style>
<body>
메뉴명: <input type=text name=name><br>
가격: <input type=number name=price><br>
<button id=btnAdd>Add Menu</button>
<br><br>
<table id=tblList>
<thead>
	<tr>
		<th>메뉴번호</th><th>메뉴이름</th><th>가격</th>
	</tr>
</thead>
<tbody>
</tbody>
</table>
</body>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script>
/* -- ajaxlist에서 매니저명,부서명으로 보이기 */
$(document)
.on('click','#btnAdd',function(){
	console.log(1);
	$('#tblList tbody').empty();
	$.post('/ajaxinsert',{ 
	    name: $('input[name=name]').val(),
	    price: $('input[name=price]').val()
	},function(data){
		console.log(data)
		for(let i=0; i<data.length;i++){
			let obj = data[i];
			let num=obj['seq']
			let menu=obj['menu']
			let price=obj['price']
			$('#tblList tbody').append('<tr><td>'+num+'</td><td>'+menu+'</td><td>'+price+'</td></tr>');
		}
	},'json');
	return false;
});
</script>
</html>