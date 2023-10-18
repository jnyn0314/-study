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
		
		int day = cal.get(Calendar.DAY_OF_WEEK); 
		int start = cal.getMinimum(Calendar.DATE); 
		int end = cal.getActualMaximum(Calendar.DATE); 
		
		int i, j;
		
		out.println("<h1> " + year + "년 " + (month) + "월 </h1><hr>");
		
		while (start <= end) {
		    for (i = 0; i < 7; i++) {
		        if (i < day - 1 || start > end) {
		            out.println("&nbsp; &nbsp; &nbsp;");
		        } else {
		            out.println("&nbsp;&nbsp;&nbsp;" + start);
		            start++;
		        }
		    }
		    day = 1;
		    out.println("<br>");
		}
	%>
</body>
</html>