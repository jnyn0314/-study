<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="kor">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>include action</title>
<style>
	table{width:100%; text-align:center};
	td:nth-child(1){width:700px; padding-left:100px;};
</style>
</head>
<body>
	<div><h2>Include Action Practice</h2></div><hr>
	<table><tr>
	<td><jsp:include page="calendar.jsp">
	<jsp:param name="YEAR" value="2023" />
	<jsp:param name="MONTH" value="10" />
	</jsp:include></td>
	<td><jsp:include page="news.jsp">
	<jsp:param name="TASK1" value="null" />
	<jsp:param name="TASK2" value="null" />
	</jsp:include></td>
	</tr></table>
</body>
</html>