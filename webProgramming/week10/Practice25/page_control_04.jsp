<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<% request.setCharacterEncoding("UTF-8"); %>
<html lang="kor">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>page_control_04</title>
</head>
<body>
	<p>page_control_02.jsp에서 출력된 내용입니다.</p>
	<p>page_control_04.jsp에서 출력합니다.<hr>
	<%
	Enumeration<String> e = request.getParameterNames();
	while(e.hasMoreElements()){
		String s = e.nextElement();
		out.println(s + ":" + request.getParameter(s) + "<br>");
	}
	%>
</body>
</html>