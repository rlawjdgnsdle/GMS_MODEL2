<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="context" value="<%=application.getContextPath()%>" />
<!doctype html>
<html lang="en">
<jsp:include page="../common/head.jsp" />
<body>
	<!-- 여기는커먼 메인이야 -->
<!-- 	// -->
	<div id="wrapper">
		<div id="header">

			<jsp:include page="titleBox.jsp" />
			<div id="login">
			
				<jsp:include page="loginBox.jsp" />
			</div>
			<div id="menu">
				<jsp:include page="menuBox.jsp" />
			</div>
		</div>
		<div id="content">
			<jsp:include page="contentBox.jsp" />
		</div>
	</div>

	<script>
	common.main('${context}');
	</script>
</body>
</html>