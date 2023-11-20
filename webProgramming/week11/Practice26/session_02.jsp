<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<html lang="kor">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>session_02</title>
</head>
<body>
<%=request.getParameter("username")%>님 환영합니다.<br>
세션 ID : <%=session.getId() %><br>
세션 지속시간 : <%=session.getMaxInactiveInterval() %><br>
<a href="session_03.jsp">session_03.jsp로 가기</a>
</body>
</html>