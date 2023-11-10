<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Application_02.jsp</title>
</head>
<body>
	<%! int Icount = 0; %>
	<%
		Integer count = (Integer)application.getAttribute("count");
		
		if(count == null)
			Icount = count;
	%>
</body>
</html>