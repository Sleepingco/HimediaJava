<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List by AJAX call</title>
</head>
<style>
table { border-collapse: collapse}
td,th{ border:1px solid blue}
th{color:yellow; background-color:black;}
</style>
<body>
<button id=btnGet>목록가져오기</button>
<br><br>
<table id=tblList>
<thead><tr>
	<th>사번</th><th>이름</th><th>급여</th><th>매니저</th><th>부서</th>
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
.on('click','#btnGet',function(){
	$.post('/ajaxelist',{},function(data){
		console.log(data)
		for(let i=0; i<data.length;i++){
			let obj = data[i];
			let eid=obj['eid']
			let name=obj['name']
			let sal=obj['sal']
			let mname=obj['mname']
			let dname=obj['dname']
			if (mname==''||mname==null){
				mname='-';
			}
			if (dname==''||dname==null){
				dname='-';
			}
			$('#tblList tbody').append('<tr><td>'+eid+'</td><td>'+name+'</td><td>'+sal+'</td><td>'+mname+'</td><td>'+dname+'</td></tr>');
		}
	},'json');
	/* $.ajax({url:'/ajaxelist',data:{},type:'post',dataType:'json',
		success:function(data){
			console.log(data)
			for(let i=0; i<data.length;i++){
				let obj = data[i];
				let str = '<tr><td>'+obj['eid']+'</td><td>'+obj['name']+'</td><td>'+obj['sal']+'</td><td>'+obj['maid']+'</td><td>'+obj['depid']+'</td></tr>';
				$('#tblList').append(str);
			}
		},
		error: function(){
			alert('ajax call failed!!!');
		}
		}); */
		/* fieldset.disabled = true; */
	return false;
});
</script>
</html>