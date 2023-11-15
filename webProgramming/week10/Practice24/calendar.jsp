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
</head>
<body>
	<% 
	String Syear = request.getParameter("YEAR");
	String Smonth = request.getParameter("MONTH");
	int year = 2018, month = 7; // 초기화
	
	if(Syear != null && Smonth != null){
		year = Integer.parseInt(Syear);
		month = Integer.parseInt(Smonth);
	}

	Calendar cal = Calendar.getInstance();
	cal.set(year, month - 1, 1);
		
	int day = cal.get(Calendar.DAY_OF_WEEK);  // 요일
	int start = cal.getMinimum(Calendar.DATE);  // 1
	int end = cal.getActualMaximum(Calendar.DATE); // 30 31
	int date = start; // 1-31
	int i, j;
		
	out.println("<div><h3> " + year + "년 " + (month) + "월 </h3><hr>");
	
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
	out.println("</div>");
	%>
</body>
</html>