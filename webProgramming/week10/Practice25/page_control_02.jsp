<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<html lang="kor">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>page_control_02</title>
</head>
<body>
	<%
	String userId = request.getParameter("id");
	if(userId.equals("")){ // 아이디 입력 안하면	
	%>
	<jsp:forward page="page_control_04.jsp">
	<jsp:param name="src" value="page_control_02.jsp" />
	<jsp:param name="id" value="guest"/>
	<jsp:param name="pwd" value="anonymous"/>
	</jsp:forward>
	<%}else{ %>
	<jsp:forward page="page_control_04.jsp"/>
	<%}%> 
</body>
</html>