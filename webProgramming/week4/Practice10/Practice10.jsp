<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practice10</title>
<style>
table, tr, td{
	border :black solid 1px;
}
table{
	width:70%;
	height:500px;
	text-align:center;
}
</style>
</head>
<body>
<%
	out.println("<div align=\"center\">");
	out.println("<table>");
	out.println("<tr>");
	out.println("<td><font color=\"red\">일</font></td>");
	out.println("<td>월</td>");
	out.println("<td>화</td>");
	out.println("<td>수</td>");
	out.println("<td>목</td>");
	out.println("<td>금</td>");
	out.println("<td><font color=\"blue\">토</font></td>");
	out.println("</tr>");
	
	for(int i = 0; i < 4; i++){
		out.println("<tr>");
		for(int j = 0; j < 7; j++){
			out.println("<td> &nbsp; </td>");
		}
		out.println("</tr>");
	}
	
	out.println("</table>");
	out.println("</div>");
%>
</body>
</html>