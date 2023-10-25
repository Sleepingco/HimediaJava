<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Menu</title>
</head>
<style>
table { border-collapse: collapse;}
td,th{ border:1px solid blue;}
th{color:yellow; background-color:black;}
</style>
<body>
<!-- 110 <form method="post" action="/insert"> pagerefresh
메뉴명: <input type=text name=name><br>
가격: <input type=number name=price><br>
<input type=submit value='Add'>
<br>
<br>
<br>
</form> -->
<input type=hidden id=menuno>
메뉴명: <input type=text name=name id=name><br>
가격: <input type=number name=price id=price><br>
<input type=button id=btnAdd value='Add'>
<input type=button id=btnDelete value='Del'>

<table id=tblMenu>
<thead>
<tr><th>메뉴번호</th><th>메뉴명</th><th>가격</th></tr>
</thead>
<tbody>
</tbody>
<%-- 
<c:forEach items="${menulist}" var="menu">
	<tr><td>${menu.seq}</td><td>${menu.name}</td><td>${menu.price}</td></tr>
</c:forEach> --%>
</table>
</body>
<script src="https://code.jquery.com/jquery-latest.js"></script>
<script>
$(document)
.ready(function(){
	console.log('data called')
	getList();
})
.on('click','#btnAdd',function(){
	let name=$('#name').val();
	let price=$('#price').val();
	if(name==''||price==''){
		alert('값이없습니다');
		return false;
	}
	if($('#menuno').val()==''){
		$.ajax({url:"/insert",data:{name:name,price:price},type:'post',
			dataType:'text',
			success:function(data){
				$('#menuno,#name,#price').val('');
				if(data=="1"){
					console.log('data called')
					getList();
				}
			}
		})
	} else {
		$.ajax({url:'/update',
			data:{m_num:$("#menuno").val(),name:$('#name').val(),
				price:$('#price').val()},
			type:'post',dataType:'text',
			success:function(data){
				$('#menuno,#name,#price').val('');
				if(data=='1'){
					getList();
				}
			}
		})
	}
	
})

.on('click','#tblMenu tr',function(){
	/* let pstr=$(this).find('td:eq(0)').text();
	$(#menuno).val(pstr);
	let pstr=$(this).find('td:eq(1)').text();
	$(#name).val(pstr);
	let pstr=$(this).find('td:eq(2)').text();
	$(#price).val(pstr);
	return false; */
	let str = ""
    let tdArr = new Array();
	let tr = $(this);
    let td = tr.children();
    td.each(function(i){
        tdArr.push(td.eq(i).text());
    });
    console.log("배열에 담긴 값 : "+tdArr);
    let no = td.eq(0).text();
    let menu = td.eq(1).text();
    let price = td.eq(2).text();
    $('#menuno').val(no);
    $('#name').val(menu);
    $('#price').val(price);
    
}); 
/* .on('click','#btnDelete',function(){ standard
	$.ajax({url:"/dodelete",data:{delnum:$('#menuno').val()},
		type:'post',dataType:'text',
		success:function(data){
			if(data=="1"){
				getList();
			}
		}})
}); */

$(document)
.on('click','#btnDelete',function(){
	if($('#menuno').val()==''){
		alert('삭제할 메뉴를 먼저 선택하시오');
		return false;
	}
	let delNum=$('#menuno').val();
	$.post('/dodelete',{delNum:delNum},function(data){
		getList();
		$('#menuno,#name,#price').val();
	},'text');
	return false;
});

	
function getList(){
	console.log('getList called')
	$.ajax({url:"/getmenulist",data:{},type:'post',dataType:'json',
		success:function(data){
			$('#tblMenu tr:gt(0)').remove();
			for(let i=0;i<data.length;i++){
				let str='<tr><td>'+data[i]['seq']+'</td><td>'+
				data[i]['menu']+'</td><td>'+data[i]['price']+'</td></tr>';
				$('#tblMenu tbody').append(str)
			}	
		}
	})
}
</script>
</html>