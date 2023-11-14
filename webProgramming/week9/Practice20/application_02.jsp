<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%request.setCharacterEncoding("UTF-8"); %>
<html lang="kor">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Application_02</title>
</head>
<body>
	<%! int count = 0; %>
	<%
		String name = request.getParameter("name");
		String Icount = (String)application.getAttribute("count"); //  0으로 초기화된 Integer 클래스 객체를 형성하여 count 참조변수에 대입
		
		if(Icount == null){
			count = 0;
		}
		else
			count = Integer.parseInt(Icount);
		application.setAttribute("count", Integer.toString(++count)); // 1만큼 증가시키고
		application.log("오늘의 접속자 수:" + count);
	%>
	<%=name %>님 환영합니다.<br>
	현재 시간 : <%=new java.util.Date() %><br>
	오늘의 접속자 수 : <%=count %>
</body>
</html>