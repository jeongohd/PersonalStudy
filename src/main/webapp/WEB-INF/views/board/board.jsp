<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board</title>
<script src="https://code.jquery.com/jquery-3.5.1.js"></script>
<script>
	$(function(){
		$('#write').click(function(){
			location.href="writeForm"
		})
	})
</script>
</head>
<body>
<form>
	<table border="1">
		<colgroup>
	        <col width="80px" />
	        <col width="*" />
	        <col width="*" />
	        <col width="100px" />
	        <col width="200px" />
        </colgroup>
		<thead>
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>내용</th>
				<th>조회수</th>
				<th>작성일</th>
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
			</tr>
		</c:forEach>
		<tr>
			<td colspan="5">
				<input type="button" id="write" value="글쓰기">
			</td>
		</tr>
		</tbody>
	</table>
	<!-- 검색 -->
	<div>
	    <form method="get" name="searchForm" id="searchForm" action="list.do">
	        <span>
	            <select id="stype" name="stype" title="검색분류 선택">
	                <option value="all">전체</option>
	                <option value="title">제목</option>
	                <option value="content">내용</option>
	            </select>
	        </span>
	        <span>
	            <input type="text" id="sval" name="sword" value="${param.sword }" >
	            <input type="submit" value="검색" >
	        </span>
	    </form>
    </div>	
    <!-- 페이징 -->
	<div>
		<ul>
			<c:if test="${data.prev == true }">
				<a href="list.do?page=1&stype=${param.stype}&sword=${param.sword}">[맨 처음으로]</a>
			</c:if>
			<c:if test="${data.prev == true }">
				<a href="list.do?page=${boardVO.page - 1}&stype=${param.stype}&sword=${param.sword}">[이전]</a>
			</c:if>
			
			<c:forEach var="p" begin="${data.startPage }" end="${data.endPage }">
            	<a href='list.do?page=${p }&stype=${param.stype}&sword=${param.sword}' <c:if test="${boardVO.page == p }"></c:if> > 
            		${p }
            	</a>
            </c:forEach>
			
			<c:if test="${data.next == true }">
				<a href="list.do?page=${boardVO.page + 1}&stype=${param.stype}&sword=${param.sword}">[다음]</a>
			</c:if>
			<c:if test="${data.next == true }">
				<a href="list.do?page=${data.totalPage }&stype=${param.stype}&sword=${param.sword}">[맨 끝으로]</a>
			</c:if>
		</ul>
	</div>
</form>
</body>
</html>