"use strict";
var router = (()=>{ // ()이름이없어서 비움
	return {move : x=>{ // 이름이 있을땐 ()을 벗김 파라미터가 있을 때 X 없을 때 ()
		location.href =
			x.context + '/'
			+ x.domain
			+ '.do?action='+ x.action
			+ "&page=" + x.page
	}};
})();

/*
 * var service = (()=>{ return { loginValidation : x => { () or x
 * if(x.userid.value===''){ alert('아이디를 입력하세요'); return false; }else
 * if(x.password.value===''){ alert('비밀번호를 입력하세요'); return false; }else{ return
 * true; } }
 */		/*
		 * ,joinValidation : x=>{ var ok = false;
		 * 
		 * return ok; }
		 */
/*
 * }; })();
 */

var service = (()=>{
	return { 
		nullChecker : x=>{
			var json = {
					checker : true,
					text : '필수입력값이 없습니다'
			};
			for(var i in x){
				if(x[i]===''){
					json.checker = false;
				}
			}
			return json;
		},
		addClass : (dom,cName)=>{
			var arr = cName.split(" ");
				if(arr.indexOf(cName) == -1){
					dom.className += " " + cName;
				}
		}
	}
}
)();




var admin = (()=>{
	return {
		check : x =>{
//			var isAdmin = confirm('관리자입니까');
//			if(isAdmin){
//				var password = prompt('관리자 비번을 입력바랍니다');
//				if(password == 1){
					router.move({context : x,
						domain : 'admin',
						action : 'list',
						page : 'main'
					 });
				/*}else{
					alert('꺼져')
				}
			}else{
				alert('꺼져')
			}*/
		},
		main : x=>{ 
			 service.addClass(
						document.getElementById('searchBox'),'width80pt center '		 
					 );
					 service.addClass(
					 	document.getElementById('searchWord'),'width100px floatRight '	 
					 );
					 service.addClass(
						document.getElementById('searchOption'),'floatRight '
					 );
					 service.addClass(
								document.getElementById('searchBtn'),'floatRight '
							 );
					 service.addClass(
								document.getElementById('searchOption'),'floatRight '
							 );
					 service.addClass(
								document.getElementById('contentBoxTab'),'width90pt center marginTop30px '
							 );

					 service.addClass(
						document.getElementById('contentBoxMeta'),'bgColorBlack '
					 );
					 /* => Array */ /* var x = document.getElementById('aaa');  =>  Object , 스칼라 */
					 for(var i of document.querySelectorAll('.username')){
						 i.style.color = 'black';
						 i.style.cursor = 'pointer';
						 i.addEventListener('click',function(){
						 location.href= x+'/admin.do?action=retrieve&'
									 		+'page=memberDetail&userid='
									 		+ this.getAttribute('id');
							 /* alert('멤버 ID : '+this.getAttribute('id')); */
						 });
					 };

					 for(var i of document.querySelectorAll('.pageNum')){
						 i.style.color = 'blue';
						 i.style.cursor = 'pointer';
						 i.addEventListener('click', function(){
							 location.href = x+'/admin.do?action=list&'
							 				+  'page=main&pagenum='
							 				+ this.getAttribute('id');
						 });
					 };
					 
					 
					 /* document.getElementById('c  ontentBoxMeta').className = 'bgColorisBlack'; */
					 document.getElementById('searchBtn')
					 .addEventListener('click',function(){
					 		alert('ttts');
					location.href = (document.getElementById('searchOption').value === 'userid')
							? x+'/admin.do?action=retrieve&page=memberDetail&userid='+document.getElementById('searchWord').value 
							: x+'/admin.do?action=search&page=main&searchOption='
							+document.getElementById('searchOption').value+'&searchWord='+document.getElementById('searchWord').value
							;
					 	});
					 	
		}
};})();
var member = (()=>{ 
		var _memId,_ssn,_password, _teamId, _roll, __memName, _gender, _age; 
		var setMemId = (memId)=>{this._memId = memId;};
		var setSsn = (ssn)=>{this._ssn = ssn;};
		var setPassword = (password)=>{this._password = password;};
		var setTeamId = (teamId)=>{this._teamId = password;};
		var setRoll = (roll)=>{this._roll = password;};
		var setMemName = (memName)=>{this._memName = memName;};
		var setGender =(gender)=>
			{ 
				switch(gender.charAt(7)){
				case 1 : case 3 : this._gender ='남자';
				 /* : setGender("남자"); */
				case 5 : this._gender ="남자외국인";
				case 2 : case 4 :this._gender ="여자";
				 /* : setGender("여자"); */
				case 6 : this._gender ="여자외국인";
				default : break;
				}};
		var setAge =x=>{
			var date = new Date().getFullYear();
			this._age = date-parseInt("19"+x.substring(0, 2));
			alert(date);
			alert(date-parseInt("19"+x.substring(0, 2)));
		}
		var getAge =()=> {return this._age;}
		var getMemId = ()=>{return this._memId;};
		var getSsn = ()=>{return this._ssn;};
		var getPassword = ()=>{return this._password;};
		var getTeamId = ()=>{return this._teamId;};
		var getRoll = ()=>{return this._roll;};
		var getMemName = ()=>{return this._memName;};
		var getGender = ()=>{return this._gender;};
		return{  // 여기부터 먼저 들러서 밖으로 나간다 여기만 열려있음 리턴에 선언된 것이 public 외부가
					// private
			setMemId : setMemId,
			setSsn : setSsn,
			setPassword : setPassword,
			setGender : setGender,
			setAge : setAge,
			setTeamId : setTeamId,
			setRoll : setRoll,
			setMemName : setMemName,
			getMemId : getMemId,
			getSsn : getSsn,
			getPassword : getPassword,
			getGender : getGender,
			getAge : getAge,
			getTeamId : getTeamId,
			getRoll : getRoll,
			getMemName : getMemName,
			join : x=>{
					member.setAge(x.SSN);
					member.setGender(x.SSN);
				/*
				 * if(x.getMemid===''){ alert('아이디를 입력하세요'); return false; }else
				 * if(x.getPassword===''){ alert('비밀번호를 입력하세요'); return false;
				 * }else{ return true; }
				 */
			}
};
})();

	