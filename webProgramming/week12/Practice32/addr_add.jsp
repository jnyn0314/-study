<%@page import="jspbook.pr32.AddrBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="login" class="jspbook.pr32.AddrBean" scope="page"/>
<jsp:useBean id="manager" class="jspbook.pr32.AddrManager" scope="application"/>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>addr_add.jsp</title>
</head>
<body>
    <h2>등록내용</h2>
    <jsp:setProperty property="*" name="login"/>
    
    이름 : <jsp:getProperty name="login" property="userName"/><br>
    전화번호 : <jsp:getProperty name="login" property="tel"/><br>
    이메일 : <jsp:getProperty name="login" property="email"/><br>
    성별 : <jsp:getProperty name="login" property="gender"/><br>
    그룹 : <jsp:getProperty name="login" property="group"/><br>
	
    <%
    ArrayList<AddrBean> arrayList = manager.getAddrList();
    
    if (arrayList != null) {
        arrayList = manager.addrList;
    }
    manager.add(login);
    manager.setAddrList(arrayList);
	%>
    <a href="addr_list.jsp">목록보기 </a>
    <a href="addr_form.jsp">주소추가 </a>
    <a href="addr_list_group.jsp">그룹별 목록보기</a>
</body>
</html>

