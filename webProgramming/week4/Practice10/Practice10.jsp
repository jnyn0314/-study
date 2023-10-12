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

	<div align="center">
	<table>
	<tr>
	<td><font color="red">일</font></td>
	<td>월</td>
	<td>화</td>
	<td>수</td>
	<td>목</td>
	<td>금</td>
	<td><font color="blue">토</font></td>
	</tr>
<% 
	for(int i = 0; i < 4; i++){
		out.println("<tr>");
		for(int j = 0; j < 7; j++){
			out.println("<td> &nbsp; </td>");
		}
		out.println("</tr>");
	}
%>	
	</table>
	</div>

</body>
</html>