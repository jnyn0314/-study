<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Calendar" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practice14</title>
</head>
<body>
	<% 
	Calendar cal = Calendar.getInstance();
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH) + 1;
	int date = cal.get(Calendar.DATE);
	int day = cal.get(Calendar.DAY_OF_WEEK);
	%>
	
	오늘은 <%= year %>년 <%= month %>월 <%= date %>일 <%= num_to_kor(cal) %>입니다.<br>
	
	<% 
	int start = cal.getMinimum(Calendar.DATE);
	int end = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	cal.set(2008, Calendar.FEBRUARY, 14); 
	int startYear = cal.get(Calendar.YEAR);
	int startMonth = cal.get(Calendar.MONTH) + 1;
	int startDate = cal.get(Calendar.DATE);
	int startDay = cal.get(Calendar.DAY_OF_WEEK);
	
	%>
	이번 달은 <%=start%>일부터 시작하여 <%=end%>일에 끝납니다.<br>
	내 생일 <%= startYear %>년 <%= startMonth %>월 <%= startDate %>일은 <%= num_to_kor(cal) %>입니다.
	
	<%!
	String num_to_kor(Calendar cal){

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		String kor_day = "";
		
		switch(day){
		case 0: kor_day = "일요일";
			break;
		case 1: kor_day = "월요일";
			break;
		case 2: kor_day = "화요일";
			break;
		case 3: kor_day = "수요일";
			break;
		case 4: kor_day = "목요일";
			break;
		case 5: kor_day = "금요일";
			break;
		case 6: kor_day = "토요일";
			break;
		}
		return kor_day;
	}
	%>
</body>
</html>