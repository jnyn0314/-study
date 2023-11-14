<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="kor">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>include action</title>
</head>
<body>
<div><h2 style="text-align:center">include 액션 연습</h2></div>
<hr>
<div><jsp:include page="greeting.jsp">
	<jsp:param name="name" value="Dongduk University"/>
	<jsp:param name="date" value="2011/04/05"/>
	</jsp:include></div>
</body>
</html>