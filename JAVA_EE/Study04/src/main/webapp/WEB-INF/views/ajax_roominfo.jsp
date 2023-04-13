<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table align=center>
<tr>
	<td valign=top>
		<table border=1 id=tblListI>
		<tr><th>Num</th><th>Name</th><th>Type</th><th>How Many</th><th>How much</th></tr>
		</table>
	</td>
	<td valign=top>
		<input type=hidden name=optypeI id=optypeI value='insertI'>
		<table>
	<tr><td>Number</td><td><input type=text name=num id=num readonly></td></tr>
	<tr><td>Name</td><td><input type=text name=name id=name></td></tr>
	<tr><td>Type</td><td><input type=text name=type id=type></td></tr>
	<tr><td>How Many</td><td><input type=text name=howmany id=howmany></td></tr>
	<tr><td>How Much</td><td><input type=text name=howmuch id=howmuch></td></tr>
	<tr><td colspan=2 align=center>
			<input type=button id=btnAddNewI value='등록'>
			<input type=button id=btnDeleteI value='삭제'>
			<input type=button id=btnResetI value='비우기'>
	</td></tr>
	</table>
	</td>
</tr>
</table>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.ready(function(){
	loadRoomInfo();
})


.on('click','#tblListI tr',function(){
	$('#num').val($(this).find('td:eq(0)').text());
	$('#name').val($(this).find('td:eq(1)').text());
	$('#type').val($(this).find('td:eq(2)').text()); 
	$('#howmany').val($(this).find('td:eq(3)').text());
	$('#howmuch').val($(this).find('td:eq(4)').text());
	$('#optypeI').val('#updateI');
	return false;
})

.on('click','btnResetI',function(){
	$('#num,#name,#type,#howmany,#howmuch').val('');
	$('#optypeI').val('insertI');
	return false;
})

.on('click','#btnDeleteI',function(){
	if($('#num').val()=='') return false;

	$.get("/cudRoomInfo",{optypeI:'deleteI',num:$('#num').val()}, function(data){
		loadRoomInfo();
		$('#btnResetI').trigger('click');
	}, 'text');
	return false;
})

.on('click','#btnAddNewI',function(){
	if($('#name').val()=='') return false;

	$.get('/cudRoomInfo',{optypeI:'insertI',num:$('#num').val(),name:$('#name').val(),type:$('#type').val(),
		howmany:$('#howmany').val(),howmuch:$('#howmuch').val()},
			function(data){
		loadRoomInfo();
		$('#btnResetI').trigger('click');
	},'text');
	return false;
})


function loadRoomInfo() {
		$.get('/getRoomInfo',{},function(data){
			for(i=0; i<data.length;i++) {
				let rinfo=data[i];
				let str='<tr><td>'+rinfo['num']+'</td><td>'+rinfo['name']+'</td>'+'</td><td>'+rinfo['type']+'</td>'
				+'</td><td>'+rinfo['howmany']+'</td>'+'</td><td>'+rinfo['howmuch']+'</td></tr>';
				$('#tblListI').append(str);
			}
		}, 'json');
}
</script>
</html>