<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- memId, memName, * , password -->  
   
<!doctype html>  
<html lang="en"> 
<jsp:include page="../common/head.jsp" />
<body> 
		<form id ="joinForm" name="joinForm">
			일반ID <input type="text" name="userid" />
			PASS <input type="text" name="password" />
			NAME <input type="text" name="name" />
			SSN <input type="text" name="SSN" /> 
			<input type="hidden" name="action" value="join" /> 
			<input type="hidden" name="page" value="user_login_Form" /> 
			<input type="hidden" name="gender"/> 
			<input type="hidden" name="age"/> 
			<input id="joinFormBtn" type="button" value="전송" /> 
		소속팀 
			<input type="radio" name="teamid" value="none" checked="checked" />
			<input type="radio" name="teamid" value="nolja"/>걍놀자 
			<input type="radio" name="teamid" value="jieunHouse"/>지운이네
			<input type="radio" name="teamid" value="turtleking"/>왕거북이
			<input type="radio" name="teamid" value="coddingZzang"/>코딩쨩
		프로젝트역할
		<select name="roll" id="roll">
			<option value="leader">팀장</option>
			<option value="front">프론트개발</option>
			<option value="back">백단개발</option>
			<option value="android">안드로이드개발</option> 
			<option value="minfe">민폐</option> 
		</select>	 
		수강과목 
		<input type="checkbox" name="subject" value="java" checked="checked" /> JAVA
		<input type="checkbox" name="subject" value="clang"/> C언어 
		<input type="checkbox" name="subject" value="JSP"/> JSP 
		<input type="checkbox" name="subject" value="PHP"/> PHP 
		<input type="checkbox" name="subject" value="nodejs"/> NodeJS 
		<input type="checkbox" name="subject" value="linux"/> Linux 
		<input type="checkbox" name="subject" value="html"/> HTML 
		<input type="checkbox" name="subject" value="spring"/> Spring 
			</form>  
<script>  
	  
	document.getElementById('joinFormBtn') 
	.addEventListener('click',function(){  
	  alert('조인폼'); 
	 /*  var form = document.getElementById('joinForm');  */// form의 id
	
	  var x = service.nullChecker( 
				   	   {userid:document.joinForm.userid.value, // form의 name 
					   password:document.joinForm.password.value, 
					   name:document.joinForm.name.value, 
					   SSN:document.joinForm.SSN.value}); 
		
	 if(x.checker){ 
		var form = document.getElementById('joinForm'); 
			form.action = "${context}/member.do" ; 
			form.method = "post";
		     member.join({userid:form.userid.value, 
				password:form.password.value,
				name:form.name.value, 
				SSN:form.SSN.value});  
		document.joinForm.gender.value = member.getGender();
		document.joinForm.age.value = member.getAge();
		alert(member.getGender());
		form.submit();	
	}else{
		alert(x.text);
	}
	});
	/* var json = [{name:'',value:''},{},{}];
	for(var i=0;i<3,i++){
		MemberBean m = new Member();
		var node = document.creatElement('input');
		node.setAttribute('type','hidden');
		from.appendChild(node);
	} */
	
</script>			
				               <!--   form.userid.value
					,form.password.value
					,form.name.value
					  ,form.SSN.value -->
					
		             <!--  userid:document.joinForm.value,
			password:document.joinForm.value,
			name:document.joinForm.value,
			SSN:document.joinForm.value;
	     -->
</body>
</html>