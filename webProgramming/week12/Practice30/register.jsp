<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<html lang="kor">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>register</title>
<style>
	body{text-align:center};
</style>
</head>
<body>
	<jsp:useBean id="login" class="jspbook.pr30.LoginBean" scope="page"/>
	<h2>등록내용</h2>
	<jsp:setProperty name="login" property="*"/><br>
	이름: <jsp:getProperty name="login" property="id"/><br> 
	패스워드 : <jsp:getProperty name="login" property="pw"/><br>
	이메일 : <jsp:getProperty name="login" property="email"/><br>
	성별: <jsp:getProperty name="login" property="gender"/><br>
	생일:<jsp:getProperty name="login" property="birth"/><br><hr>
	<jsp:getProperty name="login" property="id"/>씨는 
	<% 
	if(login.getGender() == 1)
		out.println("남성입니다.");
	else
		out.println("여성입니다.");

	if(login.isGrownUp()) 
		out.println("성인입니다.");
	else
		out.println("청소년입니다.");
	%>
</body>
</html>