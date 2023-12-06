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

    <h2>그룹 : 가족</h2>
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
            if (addrList != null) {
                for (AddrBean entry : addrList) {
                    if ("family".equals(entry.getGroup())) {
        %>       
        <tr>
            <td><%= entry.getUserName() %></td>
            <td><%= entry.getTel() %></td>
            <td><%= entry.getEmail() %></td>
            <td><%= entry.getGender() %></td>
            <td><%= entry.getGroup() %></td>
        </tr>
        <%
                    }
                }
            }
        %>
    </table>

    <h2>그룹 : 친구</h2>
    <table border="1">
        <tr>
            <td>이름</td>
            <td>전화번호</td>
            <td>이메일</td>
            <td>성별</td>
            <td>그룹</td>
        </tr>

        <% 
            if (addrList != null) {
                for (AddrBean entry : addrList) {
                    if ("friend".equals(entry.getGroup())) {
        %>       
        <tr>
            <td><%= entry.getUserName() %></td>
            <td><%= entry.getTel() %></td>
            <td><%= entry.getEmail() %></td>
            <td><%= entry.getGender() %></td>
            <td><%= entry.getGroup() %></td>
        </tr>
        <%
                    }
                }
            }
        %>
    </table>
    
    <h2>그룹 : 직장</h2>
    <table border="1">
        <tr>
            <td>이름</td>
            <td>전화번호</td>
            <td>이메일</td>
            <td>성별</td>
            <td>그룹</td>
        </tr>

        <% 
            if (addrList != null) {
                for (AddrBean entry : addrList) {
                    if ("company".equals(entry.getGroup())) {
        %>       
        <tr>
            <td><%= entry.getUserName() %></td>
            <td><%= entry.getTel() %></td>
            <td><%= entry.getEmail() %></td>
            <td><%= entry.getGender() %></td>
            <td><%= entry.getGroup() %></td>
        </tr>
        <%
                    }
                }
            }
        %>
    </table>
    
</body>
</html>