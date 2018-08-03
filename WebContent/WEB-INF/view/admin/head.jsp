<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<head>
	<meta charset="UTF-8" />
	<title>ADMIN</title>
	<link rel="stylesheet" href="${context}/resources/css/style.css" />
<!-- 어드민헤드 -->
<script>
	var common = new (function(){
		this.move = function(domain,action,page){
			location.href = "${context}/"
			+domain
			+".do?action="+action
					+"&page="+page;
		}
	});
	function Member(){
		alert('setMemId ALERT !!')
		var memId,ssn,password; 
		this.setMemId = function(x){
			alert('setMemId ALERT !!'+x)
			this.memId = x;
		};
		this.setSsn = function(x){
			this.ssn = x;
		};
		this.setPassword = function(x){
			this.password = x;
		};
		this.getMemId = function(x){
			return this.memId;
		};
		this.getSsn = function(x){
			return this.ssn;
		};
		this.getPassword = function(x){
			return this.password;
		};
		this.loginValidation = function(){
			
			return this.getMemId();
		};
	}
	

	
</script>



</head>
