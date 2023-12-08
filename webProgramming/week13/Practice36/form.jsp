<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="lb" class="jspbook.pr36.LectureBean" scope="page"/>
<jsp:useBean id="manager" class="jspbook.pr36.LectureManager" scope="page"/>
<%@ page import="jspbook.pr36.LectureBean" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form</title>
</head>
<body>
	
	<form action="ProcessForm.jsp">
	<jsp:setProperty name="lb" property="*"/>
	<jsp:setProperty name="manager" property="*"/>
	
    과목타입 : <select name="lectureType">
        <% 
        String[] type_typeNames = LectureBean.typeNames;
        for (int i = 0; i < type_typeNames.length; i++) {
            out.println("<option value='" + i + "'>" + type_typeNames[i] + "</option>");
        }
        %>
    </select>

    과목이름 : <select name="titleNames">
        <% 
        String[] type_titleNames = LectureBean.titleNames;
        for (int i = 0; i < type_titleNames.length; i++) {
            out.println("<option value='" + i + "'>" + type_titleNames[i] + "</option>");
        }
        %>
    </select>

    요일 : <select name="dayNames">
        <% 
        String[] type_dayNames = LectureBean.dayNames;
        for (int i = 0; i < type_dayNames.length; i++) {
            out.println("<option value='" + i + "'>" + type_dayNames[i] + "</option>");
        }
        %>
    </select>

    시간 : <select name="time">
        <% 
        for(int i = 1; i <= 6; i++) {
            out.println("<option value='" + i + "'>" + i + "</option>");
        }
        %>
    </select>

    연강 : <select name="consecutive">
        <% 
        for(int i = 1; i <= 6; i++) {
            out.println("<option value='" + i + "'>" + i + "</option>");
        }
        %>
    </select>
    <input type="submit" value="등록">
	</form>
</body>
</html>
