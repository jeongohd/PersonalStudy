<%@ page language="java" contentType="text/html; charset=UTF-8" 
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<script>
	function goSave() {
		frm.submit();
	}
</script>
</head>
<body>
	<h3>게시판</h3>
	<div>
		<form method="post" name="frm" id="frm" action="update.do" enctype="multipart/form-data" >
		<input type="hidden" name="no" value="${data.no }">
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
					<p>기존파일 : <span id="file_name">${data.filename_org}</span><br />
						<input type="checkbox" onclick="fileDel();" id="filename_chk" value="1" name="filename_chk" title="첨부파일을 삭제하시려면 체크해주세요" />
						<label for="filename_chk" onclick="fileDel();">파일삭제</label>
					</p>
					<input type="file" name="filename">
				</td>
			</tr>
	    </table>
	    <div class="btnSet">
	        <a class="btn" href="javascript:goSave();">저장 </a>
	    </div>
	    </form>
	</div>
</body>
</html>