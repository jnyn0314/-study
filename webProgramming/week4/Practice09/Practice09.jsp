<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practice09</title>
</head>
<body>
<%
	out.println("입력되어 있는 문자열:");
	String s = "Hello, Welcome to JSP World! Let's go!";
	out.println(s + "<br>");
	
	String t = "JSP";
	out.println("문자열의 길이");
	out.println(s.length() + "<br>");
	
	out.println("'" + t + "'라는 문자의 위치:");
	out.println(s.indexOf(t) + "<br>");
	
	out.println("모두 소문자로 변경:");
	out.println(s.toLowerCase() + "<br>");
	out.println("모두 대문자로 변경:");
	out.println(s.toUpperCase() + "<br>");
%>
</body>
</html>