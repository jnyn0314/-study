<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practice11</title>
<style>
	h1, table{
	text-align:center;
	}
	table, tr, td{
	border :black solid 1px;
	}
	table{
	width :60%;
	margin:auto;
	}
</style>
</head>
<body>
<%
	out.println("<h1>구구단 출력</h1>");
	out.println("<hr><br><br>");
	out.println("<table>");
		for(int k = 0; k < 5; k = k + 4){
		out.println("<tr>");
		for(int i = k; i < 4 + k; i++){
			out.println("<td>");
			for(int j = 0; j < 9; j++){
				out.println((i + 2)  + "*" + (j + 1) + "=" + (i + 2) * (j + 1) + "<br>");
			}
			out.println("</td>");
		}
		out.println("</tr>");
	}
	out.println("</table>");
%>
</body>
</html>