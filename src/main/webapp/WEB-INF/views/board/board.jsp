<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form>
	<table>
		<thead>
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>내용</th>
				<th>조회수</th>
			</tr>
		</thead>
		<tbody>	
		<c:if test="${empty data.list}">
			<tr>
				<td colspan="4">등록된 데이터가 없습니다.</td>
			</tr>	
		</c:if>
		<c:forEach var="list" items="${data.list }" varStatus="status">
			<tr>
				<td>${list.no}</td>
				<td>${list.title }</td>
				<td><a href="view.do?no=${list.no}">${list.content }</a></td>
				<td>${list.viewcount}</td>
				<td class="date"><fmt:formatDate value="${list.regdate }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
				<!-- yyyy-MM-dd HH:mm:ss -->
			</tr>
		</c:forEach>
		<tr>
			<td colspan="4">
				<input type="button" value="글쓰기">
			</td>
		</tr>
		</tbody>
	</table>
	<div>
		<ul>
			<c:if test="${data.prev == true }">
				<li><a href="board.do?page=1&stype=${param.stype}&sword=${param.sword}">맨 처음으로</a></li>
			</c:if>
			<c:if test="${data.prev == true }">
				<li><a href="board.do?page=${boardVO.page - 1}&stype=${param.stype}&sword=${param.sword}">이전</a></li>
			</c:if>
			
			<c:forEach var="p" begin="${data.startPage }" end="${data.endPage }">
            	<li><a href='index.do?page=${p }&stype=${param.stype}&sword=${param.sword}' <c:if test="${boardVO.page == p }"><b>${p }</b></c:if> >
            		${p }
            		</a>
            	</li>
            </c:forEach>
			
			<c:if test="${data.next == true }">
				<li><a href="board.do?page=${boardVO.page + 1}&stype=${param.stype}&sword=${param.sword}">다음</a></li>
			</c:if>
			<c:if test="${data.next == true }">
				<li><a href="board.do?page=${data.totalPage }&stype=${param.stype}&sword=${param.sword}">맨 끝으로</a></li>
			</c:if>
		</ul>
	</div>
	
</form>
</body>
</html>