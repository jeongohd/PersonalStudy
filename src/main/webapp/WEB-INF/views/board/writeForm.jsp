<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script>
	function goSave() {
		if ($("#title").val() == "") {
			alert('제목을 입력해 주세요.');
			$("#title").focus();
			return false;
		}
		if ($("#content").val() == "") {
			alert('내용을 입력해 주세요.');
			$("#content").focus();
			return false;
		}
		frm.submit();
	}
</script>
</head>
<body>
	<h3>게시판</h3>
	<div>
		<form method="post" name="frm" id="frm" action="write.do" enctype="multipart/form-data" >
	    <table border="1">
	    <colgroup>
			<col style="width:50px"/>
			<col style="width:300px"/>
		</colgroup>
	        <tr>
	            <th>제목</th>
	            <td>
	                <input type="text" name="title" id="title" value="${data.title }"/>
	            </td>
	        </tr>
	        <tr>
	            <th>내용</th>
	            <td>
	                <textarea name="content" id="content" rows="10" >${data.content }</textarea>
	            </td>
	        </tr>
	        <tr>
				<th>첨부파일</th>
				<td>
					<input type="file" name="filename">
				</td>
			</tr>
	    </table>
	    <div class="btnSet">
	        <a href="javascript:goSave();">저장 </a>
	    </div>
	    </form>
	</div>
</body>
</html>