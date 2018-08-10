<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<head>
	<meta charset="UTF-8" />
	<title>USER DELETE</title>
</head>
<script>
	function validateForm(){
		return true;
	}
	</script>
<body>
	<form id="deleteForm" action="${context}/member.do" >
	삭제할 아이디 <input type="text" name="userid" /><br />
	삭제할 아이디의 비밀번호 <input type="text" name="password"/><br />
	<input type="hidden" name="action" value="delete" />
	<input type="hidden" name="page" value="main" />
	<input id="deleteFormBtn" type="button" value="삭제" />
	</form>
</body>
<script>
	var form = document.getElementById('deleteForm');
	document.getElementById('deleteFormBtn')
	.addEventListener('click',function(){
		var val = form.password.value;
	 if(val==='${user.password}'){
		form.action = '${context}/member.do';
		form.method = 'post';
		var node = document.createElement('input');
		node.setAttribute('type','hidden');
		node.setAttribute('name','action');
		node.setAttribute('value','delete');
		/* 	node.innerHTML = 
			<input type="hidden" name="action" value="delete" /> */
		form.appendChild(node);  // form "의" 자식
	 }else{
		alert('비밀번호가 다릅니다')
	}
	 
	});
</script>
</html>