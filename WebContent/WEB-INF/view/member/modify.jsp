<%@page import="domain.MemberBean"%>
<%@ page import="domain.*" %>
<%@ page import="service.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<jsp:include page="../common/head.jsp"/>
<head>
	<meta charset="UTF-8" />
	<title>개인정보 변경페이지</title>
</head>
<body>
	<form id="updateForm" name="updateForm">

			<input type="radio" name="teamId" value="ATEAM"/>걍놀자 <br />
			<input type="radio" name="teamId" value="BTEAM"/>지운이네<br />
			<input type="radio" name="teamId" value="CTEAM"/>왕거북이<br />
			<input type="radio" name="teamId" value="DTEAM"/>코딩쨩<br />
			<!-- 앞checked => attribute(key) 뒷checked => value -->

프로젝트역할	<select name="roll" id="roll">
			<option value="leader" selected="selected">팀장</option>
			<option value="front">프론트개발</option>
			<option value="back">백단개발</option>
			<option value="android">안드로이드개발</option>
			<option value="minfe">민폐</option>
		</select>	


		<br />ID <input type="text" name="userid" ><br />
		PASS <input type="text" name="password"/><br />
		NEWPASS <input type="text" name="newPass" />	<br />
		<input type="hidden" name="action" value="update" /><br />
		<!-- <input type="hidden" name="page" value="updateResult" /> -->
		<input id="updateConfirmBtn" type="button"  value="수정확인" /><br />
		</form>
	
	<script>
		 var form = document.getElementById('updateForm');
		 var roll = document.getElementById('roll')  
		for(var i = 0; i< roll.options.length; i++){  
			if(roll.options[i].value==='${user.roll}'){
				alert(roll.options[i].value+'과 같다')
			   roll.options[i].setAttribute("selected","selected");
			}
		}
		 document.getElementById("updateConfirmBtn") 
		.addEventListener('click',function(){
			alert('수정확인버튼클릭함!!');
			form.action = "${context}/member.do"; 
			form.method = "post"; 
			form.submit();
		}); 
		
		
		/* var form = document.getElementById('updateForm');
		var teamid = document.getElementsByName('teamid');
		for(var i in teamid){
			if(teamid[i].value === '${user.teamId}'.toLowerCase()){
				document.getElementById(teamid[i].value).checked = true;
			}
		}
		var roll = document.getElementById('roll');
		for(var i=0;i<roll.options.length;i++){
			if(roll.options[i].value === '${user.roll}'){
				roll.options[i].setAttribute("selected","selected");
			}
		}
		
		document.getElementById('updateConfirmBtn')
		.addEventListener('click',function(){
			form.action = "${context}/member.do";
			form.method = "post"; 
			form.submit();
		}); */
	</script>
</body>
</html>
