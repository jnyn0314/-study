<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@page import="jspbook.pr37.LectureBean"%>
<%@page import="jspbook.pr37.LectureManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>강의 시간표</title>
    <style>
        table {
            border: 2px solid black;
            border-collapse: collapse;
            table-layout: fixed;
            width: 80%;
            height: 400px;
            margin-top: 20px;
            margin-left: auto;
            margin-right: auto;
        }

        tr, td {
            border: 2px solid black;
            text-align: center;
        }

        h3 {
            text-align: center;
            margin-top: 30px;
            padding-bottom: 5px;
        }

        th {
            font-weight: 550;
            font-size: 20px;
        }

        .date {
            text-align: center;
            font-size: 13px;
        }
    </style>
        
</head>
<body> 
	<jsp:useBean id="manager" class="jspbook.pr37.LectureManager" scope="application" />
	<jsp:useBean id="lb" class="jspbook.pr37.LectureBean" scope="page"/>
    <form action="FinalProject_2.jsp" method="post">
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
            out.println("<option value='" + i + "'>" + i  + "</option>");
        }
        %>
    </select>

    연강 : <select name="consecutive">
        <% 
        for(int i = 0; i < 6; i++) {
            out.println("<option value='" + (i + 1) + "'>" + (i + 1)+ "</option>");
        }
        %>
    </select>
    <input type="submit" value="등록">
	</form>

	<% 
	// 만약 연강 시간보다 수업 시간이 더 크면, 화면에 출력 안되게 바꾸기
	List<jspbook.pr37.LectureBean> lectureList = null; // 여기에서 변수 선언
	
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
        lectureList = manager.getLectureList();
    }
	%>
	
	<% 
    int[][] lectureType = manager.getTypeMatrix();
    int[][] lectureTitle = manager.getTitleMatrix();
    int[][] consecutive = manager.getSpanMatrix();
 
    out.println("<div align=\"center\"><h3>강의 시간표</h3></div>");
    out.println("<table>");
    out.println("<tr>");
    
    out.println("<td class=\"date\">2학년</td>");
    out.println("<td class=\"date\">월</td>");
    out.println("<td class=\"date\">화</td>");
    out.println("<td class=\"date\">수</td>");
    out.println("<td class=\"date\">목</td>");
    out.println("<td class=\"date\">금</td>");
    out.println("</tr>");
    
    for (int i = 0; i < 6; i++) {
        out.println("<tr>");
        out.println("<th>" + (i + 1) + "</th>");
        
        for (int j = 0; j < 5; j++) {
            // 이전 행에서의 rowspan으로 인해 현재 셀이 생략되는지 확인
            if (consecutive[i][j] > 0 || !manager.isSpannedFromAbove(consecutive, i, j)) {
                out.print("<td");
                if (consecutive[i][j] > 0) {
                    if (lectureType[i][j] != 0) {
                        out.print(" style='background-color:");
                        switch (lectureType[i][j]) {
                            case 1: out.print("#FFE08C"); break;
                            case 2: out.print("#B2CCFF"); break;
                            case 3: out.print("#BDBDBD"); break;
                            default: out.print("none"); break; // No color
                        }
                        out.print("'");
                    }
                    if (consecutive[i][j] > 1) {
                        out.print(" rowspan='" + consecutive[i][j] + "'");
                    }
                }
                out.print(">");
                if (lectureTitle[i][j] != -1 && consecutive[i][j] > 0) {
                    out.print(LectureBean.titleNames[lectureTitle[i][j]]);
                }
                out.println("</td>");
            }
        }
        out.println("</tr>");
    }
    out.println("</table>");    
%>
<hr>
	 <% if (lectureList != null) {
        for (jspbook.pr37.LectureBean lecture : lectureList) {
            out.print(lecture.toString() + "<br>");
        }
    } %>
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
