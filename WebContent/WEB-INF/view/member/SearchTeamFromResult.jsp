<%@page import="dao.MemberDaoImpl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="domain.*" %>
<%@ page import="java.util.*" %>
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
<form action="">
	<%
		String teamid = request.getParameter("TEAM-ID");
		List<MemberBean> lst = MemberServiceImpl.getInstance().findByWord(teamid);
	%>
	<%
	for(MemberBean m : lst){
				%>
				<tr>
					<td><%=m.getMemId()%></td>
					<td><%=m.getPassword()%></td>
					<td><%=m.getMemName()%></td>
					<td><%=m.getSsn()%></td>
					<td><%=m.getTeamId()%></td>
					<td><%=m.getRoll()%></td>
				</tr>
				<%
				}
				%>
	</td></tr>
	
	</form>
	</body>
</html>
