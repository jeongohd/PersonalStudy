<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.2/css/all.min.css" integrity="sha512-1sCRPdkRXhBV2PBLUdRb4tMg1w2YPf37qatUFeS7zlBy7jJI8Lf4VHwWfZZfpXtYSLy85pkm9GaYVYMfw5BC1A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
<table class="list">
    <colgroup>
        <col width="80px" />
        <col width="*" />
        <col width="100px" />
        <col width="30px" />
    </colgroup>
    <tbody>
	<c:if test="${empty comment.list}">
	 	<tr>
            <td class="first" colspan="8">등록된 댓글이 없습니다.</td>
        </tr>
	</c:if>
	<c:forEach var="vo" items="${comment.list }" >
		<tr>
            <td>${vo.comment_no}</td>
            <td style="text-align:left">
                <c:forEach begin="1" end="${vo.nested }"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </c:forEach>
            	<c:if test="${vo.nested > 0}"> ↳ </c:if>
                <a href="">${vo.content }</a> 
                <a href="javascript:;" 
                	onclick="javascript:textarea(${vo.comment_no}, ${vo.gno}, ${vo.ono}, ${vo.nested}, 'comment_no${vo.comment_no}');this.onclick=null;" 
                	class="rippleBtn comment_no${vo.comment_no}">[댓글달기]</a>  
            </td>
            <td class="date"><fmt:formatDate value="${vo.regdate }" pattern="yyyy-MM-dd" /></td>
            <td style="text-align:center"><a href="javascript:commentDel(${vo.comment_no});"><i class="fa-solid fa-xmark" style="color:Red"></i></a></td>
        </tr>
	</c:forEach>  
    </tbody>
</table>