<%@page import="domain.MemberBean"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
	<jsp:include page="../common/head.jsp" />
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
<h1>회원정보보기</h1>

	<table>
  <tr>
    <th colspan="2" rowspan="2"></th>
    <th>이름</th>
    <th>${member.memName}</th>
  </tr>
  <tr>
    <td>아이디</td>
    <td>${member.memId}</td>
  </tr>
  <tr>
    <td>역할</td>
    <td>${member.roll}</td>
    <td>비밀번호</td>
    <td>********</td>
  </tr>
  <tr>
    <td>나이</td>
    <td>${member.age}</td>
    <td>주민번호</td>
    <td>${member.ssn}</td>
  </tr>
  <tr>
    <td>팀명</td>
    <td>${member.teamId}</td>
    <td>성별</td>
    <td>${member.gender}</td>
  </tr>
</table>
	<a id ="myPageMoveToUpdate">수정가기</a>
	<a id ="myPageMoveToDelete">회원탈퇴</a>
		<script>
				document.getElementById('myPageMoveToUpdate')
				.addEventListener('click',function(){
				router.move({context : '${context}',
					domain : 'member',
					action : 'move',
					page : 'updateForm'});
				});
				
				document.getElementById('myPageMoveToDelete')
				.addEventListener('click',function(){
				router.move({context : '${context}',
					domain : 'member', 	
					action : 'move',
					page : 'deleteForm'});
				});
				
		</script>
</body>
</html>		


		
		
<!--user.memId → user.getMemId 로 자동인식한다-->
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		<!-- 
			</th>
		</tr>
		<tr style="height:400px">
			<td>
			<img src="../img/mypage/hedge2.jpg" alt="" />
			</td>
			<td>
			<a href="../home/login.jsp">로그아웃</a>
			</td>
		</tr>
		<tr style="height:300px">
			<td colspan="2">
			경상북도 울릉군 울릉읍 독도리 산30
			</td>
		</tr>
	</table>
</body>
</html> -->