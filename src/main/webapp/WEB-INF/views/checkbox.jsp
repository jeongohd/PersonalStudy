<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Check Box</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script>
$(function(){
	$('#btn').click(function(){
		// $('#frm').submit();
		$.ajax({
			url:'checkbox.do',
			data:$('#frm').serialize(),
			success: function(e){
				$('#area').html(e);
			}
		}) 
	});
})
</script>
</head>
<body>
	<form action="checkbox.do" method="get" id="frm">
		<input type="checkbox" name="cb" class="cb" value="1"> 
		<input type="checkbox" name="cb" class="cb" value="2"> 
		<input type="checkbox" name="cb" class="cb" value="3"> 
		<input type="checkbox" name="cb" class="cb" value="4"> 
		<input type="checkbox" name="cb" class="cb" value="5"> 
		<input type="checkbox" name="cb" class="cb" value="6"> 
		<input type="checkbox" name="cb" class="cb" value="7"> 
		<input type="checkbox" name="cb" class="cb" value="8">
	</form> 
	<input type="button" value="버튼" id="btn">
	<div id="area"></div>
</body>
</html>