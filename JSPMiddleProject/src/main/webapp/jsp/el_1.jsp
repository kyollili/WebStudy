<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
		EL => <%= %>을 대체 (화면에 데이터 출력) : 표현식
		
		자바 제어문 => JSTL
		---------------------------------------------자바를 최소화
		1) 복잡 (HTML/자바)
		2) Front / Back => 공동 작업이 가능하게 만든다
		-----------------------------------------------
		1. 내장객체 (p.525)
			1) requestScope : request.getAttribute()
			2) sessionScope : session.getAttribute()
			3) param : request.getParameter()
			=> 사용방식
				<%= %> ==> ${}
				<%
					String name="홍길동";
					request.setAttribute("name",name)
										  ---- key
				%>
				${name} ==> 출력하지 않는다
				  ---- 변수가 아니다
				${requestScope.name}		==> request에 담겨 있거나 session에 담겨있는 것만 출력
							   ---- key 
				  ------------ 생략이 가능 ==> ${name}
				<%= name%>
		2. 연산자
 --%>
 <%
 	String name="홍길동";
 //${}를 이용해서 출력 => request, session => 추가적으로 담아서 출력 => setAttribute()
	request.setAttribute("name","심청이");
 	session.setAttribute("name1","박문수");	
 %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>일반 변수일 때 출력</h1>
이름 : <%=name %><br>
<h1>EL을 이용</h1>
이름 : ${requestScope.name} <%-- <%=request.getAttribute("name")%> --%>
<br>
이름 : ${name } <%-- requestScope를 생략할 수 있다 --%>
<br>
<h1>Session에 저장된 데이터 읽기</h1>
이름 : ${sessionScope.name1 }<br>
이름 : ${name1 } <%--request에 저장된 값 --%>
</body>
</html>