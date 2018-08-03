<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
	<jsp:include page="../common/head.jsp"/>
<body>
	<div id="user-login-layout">
	<h1>로그인</h1>
		<form id="loginForm" name="loginForm">
			ID <input type="text" name="userid" /><br />
			PASS <input type="password" name="password" /><br />
			<input type="hidden" name="action" value="login" />
			<!-- <input type="hidden" name="page" value="joinForm" /> <--></-->
			<input id="loginFormBtn" type="button" value="전송"/>
		</form>
	</div>
	<script>
	document.getElementById('loginFormBtn')
	.addEventListener('click',function(){
		alert(document.loginForm.userid.value);
		var x = service.nullChecker(
				{id : document.loginForm.userid.value,
				pass : document.loginForm.password.value}
				);
	if(x.checker){
		var form = document.getElementById('loginForm');
		form.action = "${context}/member.do";
		form.method = "post";
		form.submit();	
	}else{
		alert(x.text);
	}
});
	</script>
</body>
</html>