<%@ page language="java" contentType="text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="java.net.URLEncoder" %>
<!doctype html>
<html lang="ko">
<head>
<script>

function goSave(){
	if(confirm('댓글을 저장하시겠습니까?')) {
		$.ajax({
			url:"/pp/ppcommentR/insert.do",
			data:{
				content:$("#contents").val()
			},
			success : function(res){
				if(res.trim() == "true"){
					alert("댓글이 저장되었습니다!");
					$("#contents").val('');
					getComment(1);
				}
			}
		})
	}
}

function commentDel(comment_no){
	if(confirm("댓글을 삭제하시겠습니까?")){
		$.ajax({
			url:'/pp/ppcommentR/delete.do?comment_no='+comment_no,
			success:function(res){
				if(res.trim()=='true'){ //result값이 담김
					alert("댓글이 삭제되었습니다!")
					getComment(1);
				}
			}
		})
	}
}


function getComment(page){ 
	$.ajax({
		url:"/pp/ppcommentR/list.do",
		data:{
			page: page
		},
		success : function(res){
			$("#commentArea").html(res);
		}
	})
};

$(function(){
	getComment(1); 
});

function textarea(comment_no, gno, ono, nested, target){
	$("#rippleForm").appendTo($("."+target).parent());
	$("#rippleForm").css("display","block");
	
	$(".wrtBtn").unbind("click").bind("click",function(){
		let content = $(".rippleComment").val();
		$.ajax({
			url:"/pp/ppcommentR/ripple.do",
			data:{
				comment_no : comment_no,
				gno : gno,
				ono : ono,
				nested : nested,
				content: content
			},
			success : function(res){
				$("#commentArea").html(res);
			}
		})
	});
}

</script>
</head>
<body>
<div>
	<h2>대댓글</h2>
	<div style="height:300px;">
		<div>
		<form method="get" name="frm" id="frm" action="" >
		<table>
	       	<colgroup>
		        <col width="*" />
		        <col width="100px" />
	   		</colgroup>
		   	<tbody>
			    <tr>
			        <td>
			            <textarea name="content" id="contents" style="height:100px;"></textarea>
			        </td>
			        <td style="text-align:center">
			            <div class="btnSet" style="text-align:right;">
			                <a class="btn" href="javascript:goSave();">저장</a>
			            </div>
			        </td>
			    </tr>
		   	</tbody>
		</table>
		<div id="commentArea"></div>
		<div id="rippleForm" style="display:none">
			<input type = "text" name="rippleComment" class="rippleComment">
			<input type="button" class="wrtBtn" value="등록">
		</div>   
		</form>
		</div>
	</div>
</div>
</body>
</html>