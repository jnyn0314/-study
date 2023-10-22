<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practice15</title>
</head>
<body>
	<%
		int year = 2023;
		int month = 10;
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month - 1, 1);
		
		int day = cal.get(Calendar.DAY_OF_WEEK);  // 요일
		int start = cal.getMinimum(Calendar.DATE);  // 1
		int end = cal.getActualMaximum(Calendar.DATE); // 30 31
		int date = start; // 1-31
		int i, j;
		
		out.println("<h1> " + year + "년 " + (month) + "월 </h1><hr>");
		
		while (date <= end) { // 31일 될 때까지
		    for (i = 0; i < 7; i++) { 
		        if (i < day - 1 || date > end) { // 
		            out.println("&nbsp; &nbsp; &nbsp; " + " ");
		        } else {
		            out.println("&nbsp; &nbsp; &nbsp;"+ date);
		            date++;
		        }
		    }
		    day = 1;
		    out.println("<br>");
		}
	%>
</body>
</html>