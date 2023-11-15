<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar" %>
<% request.setCharacterEncoding("UTF-8"); %>
<html lang="kor">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Calendar</title>
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
	<% 
	String Syear = request.getParameter("YEAR");
	String Smonth = request.getParameter("MONTH");
	int year = 0, month = 0;
	
	if(Syear != null && Smonth != null){
		year = Integer.parseInt(Syear);
		month = Integer.parseInt(Smonth);
	}
	%>
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
	<form method="get" action="calendar.jsp">
		<a href="calendar.jsp?"></a>
	</form>
	<%
	Calendar today = Calendar.getInstance();
	// int year = today.get(Calendar.YEAR);
	// int month = today.get(Calendar.MONTH) + 1;
	Calendar cal = Calendar.getInstance();
	cal.set(year, month -1, 1);
	int cnt = 0;
	int date = today.get(Calendar.DATE);
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
	while(cal.get(Calendar.MONTH) == month - 1){
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
	
	%>
</body>
</html>