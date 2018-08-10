<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.*"%>
<%@ page import="java.text.SimpleDateFormat"%>
<%@ page import="java.net.*"%>
<%@ page import="java.io.*"%>
<!-- 여기는 어드민메인이야 -->
<!doctype html>
<html lang="en">
<jsp:include page="../common/head.jsp"/>
<body>
	<div id="wrapper">
		<div id="header">

			<jsp:include page="../common/titleBox.jsp" />

			<div id="menu">
				<jsp:include page="../common/menuBox.jsp" />
			</div>
		</div>
		<!-- header end -->
		<div id="content">
			<jsp:include page="../member/search.jsp" />
			<div id="footer">주소</div>
		</div>
		<script>
			function move(domain, action, page) {
				location.href = "${context}/" + domain + ".do?action=" + action
						+ "&page=" + page;
			}
		</script>
</body>
</html>