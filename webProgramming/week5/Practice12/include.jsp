<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practice12_include</title>
</head>
<body>
<div align="center"> 
	<h2>include 지시어 연습</h2>
	<hr>
	<table style="width:80%; margin-top:10px;">
	<tr><td><%@ include file="calendar.jsp" %></td>
	<td><%@ include file="news.jsp" %></td></tr>
	</table>
</div>
</body>
</html>