<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%request.setCharacterEncoding("utf-8");%>
<ul>
	<li>사용자 이름 : <%=request.getParameter("name") %></li>
	<li>서버 이름 : <%=request.getServerName() %></li>
	<li>서버 포트 : <%=request.getServerPort() %></li>
	<li>사용자 주소 : <%=request.getRemoteAddr() %></li>
	<li>요청 메소드 : <%=request.getMethod() %></li>
	<li>요청 프로토콜 : <%=request.getProtocol() %></li>
</ul>
</body>
</html>