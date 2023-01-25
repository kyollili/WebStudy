<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
window.onload=function(){
	let a=10;
	let b=5;
	console.log("a===b "+(a===b)) //false
	console.log("a!==b "+(a!==b)) //true
	console.log("a<b "+(a<b)) //false
	console.log("a>b "+(a>b)) //true
	console.log("a<=b "+(a<=b)) //false
	console.log("a>=b "+(a>=b)) //true
	
	let c="Hello";
	let d="JavaScript"
	
	console.log("c===d "+(c===d)) //false
	console.log("c!==d "+(c!==d)) //true
	console.log("c<d "+(c<d)) //true
	console.log("c>d "+(c>d)) //false
	console.log("c<=d "+(c<=d)) //true
	console.log("c>=d "+(c>=d)) //false
	//비교연산자에 문자열을 포함하고 있다 => 유효성 검사 if(name===""), session.id===name
	
	/*
		논리연산자
		&& ||
		(조건) && (조건)
		-----	  ----
		결과		  결과
		 |			|
		 ------------
		 		|
		 	최종 결과
		 
		&& : 범위에 포함 : 예약일, 예약일이 아닌 날, 체크인, 체크아웃 
			 직렬연산자 ==> 조건이 모두 true일 때만 true
		|| : 병렬연산자 ==> 조건 중에 한 개 이상이 true일 때 true 
		
		---------------------------------------
						&&			||
		---------------------------------------
		true true		true		true
		---------------------------------------
		true false		false		true
		---------------------------------------
		false true		false		true
		---------------------------------------
		false false		false		false
		---------------------------------------
	*/
	let i=(6>7) && (6===7)
	console.log("i="+i) //false
	i=(6<7) || (6===7)
	console.log("i="+i) //true
}
</script>
</head>
<body>

</body>
</html>