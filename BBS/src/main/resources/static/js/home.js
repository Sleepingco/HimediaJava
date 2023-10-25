$(document)
.on('click','#tblBoard tbody tr',function(){
	let seq = $(this).find('td:eq(0)').text();
	console.log(seq);
	document.location="view?seqno="+seq;
	return false;
})

.on('click','#btnLogout',function(){
	$.ajax({
		url:'/logout',date:{},method:'post',dateType:'text',
		beforeSend:function(){
			if(!confirm('정말로 로그아웃 할까요?')){
				return false;
			}
			return true;
		},
		success:function(data){
			document.location=data;
		}
	})	
});
