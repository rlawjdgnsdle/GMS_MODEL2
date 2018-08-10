<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<div id="login-box">
	<a id="moveLoginForm">LOGIN</a>&nbsp;&nbsp;&nbsp;
	<a id="moveJoinForm">JOIN</a>
</div>
<script>
	document.getElementById('moveLoginForm')
	.addEventListener('click',function(){  //콜백함수
	alert('클릭이벤트 체크!!');
	router.move({context : '${context}',
		domain : 'member',
		action : 'move',
		page : 'login'});
});
	
	document.getElementById('moveJoinForm')
	.addEventListener('click',function(){  //콜백함수
	alert('클릭이벤트 체크!!');
	router.move({context : '${context}',
		domain : 'member',
		action : 'move',
		page : 'add'});
});
</script>
