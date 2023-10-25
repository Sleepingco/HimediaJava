<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<style>
table { border-collapse:collapse;}
td {border:'1px solid magenta';}
</style>
<head>
<meta charset="UTF-8">
<title>View List</title>
</head>
<body>
<input type=button id=btnList value="목록보기">
<br><br>
<table id=tblList></table>
</body>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script>
$(document)
.on('click','#btnList',function(){
	console.log('#btnList clicked')
	$.post('/list',{},function(data){
		console.log(data)
		// [{menu:'Latte',price:3000},{menu:'Mocca',price:3500},{menu:'팥죽',price:7000}]
		for(let i=0; i<data.length;i++){
			let obj = data[i];
			let str = '<tr><td>'+obj['menu']+'</td><td>'+obj['price']+'</td></tr>';
			$('#tblList').append(str);
		}
	},'json');
	/* $.ajax({url:'/list',data:{},type:'post',dataType:'json',
		success:function(data){
			// [{menu:'Latte',price:3000},{menu:'Mocca',price:3500},{menu:'팥죽',price:7000}]
			for(let i=0; i<data.length;i++){
				let obj = data[i];
				let str = '<tr><td>'+obj['menu']+'</td><td>'+obj['price']+'</td></tr>';
				$('#tblList').append(str);
			}
		},
		error: function(){
			alert('ajax call failed!!!');
		}
		}); */
	return false;
});
</script>
</html>