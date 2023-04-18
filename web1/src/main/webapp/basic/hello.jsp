<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- /web1 : 프로젝트 명
	 /basic : webapp 폴더 아래에 생성한 폴더 -->
	<%
	//자바코드 작성
	//HttpServletRequest request: 사용자 용청 가져오기
	// post방식의 데이터를 가져올 때 한글은 깨짐(get은 상관없음)

	request.setCharacterEncoding("utf-8");
	%>


	<h3>이름</h3>
	<%=request.getParameter("name")%>
	<%=request.getParameter("age")%>
	
	
</body>
</html>