<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practice18</title>
<style>
	table{
	border-collapse:collapse; 
	width:90%;
	margin-left:3%;
	}
</style>
</head>
<body>
<% 
	Calendar cal_today = Calendar.getInstance();
	int year_today = cal_today.get(Calendar.YEAR);
	int month_today = cal_today.get(Calendar.MONTH);
	int date_today = cal_today.get(Calendar.DATE);
	out.println(year_today + "-" + (month_today + 1) + "-" + date_today);
	
	Calendar cal = Calendar.getInstance();
	int year = 2010;
	int month = 3;
	cal.set(year, month - 1, 1);
	
	int day = cal.get(Calendar.DAY_OF_WEEK);  // 요일
	int start = cal.getMinimum(Calendar.DATE);  // 1
	int end = cal.getActualMaximum(Calendar.DATE); // 30 31
	int date = start; // 1-31
	int i, j;
	
	out.println("<h1> " + year + "년 " + (month) + "월 </h1><hr>");
	
	out.println("<table border=1>");
	while (date <= end) { // 31일 될 때까지
		out.println("</tr><br>");
	    for (i = 0; i < 7; i++) {
	        if (i < day - 1 || date > end) { // 
	            out.println("<td> &nbsp &nbsp </td>");
	        } else {
	            out.println("<td>" + date + "</td>");
	            date++;
	        }
	    }
	    day = 1;
	    out.println("</tr><br>");
	}
	out.println("</table>");
%>
</body>
</html>