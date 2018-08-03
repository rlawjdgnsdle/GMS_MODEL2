<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>관리자로그인</title>
	<script>
	function validateForm(){
		return true;
	}
	</script>
</head>
<link rel="stylesheet" href="../css/style.css" />
<body>
	<div id ="admin_login_Layout" >
	<h1 >로그인</h1>
	<form id="" style="border:1px solid black;" onsubmit="return validateForm()" method="post">
		user_id:<br><input type="text" name="user_id"/>	<br>
		user_pw:<br><input type="text" name="user_pw"/><br>
		<input type="hidden" name="action" value="adminlogin" />
		<input type="hidden" name="page" value="mypage" /><br> 
		<input type="submit" value="―전송―"/>
	</form>
	</div>
</body>
</html>