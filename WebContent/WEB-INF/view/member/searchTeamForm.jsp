<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
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
	<form action="${context}/searchTeamFormResult.jsp" onsubmit="return validateForm()" method="get">
	TEAM_NAME <input type="text" name="teamId" />
	<input type="hidden" name="action" value="find_by_teamname" />
	<input type="hidden" name="page" value="searchTeamFromResult" />
	<input type="submit" value="전송" />
	
	</form>S
</body>
</html>