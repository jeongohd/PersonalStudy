<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page import="java.net.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>게시판</h1>
<table border="1">
	<tr>
		<th>제목</th>
		<td>${data.title }</td>
		<th>조회수</th>
		<td>${data.viewcount }</td>
	</tr>
	<tr>
		<th>내용</th>
		<td colspan="3">${data.content }</td>
	</tr>
	<tr>
		<th>첨부파일</th>
		<c:if test="${empty data.filename_org }">
			<td colspan="3">
				업로드한 파일이 없습니다.
			</td>
		</c:if>
		<td colspan="3">
			<!-- import="java.net.*"  넣어줘야 다운로드 정상작동.-->
			<a href="<%=request.getContextPath() %>/common/download.jsp?oName=${URLEncoder.encode(data.filename_org,'UTF-8')}&sName=${data.filename_real}" target="_blank">${data.filename_org } </a>
		</td>
	</tr>
</table>
<div class="btnSet clear">
    <div class="fl_l">
    	<a href="list.do" class="btn">목록으로</a>
    	<a href="editForm?no=${data.no}" class="btn">수정</a>
    	<a href="javascript:del(${data.no});" class="btn">삭제</a>
    </div>
</div>

</body>
</html>