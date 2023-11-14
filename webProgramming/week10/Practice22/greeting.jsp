<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<html lang="kor">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>greeting message</title>
<style>	div{text-align:center};</style>
<body>
<div><h4>greeting.jsp에서 출력한 메세지입니다.</h4></div>
<br>
<div>
	<%
	String name = request.getParameter("name");
	String date = request.getParameter("date");
	%>
	<p><%=name %>님 환영합니다.<br>
	<p>오늘은 <%=date %>입니다.
</div>
</body>
</html>