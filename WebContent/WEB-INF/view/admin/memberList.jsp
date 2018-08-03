<%@page import="service.MemberServiceImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import = "java.util.*" %>
<%@ page import = "domain.*" %>

<%
	List<MemberBean> lst =
		MemberServiceImpl
		.getInstance()
		.listMember(); 
%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
	<style>
	.tbl{border:1px solid black}
	.tbl tr{border:1px solid black}
	.tbl tr th{border:1px solid black}
	</style>
</head>
<script>
	function validateForm(){
		return true;
	}
	</script>
<body>
	<form action="${context}/member.do" onsubmit="return validateForm()" method="get">
		<table class="tbl">
		<tr>
			<th>아이디</th>
			<th>팀이름</th>
			<th>사람이름</th>
			<th>역할</th>
			<th>비밀번호</th>
			<th>생년월일</th>
		</tr>
		
	</table>

	<%
for(int i = 0; i<lst.size(); i++){
%>
<tr>
			<td><%= lst.get(i).getMemName()%></td>
			<td><%= lst.get(i).getTeamId()%></td>
			<td><%= lst.get(i).getMemName()%></td>
			<td><%= lst.get(i).getRoll()%></td>
			<td><%= lst.get(i).getPassword()%></td>
			
			<td></td>
		
		</tr>
<%
}		
%>	
<input type="hidden" name="action" value="memberlist" />
			
</form>
</body>
</html>

