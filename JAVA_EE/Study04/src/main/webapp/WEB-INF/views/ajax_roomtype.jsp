<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
	<td>
		<table border=1 id=tblList>
		<tr><th>Type Number</th><th>Type Name</th></tr>
		</table>
	</td>
	<td>
		<input type=hidden name=optype id=optype value='insert'>
		<table>
		<tr><td>Type Number</td><td><input type=text name=typenum id=typenum readonly></td></tr>
		<tr><td>Type name</td><td><input type=text name=typename id=typename></td></tr>
		<tr><td colspan=2 align=center>
			<input type=button id=btnAddNew value='등록'>
			<input type=button id=btnDelete value='삭제'>
			<input type=button id=btnReset value='비우기'>
		</table>
	</td>
</tr>
</table>
</body>
<script src='https://code.jquery.com/jquery-3.4.1.js'></script>
<script>
$(document)
.ready(function(){
	loadRoomType();
})


.on('click','#tblList tr',function(){
	$('#typenum').val($(this).find('td:eq(0)').text());
	$('#typename').val($(this).find('td:eq(1)').text());
	$('#optype').val('#update');
	return false;
})

.on('click','btnReset',function(){
	$('#typenum,#typename').val('');
	$('#optype').val('insert');
	return false;
})

.on('click','#btnDelete',function(){
	if($('#typenum').val()=='') return false;

	$.get("/cudRoomType",{optype:'delete',typenum:$('#typenum').val()}, function(data){
		loadRoomType();
		$('#btnReset').trigger('click');
	}, 'text');
	return false;
})

.on('click','#btnAddNew',function(){
	if($('#typename').val()=='') return false;

	$.get('/cudRoomType',{optype:'insert',typenum:$('#typenum').val(),typename:$('#typename').val()},
			function(data){
		loadRoomType();
		$('#btnReset').trigger('click');
	},'text');
	return false;
})


function loadRoomType() {
		$.get('/getRoomType',{},function(data){
			for(i=0; i<data.length;i++) {
				let rtype=data[i];
				let str='<tr><td>'+rtype['typenum']+'</td><td>'+rtype['typename']+'</td></tr>';
				$('#tblList').append(str);
			}
		}, 'json');
}

</script>
</html>