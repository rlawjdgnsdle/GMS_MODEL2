<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="domain.*" %>
<%@ page import="service.*"%>
<%
 String ctx = application.getContextPath();
%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>

<h3>회원가입</h3>

 	<%-- <%
	MemberBean mem = new MemberBean();
	mem.setMemId(request.getParameter("userid"));
	mem.setPassword(request.getParameter("password"));
	mem.setMemName(request.getParameter("name"));
	mem.setSsn(request.getParameter("ssn"));
	if(MemberServiceImpl.getInstance().login(mem)){
		%>
		<h3>회원가입</h3>
		<%=session.getAttribute("res") %>                      
		<%
		
	}else{
		%>
		<h3>회원가입실패</h3>
		<%
	}
%> --%>
</body>
</html>
<%-- 
session.setAttribute("res", MemberServiceImpl.getInstance().insertMember(mem));
	if(MemberServiceImpl.getInstance().insertMember(mem)){
		%>
			<h3>로그인 성공</h3>
			<%=session.getAttribute("res") %>
			<%
			
		}else{
			%>
			<h3>로그인 실패</h3>
			<%
		} --%>