<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="list" class="jspbook.pr36.LectureBean" scope="page"/>
<jsp:useBean id="manager" class="jspbook.pr36.LectureManager" scope="page"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practice36</title>
</head>
<body>
	
	<form action="Practice36.jsp">
	<jsp:setProperty name="list" property="*"/>
	<jsp:setProperty name="manager" property="*"/>
	
	과목타입 : <select name="lectureType">
	<% for(int i = 0; i < 4; i++){ %>
	<option value="i" property="typeNames[i]">
	<%} %>
	<!-- 
	<% 
    
    for(int i = 0; i < typeNames.length; i++){
        out.println("<option value=\"" + i + "\">" + typeNames[i] + "</option>");
    }
    out.println("</select>");
    out.println("과목명: <select name=\"titleNames\">");
    for(int i = 0; i < titleNames.length; i++){
        out.println("<option value=\"" + i + "\">" + titleNames[i] + "</option>");
    }
    out.println("</select>");
    out.println("요일: <select name=\"day\">");
    for(int i = 0; i < days.length; i++){
        out.println("<option value=\"" + i + "\">" + days[i] + "</option>");
    }
    out.println("</select>");
    out.println("시간: <select name=\"time\">");
    for(int i = 0; i < 6; i++){
        out.println("<option value=\"" + i + "\">" + i + "</option>");
    }
    out.println("</select>");
    out.println("연강여부: <select name=\"consecutive\">");
    for(int i = 0; i < 6; i++){
        out.println("<option value=\"" + i + "\">" + i + "</option>");
    }
    out.println("</select>");
	%> -->
	<input type="submit" value="등록">
	</form>
	
</body>
</html>