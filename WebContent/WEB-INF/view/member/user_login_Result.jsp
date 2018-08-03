<%@page import="dao.MemberDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@ page import="service.*" %>
<%@ page import="domain.*" %>
<%
 String ctx = application.getContextPath();
%>
<!-- "oracle.jdbc.driver.OracleDriver" -->
<!-- "jdbc:oracle:thin:@localhost:1521:xe","seini144","password") -->
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<body>
<!-- <h3>로그인</h3> -->
		

	
	<h3>로그인</h3>
		MemberBean m = new MemberBean();
		m.setMemId(request.getParameter("userid"));
		m.setPassword(request.getParameter("password"));
		session.setAttribute("res",MemberServiceImpl.getInstance().login(m));
		if(MemberServiceImpl.getInstance().login(m)){
			%>
			<h3>로그인 성공</h3>
			<%=session.getAttribute("res") %>
		}
</body>
</html>

