<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>시간표 작성</title>
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
    out.println("과목명: <select name=\"titleNames\">");
    for(int i = 0; i < titleNames.length; i++){
        out.println("<option value=\"" + i + "\">" + titleNames[i] + "</option>");
    }
    out.println("요일: <select name=\"day\">");
    for(int i = 0; i < days.length; i++){
        out.println("<option value=\"" + i + "\">" + days[i] + "</option>");
    }
    out.println("시간: <select name=\"time\">");
    for(int i = 0; i < 6; i++){
        out.println("<option value=\"" + i + "\">" + i + "</option>");
    }
    out.println("연강여부: <select name=\"consecutive\">");
    for(int i = 0; i < 6; i++){
        out.println("<option value=\"" + i + "\">" + i + "</option>");
    }

   
	String timetable= "";
	session.setAttribute("lectureType", "0");
	
	ArrayList<String> list = (ArrayList<String>)session.getAttribute("timetable");
	if(list != null){
		list.add(timetable);
	}else{
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add(timetable);
		session.setAttribute("timetable", list2);
	}
	
	out.println(list);
	%>
	<input type="submit" value="등록">
	</form>
</body>
</html>