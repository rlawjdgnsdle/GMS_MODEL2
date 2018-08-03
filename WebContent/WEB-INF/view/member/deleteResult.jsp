<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="service.*" %>
<%@ page import="domain.*" %>
<%@ page import="java.sql.*" %>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>삭삭삭삭제제제제</title>
</head>

<body>
	<%
	MemberBean mem = new MemberBean();
	String memId = request.getParameter("userid");
	String memPassword = request.getParameter("password");
	mem.setMemId(memId);
	mem.setPassword(memPassword);
	MemberServiceImpl.getInstance().deleteMember(mem);
	%>
</body>
</html>