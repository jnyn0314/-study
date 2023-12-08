<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<% request.setCharacterEncoding("UTF-8"); %>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Practice35</title>
</head>
<body>
    <h1>Processing Parameters</h1>
    <br>

	<% 
		Enumeration<String> e = request.getParameterNames();
			while(e.hasMoreElements()){
				String names = e.nextElement();
				out.println(names);
		}
	%>
	<br>
    strID : ${param.strID} <br>
    strPwd : ${param.strPwd} <br>
    gender : ${param.gen} <br>
    country : ${param.country} <br>
    phone1 : ${param.phone1} <br>
    phone2 : ${param.phone2} <br>
    phone3 : ${param.phone3} <br>
    email : ${param.email} <br>
    birth : ${param.birth} <br>
	
    <% 
        String[] hobbies = request.getParameterValues("hobby");
        if (hobbies != null) {
            session.setAttribute("hobbiesArray", hobbies);
            session.setAttribute("hobbiesCount", hobbies.length);
        }
    %>
    <p>선택된 관심분야 개수: ${sessionScope.hobbiesCount}</p>
  
    <% if (session.getAttribute("hobbiesArray") != null) {
          String[] hobbiesArray = (String[])session.getAttribute("hobbiesArray");
    	}
    %>
    	[0] : ${hobbiesArray[0]}<br>
        [1] : ${hobbiesArray[1]}<br>
        [2] : ${hobbiesArray[2]}<br>
        [3] : ${hobbiesArray[3]}<br>
        [4] : ${hobbiesArray[4]}<br>
</body>
</html>

