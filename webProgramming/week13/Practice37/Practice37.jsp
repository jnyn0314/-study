<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="jspbook.pr37.LectureBean" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practice36</title>
<style>
	.typeMatrix, .titleMatrix{float:left}
</style>
</head>
<body>
	<!-- 사용자의 입력을 기반으로 하니까 indexOutOfBOunds 안남 -->
	<jsp:useBean id="lb" class="jspbook.pr37.LectureBean" scope="page"/>
	<jsp:useBean id="manager" class="jspbook.pr37.LectureManager" scope="application"/>
	<form action="Practice37.jsp">
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
            out.println("<option value='" + i  + "'>" + type_titleNames[i] + "</option>");
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
	<hr>

	<% 
	
    if (request.getParameter("lectureType") != null) { 
        int type = Integer.parseInt(request.getParameter("lectureType"));
        int title = Integer.parseInt(request.getParameter("titleNames"));
        int day = Integer.parseInt(request.getParameter("dayNames"));
        int time = Integer.parseInt(request.getParameter("time"));
        int consecutive = Integer.parseInt(request.getParameter("consecutive"));
        
        LectureBean newLecture = new LectureBean();
        newLecture.setType(type);
        newLecture.setTitle(title);
        newLecture.setDay(day);
        newLecture.setTime(time);
        newLecture.setConsecutive(consecutive);
        
        manager.add(newLecture);
        manager.buildMatrix();
    }
    
    List<LectureBean> lectureList = manager.getLectureList();
    
    if (lectureList != null) {
        for(LectureBean lectureEntry : lectureList) { 
%>
        <p><%= lectureEntry.toString() %></p>
<%
        }
    }
%>
    <table class="typeMatrix">
        <span>typeMatrix</span>
        <% for (int i = 0; i < manager.getTypeMatrix().length; i++) { %>
            <tr>
                <% for (int j = 0; j < manager.getTypeMatrix()[i].length; j++) { %>
                    <td><%= manager.getTypeMatrix()[i][j] %></td>
                <% } %>
            </tr>
        <% } %>
    </table>
    
    <table class="titleMatrix">
        <span>titleMatrix</span>
        <% for (int i = 0; i < manager.getTitleMatrix().length; i++) { %>
            <tr>
                <% for (int j = 0; j < manager.getTitleMatrix()[i].length; j++) { %>
                    <td><%= manager.getTitleMatrix()[i][j] %></td>
                <% } %>
            </tr>
        <% } %>
    </table>

    <table class="spanMatrix">
        <span>spanMatrix</span>
        <% for (int i = 0; i < manager.getSpanMatrix().length; i++) { %>
            <tr>
                <% for (int j = 0; j < manager.getSpanMatrix()[i].length; j++) { %>
                    <td><%= manager.getSpanMatrix()[i][j] %></td>
                <% } %>
            </tr>
        <% } %>
    </table>

</body>
</html>