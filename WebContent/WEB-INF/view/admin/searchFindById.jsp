<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!doctype html>

<html lang="en">
	<jsp:include page="../common/head.jsp" />
<head>
	<meta charset="UTF-8" />
	<title>Document</title>
</head>
<script>
	function validateForm(){
		return true;
	}
	</script>
<body>
	<form action="${context}/member.do" onsubmit="return validateForm()" method="get">
	MEM_ID <input type="text" name="userid" />
	<input type="hidden" name="action" value="search" />
	<input type="hidden" name="page" value="searchFindByIdResult" />
	<input type="submit" value = "전송"/>
	</form>
</body>
</html>