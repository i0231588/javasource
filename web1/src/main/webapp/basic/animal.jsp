<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	String animals[] = request.getParameterValues("animal");
	out.print(Arrays.toString(animals));
	%>
	<h3><%=Arrays.toString(animals) %></h3>
<%--<%=Arrays.toString(animals)%> --%>	
</body>
</html>