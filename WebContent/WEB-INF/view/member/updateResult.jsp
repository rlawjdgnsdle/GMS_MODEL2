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
	<%
	MemberBean mem = new MemberBean();
	mem.setMemId(request.getParameter("userId"));
	mem.setPassword(request.getParameter("password")+"/"+(request.getParameter("newPass")));
	MemberServiceImpl.getInstance().updateMember(mem);
	%>
	
</body>
</html>