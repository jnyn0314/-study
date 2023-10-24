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
			String name = e.nextElement(); // 이름 추출
			
			String[] multiple_value = request.getParameterValues(name);
			String one_value = request.getParameter(name);
			out.println(name + " :");
			
			if(isMultipleChoice(name)){
				if(multiple_value != null){
					for(String eachValue : multiple_value)
					out.println(eachValue + " /");
				}
				out.println("<br>");
			}
			else{
				out.println(one_value + "<br>");
			}
		}
	%>
	<hr>
	<h1>Processing Parameters</h1>
	<br>
	<%
		ArrayList<String> list_name = getParameterNames(request);
		
		if(list_name != null){
			for(String each_name : list_name){
				out.println(each_name + ":" + get_value_name(each_name, request.getParameter(each_name)) + "<br>");
			}
		}
	%>
	<%!
		String[] mChoices = {"hobby"};
		String[] hobbyNames = {"뉴스", "맛집", "책", "영화", "여행"};
		String[] telCompany = {"010", "011", "017", "070"};
		String[] gNames = {"남", "여"};
		
		ArrayList<String> getParameterNames(HttpServletRequest request){
			Enumeration<String> en = request.getParameterNames();
			ArrayList<String> list = new ArrayList<>();
			
			while(en.hasMoreElements()){
				String names = en.nextElement();
				list.add(names);
			}
			return list;
		}
		boolean isMultipleChoice(String paramName){
			for(String choice : mChoices){
				if(paramName.equals(choice))
					return true;
				}
			return false;
		}
		String get_value_name(String name,String index){
			if(name.equals("hobby")){
				return hobbyNames[Integer.parseInt(index)];
			}
			else if(name.equals("gender")){
				return gNames[Integer.parseInt(index)];
			}
			else if(name.equals("telCompany")){
				return telCompany[Integer.parseInt(index)];
			}
			return index;
		}
	%>
</body>
</html>