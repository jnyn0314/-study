<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.ArrayList" %>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practice17</title>
</head>
<body>
	<%
		Enumeration<String> e = request.getParameterNames();
		
		while(e.hasMoreElements()){
			String name = e.nextElement();
			String[] value = request.getParameterValues(name);
			
			if(value != null){
				for(String eachValue : value){
					out.println(name + ": " + eachValue + "<br>");
				}
			}
		}
	%>
	<hr>
	<h1>Processing Parameters</h1>
	<br>
	<%!
		String[] mChoices = {"hobby"};
		String[] telCompany = {"뉴스", "맛집", "책", "영화", "여행"};
		String[] gNames = {"남", "여"};
	
		ArrayList<String> getParameterNames(HttpServletRequest request){
		Enumeration<String> en = request.getParameterNames();
		ArrayList<String> list = new ArrayList<>();
		
		while(en.hasMoreElements()){
			String name = en.nextElement();
			list.add(name);
		}
		return list;
		}
		boolean isMultipleChoice(String paramName){
			for(String choice : mChoices){
				if(paramName.equals(mChoices))
					return true;
				}
			return false;
		}
	%>
</body>
</html>