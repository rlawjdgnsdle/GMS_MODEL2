<%@page import="service.MemberServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="../common/head.jsp" />
<div id="content">
	<div id="content-box">
	<div id="contextBox-search">
		<div class="searchBox" id ="searchBox">
		
		<select name="searchOption" id="searchOption" >
			<option value="none">검색조건</option>
			<option value="userid" >아이디검색</option>
			<option value="mem_name">이름으로검색</option>
			<option value="team_id">팀아이디으로검색</option> 
		</select>	 
		<input id ="searchWord" name="searchWord" type="text" placeholder="가오갤2" value="가오갤2"/>
		<input type="button" id="searchBtn" value="검색" />
		</div>
		<script>
	/* var x = document.getElementById("text").value; */
</script>
	</div>
		<h1>ADMIN MANGEMENT</h1>
			전체회원수 : ${count} <br />
			 <table id="contentBoxTab">
			<tr id="contentBoxMeta">
				<th>아 이 디</th>
				<th>이    름</th>
				<th>나    이</th>
				<th>성    별</th>
				<th>역    할</th>
				<th>팀    명</th>
			</tr>
			<c:forEach items="${list}" var="member">
			<tr>
				<td>${member.memId}</td>
				<td><a class = "username"  id = "${member.memId}">${member.memName}</a></td>
				<td>${member.age}</td>             
				<td>${member.gender}</td>
				<td>${member.roll}</td>
				<td>${member.teamId}</td>
			</tr>
			</c:forEach>
			<tr id = "page">
			<td colspan="6">
			  <ul class="pageBox">
              <c:forEach begin="${beginPage}" end="${endPage}"
						 step="1" varStatus="i"> 	
                <li>
                <span><a class="pageNum" id="${i.index}" >${i.index}</a></span> 
                </li>
                </c:forEach>    
				<%-- <c:if test="${endPage eq (count/5)+(count%5)}"> --%>
				<c:if test="${count lt 21}">
					<li>다음▶</li>
				</c:if>
				<%-- <c:if test="${endPage ne (count/5)+(count%5)}">
				<li>다음▶</li> --%>	
             	
             </ul>
				</td>
				
			</tr>
			<script>
			
			</script>
		
		</table>
	</div>
</div>
<script>
admin.main('${context}');
 </script>
