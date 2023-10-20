<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>    
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practice16-result</title>
</head>
<body>
	<h1>전달된 파라미터 이름들</h1>
	
	<hr>	
	<% Enumeration<String> e = request.getParameterNames();
		
		while(e.hasMoreElements()){
			String name = e.nextElement();
			String[] data = request.getParameterValues(name);
			
			if(data != null){
				out.println(name + "<br>");
			}
		}
		
		out.println("<hr>");
		
		String type = request.getParameter("type");
		out.println("타입: " + type + "<br>");
		String strId = request.getParameter("strID");
		out.println("아이디: " + strId + "<br>");
		String strPwd = request.getParameter("strPwd");
		out.println("패스워드: " + strPwd + "<br>");
	%>
	
</body>
</html>