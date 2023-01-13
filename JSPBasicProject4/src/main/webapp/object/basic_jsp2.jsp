<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%--
	request의 주요 메소드 : 브라우저 / 서버 정보
 --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>request의 정보 얻기</h1>
	서버주소 : <%=request.getServerName() %><br>
	서버포트번호 : <%=request.getServerPort() %><br> <%-- localhost:8080 80은 제외할 수 있다 (http:80)--%>
	URL : <%=request.getRequestURL() %><br>
	URL : <%=request.getRequestURI() %><br>
	루트경로 : <%=request.getContextPath() %><br>
	사용자IP : <%=request.getRemoteAddr() %><br>
	요청문장 : <%=request.getQueryString() %>
</body>
</html>