<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="kor">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>include action</title>
<style>	div{text-align:center};</style>
</head>
<body>
	<div><h2>Include Action Practice</h2></div>
	<hr>
	<div><jsp:include page="calendar.jsp">
	<jsp:param name="YEAR" value="2023" />
	<jsp:param name="MONTH" value="2" />
	</jsp:include></div>
	<div><jsp:include page="news.jsp">
	<jsp:param name="TASK1" value="" />
	<jsp:param name="TASK2" value="" />
	</jsp:include></div>
</body>
</html>