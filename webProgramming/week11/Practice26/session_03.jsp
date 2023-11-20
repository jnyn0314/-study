<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<html lang="kor">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>session_03</title>
</head>
<body>
<% 
long getLast = session.getLastAccessedTime();
long getCreation = session.getCreationTime();

long time = getLast - getCreation;
Date getLast_T = new Date(time);
%>
세션이 생성된 후 <%=%>초가 지났습니다.
</body>
</html>