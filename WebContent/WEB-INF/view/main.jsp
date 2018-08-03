<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="context" value="<%=application.getContextPath()%>" />
<!doctype html>
<html lang="en">
<jsp:include page="common/head.jsp" />
<body>
	<!-- 여기는 그냥 메인이야 -->
<!-- 	// -->
	<div id="wrapper">
		<div id="header">

			<jsp:include page="common/titleBox.jsp" />
			<div id="login">
				<jsp:include page="common/loginBox.jsp" />
			</div>
			<div id="menu">
				<jsp:include page="common/menuBox.jsp" />
			</div>
		</div>
		<div id="content">
			<jsp:include page="common/contentBox.jsp" />
		</div>
	</div>

	<script>
	function move(domain, action, page) {
		location.href = "${context}/" + domain + ".do?action=" + action
				+ "&page=" + page;
	}
	</script>
</body>
</html>