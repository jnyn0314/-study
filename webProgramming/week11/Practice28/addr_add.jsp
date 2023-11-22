<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@page import="org.apache.catalina.ant.ListTask"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<%@ page import="java.util.ArrayList, java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>addr_add.jsp</title>
<style>
body{text-align:center};
</style>
</head>
<body>
<h2>등록내용</h2>
<% 
	Enumeration<String> e = request.getParameterNames(); // 세션의 모든 속성 이름 가져옴
	String addrbook = "";
	
	while(e.hasMoreElements()){
		String name = e.nextElement(); // 이름 추출
		String[] value = request.getParameterValues(name);
		out.println(name + ":");
		if(value != null){
			for(String eachValue : value){
				out.println(eachValue);
				addrbook += eachValue + "/";
			}
		}
	} // request 내장 객체로 전달된 입력값 출력한다.
	// 입력한 값을 하나의 문자열로 변환하는데 이때 application 내장객체 쓸 것
	ArrayList<String> list = (ArrayList<String>)application.getAttribute("addrbook");
	if(list != null){ // 값이 있다면
		list.add(addrbook); //리스트에 넣고
	}else{ // 값이 없다면, list객체 새로 생성
		ArrayList<String> list2 = new ArrayList<String>(); 
		list2.add(addrbook);
		application.setAttribute("addrbook", list2);
	}
%>
<hr><br>
<a href="addr_list.jsp">목록보기</a>
<a href="addr_form.jsp">주소추가</a>
</body>
</html>