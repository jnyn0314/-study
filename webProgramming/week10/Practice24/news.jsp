<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<html lang="kor">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>news</title>
</head>
<body>
	<%
	String task1 = request.getParameter("TASK1");
	String task2 = request.getParameter("TASK2");
	
	if(task1 == null)
		task1 = "일정 없음";
	if(task2 == null)
		task2 = "일정 없음";
	%>
	<div>
	<h3>오늘의 일정</h3>
	<hr>
	<%
	if(task1 != null && task2 != null){
		out.println("1." + task1);
		out.println("2." + task2);
	}
	%>
	</div>
</body>
</html>