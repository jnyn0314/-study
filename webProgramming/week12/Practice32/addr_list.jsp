<%@page import="jspbook.pr32.AddrBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>addr_list</title>
    <style>
        table {
            margin-left: auto;
            margin-right: auto;
        }

        h2, div {
            text-align: center;
        }
    </style>
</head>
<body>
    <jsp:useBean id="manager" class="jspbook.pr32.AddrManager" scope="application"/>
	<jsp:useBean id="address" class="jspbook.pr32.AddrBean"/>
    <h2>주소록(전체보기)</h2><hr>
    <div>
        <a href="addr_form.jsp">주소 추가</a>
        <a href="addr_list_group.jsp">그룹별 목록 보기</a><br>
    </div>
    
    <table border="1">
        <tr>
            <td>이름</td>
            <td>전화번호</td>
            <td>이메일</td>
            <td>성별</td>
            <td>그룹</td>
        </tr>

        <% 
            ArrayList<AddrBean> addrList = manager.addrList;
            if (addrList != null) { // null이 아니면
            	out.println("<tr>");
                for(AddrBean entry : addrList) {    
                	// request이용해서, entry 다시 만들고, 
        %>       
        <!--  
        <td><%= entry.getUserName() %></td>
        <td><%= entry.getTel() %></td>
        <td><%= entry.getEmail() %></td>
        <td><%= entry.getGender() %></td>
        <td><%= entry.getGroup() %></td>
        -->
		     <!--  
            <td><jsp:getProperty name="address" property="userName"/></td>
            <td><jsp:getProperty name="address" property="tel"/></td>
            <td><jsp:getProperty name="address" property="email"/></td>
            <td><jsp:getProperty name="address" property="gender"/></td>
            <td><jsp:getProperty name="address" property="group"/></td>
        -->
        <%
        	out.println("</tr>");
                }
            }
        %>
    </table>
</body>
</html>
