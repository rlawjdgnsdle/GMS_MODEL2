<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>관리자회원가입화면</title>
	
	</script>
</head>
<body>
		<form action="${context}/member.do" onsubmit="return validateForm()" method="get">
			관리자ID <input type="text" name="userid" />
			PASS <input type="text" name="password" />
			NAME <input type="text" name="name" />
			SSN <input type="text" name="SSN" />
			<input type="hidden" name="action" value="ADMINJOIN" />
			<input type="hidden" name="page" value="admin_login_Form" />
			<input type="submit" value="전송" /></form>
</body>
</html>
    