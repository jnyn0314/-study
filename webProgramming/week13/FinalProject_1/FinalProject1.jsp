<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar"%>
<% request.setCharacterEncoding("UTF-8"); %>
<html lang="kor">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Practice21</title>
<style>
        table {
            border-collapse: collapse;
            width: 90%;
            margin-left: 3%;
            margin-top: 20px;
        }
        .sunday {
            color: red;
        }
        .saturday {
            color: blue;
        }
        .bold {
            font-weight: bold;
            margin-left: 80%;
        }
    </style>
</head>
<body>
<%! 
    public String parseDay(int cnt, String day) {
        String color = "";
        if (cnt == 1) {
            color = "red"; // Sunday
        } else if (cnt == 7) {
            color = "blue"; // Saturday
        }
        
        if (!color.isEmpty()) {
            return "<font color=\"" + color + "\">" + day + "</font>";
        } else {
            return day;
        }
    }
%>
<%
	Calendar today = Calendar.getInstance();
	int year = today.get(Calendar.YEAR);
	int month = today.get(Calendar.MONTH) + 1;
	int date = today.get(Calendar.DATE);

	String sYear = request.getParameter("YEAR");
	String sMonth = request.getParameter("MONTH");

	int int_sYear = (sYear != null)?Integer.parseInt(sYear):year;
	int int_sMonth = (sMonth != null)?Integer.parseInt(sMonth):month; // 처음에 초기화
	
	if (sYear != null && sMonth != null) {
	    try {
	        int_sYear = Integer.parseInt(sYear);
	        int_sMonth = Integer.parseInt(sMonth);
	    } catch (NumberFormatException e) {
	        e.printStackTrace(); 
	    }
	}	
	
	Calendar cal = Calendar.getInstance();
	cal.set(int_sYear, int_sMonth - 1, 1);	
	int cnt = 0;
	
	out.println("<form action=\"calendar.jsp\" method=\"get\">");

	out.println("<span style=margin-left:10%; font-weight:bold >");
	out.println("<a href=\"calendar.jsp?YEAR=" + (int_sYear - 1));
	out.print("&MONTH=" + int_sMonth +"\">" + "◀</a>");
	out.println(int_sYear + "년");
	out.println("<a href=\"calendar.jsp?YEAR=" + (int_sYear + 1));
	out.print("&MONTH=" + int_sMonth +"\">" + "▶</a>");
	out.println("</span>");
	
	
	out.println("<span style=margin-left:30%; font-weight:bold>");
	if(int_sMonth < 2){ // 여기 왜 2지? -> 1이면 1-1 = 0월이 출력되니까
		out.println("<a href=\"calendar.jsp?YEAR=" + int_sYear);
		out.print("&MONTH=" + (int_sMonth) +"\">" + "◀</a>");
	}
	else{
		out.println("<a href=\"calendar.jsp?YEAR=" + int_sYear);
		out.print("&MONTH=" + (int_sMonth - 1) +"\">" + "◀</a>");
	}
	out.println(int_sMonth + "월");
	if(int_sMonth > 11){
		out.println("<a href=\"calendar.jsp?YEAR=" + int_sYear);
		out.print("&MONTH=" + (int_sMonth) +"\">" + "▶</a>");
	}
	else{
		out.println("<a href=\"calendar.jsp?YEAR=" + int_sYear);
		out.print("&MONTH=" + (int_sMonth + 1) +"\">" + "▶</a>");
	}
	out.println("</span>");
	
	out.println("<span style=margin-left:90%; font-weight:bold>");
	out.println(int_sYear + "-" + int_sMonth + "-" + date);
	out.println("</span>");
%>
<table border="1">
	<tr>
		<td><%= parseDay(1, "일") %></td>
		<td><%= parseDay(2, "월") %></td>
		<td><%= parseDay(3, "화") %></td>
		<td><%= parseDay(4, "수") %></td>
		<td><%= parseDay(5, "목") %></td>
		<td><%= parseDay(6, "금") %></td>
		<td><%= parseDay(7, "토") %></td>
	</tr>
<%
	for(int i = 0; i < cal.get(Calendar.DAY_OF_WEEK) - 1; i++)
		out.println("<td>&nbsp;</td>");
	while(cal.get(Calendar.MONTH) == int_sMonth - 1){
		if(cal.get(Calendar.DAY_OF_WEEK) == 1)
			out.println("<tr>");
		out.println("<td>" + parseDay(cal.get(Calendar.DAY_OF_WEEK), String.valueOf(cal.get(Calendar.DATE)))+ "</td>");
		if(cal.get(Calendar.DAY_OF_WEEK) == 7)
			out.println("</tr>");
		cal.add(Calendar.DATE, 1);
	}
	int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
	while(dayOfWeek <= 7){
		out.println("<td>&nbsp;</td>");
		dayOfWeek++;
		}
	out.println("</form>");
%>
</table>
</body>
</html>