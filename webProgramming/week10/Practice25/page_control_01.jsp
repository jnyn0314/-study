<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="kor">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>page_control_01</title>
</head>
<body>
	<form action="page_control_02.jsp">아이디: <input type="text" name="id"> 비밀번호: <input type="text" name="pwd"> <input type="submit" value="foward전송" ></form>
	<form method="get" action="page_control_03.jsp">아이디: <input type="text" name="id"> 비밀번호: <input type="text" name="pwd"> <input type="submit" value="sendRedirect 전송"></form>
</body>
</html>