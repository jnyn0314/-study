<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html lang="kor">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>addr_form.jsp</title>
<style>body{text-align:center};</style>
</head>
<body>
<h2>주소록 등록</h2><hr>
<form action="addr_add.jsp">
<table border="1" style="margin-left:auto; margin-right:auto">
<tr>
	<td>이름</td>
	<td><input type="text" name="username"></td>
</tr>
<tr>
	<td>전화번호</td>
	<td><input type="text" name="tel"></td>
</tr>
<tr>
	<td>이메일</td>
	<td><input type="text" name="email"></td>
</tr>
<tr>
	<td>성별</td>
	<td><select name="gender">
	<option value="men">남</option>
	<option value="women">여</option>
	</select></td>	
</tr>
<tr>
	<td colspan="2" style="text-align:center"><input type="submit" value ="확인" >
	<input type="reset" value="취소">
	</td>
</tr>
</table>
</form>
</body>
</html>