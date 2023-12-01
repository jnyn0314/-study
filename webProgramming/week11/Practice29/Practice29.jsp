<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList, java.util.Enumeration" %>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>p{text-align:center};</style>
<title>시간표 작성</title>
</head>
<body>
	<form action="Practice29.jsp">
	<% 
	String[] typeNames = {"전공필수", "전공선택", "교양", "자유선택"};
	String[] titleNames = {"웹프로그래밍", "운영체제", "소프트웨어프로그래밍", "데이터베이스개론", "자료구조", "네트워크", "창의와감성", "사회봉사"};
	String[] days = {"월", "화", "수", "목", "금"};

    out.println("과목타입: <select name=\"lectureType\">");
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
	%>
	<input type="submit" value="등록">
	</form>
	<br>
	<%
	String timetable= "";
	
	Enumeration<String> e = request.getParameterNames();
	while(e.hasMoreElements()){
		String name = e.nextElement(); // 이름 추출
		String[] value = request.getParameterValues(name);
		if(value != null){
			for(String eachValue : value){
				timetable += eachValue + "/";
			}
		}
	}
	
	ArrayList<String> list = (ArrayList<String>) application.getAttribute("timetable");
	if (list == null) {
	    list = new ArrayList<String>();
	}
	list.add(timetable);
	application.setAttribute("timetable", list);
	
	for (String timetable2 : list) {
		String[] student = timetable2.split("/");
		if (student.length >= 5) {
		String rlst1 = typeNames[Integer.parseInt(student[0])];
		String rlst2 = titleNames[Integer.parseInt(student[1])];
		String rlst3 = days[Integer.parseInt(student[2])];
		int rlst4 = Integer.parseInt(student[3]);
		int rlst5 = Integer.parseInt(student[4]);
		out.println("<p>" + rlst1 + "/" + rlst2 + "/" + rlst3 + "/" + rlst4 + "/" + rlst5 + "<br></p>");
		}
	}
	%>
</body>
</html>