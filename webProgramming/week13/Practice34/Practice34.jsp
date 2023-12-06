<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<% request.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Practice17</title>
</head>
<body>
    <hr>
    <h1>Processing Parameters</h1>
    <br>
	strID : ${param.strID} <br>
	strPwd : ${param.strPwd} <br>
	gender : ${param.gen} <br>
	country : ${param.country} <br>
	phone1 : ${param.phone1} <br>
	phone2 : ${param.phone2} <br>
	phone3 : ${param.phone3} <br>
	email : ${param.email} <br>
	birth : ${param.birth} <br>
	
	<% 
	Enumeration<String> e = session.getAttributeNames(); // 세션의 모든 속성들 이름 가져옴
	
	while(e.hasMoreElements()){
		String h = (String)e.nextElement();
		String[] hobbiesArray = (String[]) session.getAttribute(h);
		
	} // 세션 내장객체에 속성으로 저장
	%>
	
	${sessionScope.hobbiesArray[0]} // 수정필요
    <p>선택된 관심분야 개</p>
   
    <%!
        String[] mChoices = {"hobby"};
        String[] hobbyNames = {"뉴스", "맛집", "책", "영화", "여행"};
        String[] telCompany = {"010", "011", "017", "070"};
        String[] gNames = {"남", "여"};

        ArrayList<String> getParameterNames(HttpServletRequest request){
            Enumeration<String> en = request.getParameterNames();
            ArrayList<String> list = new ArrayList<>();

            while(en.hasMoreElements()){
                String names = en.nextElement();
                list.add(names);
            }
            return list;
        }

        boolean isMultipleChoice(String paramName){
            for(String choice : mChoices){
                if(paramName.equals(choice))
                    return true;
            }
            return false;
        }

        String get_value_name(String name, String index){
            if(name.equals("hobby")){
                return hobbyNames[Integer.parseInt(index)];
            }
            else if(name.equals("gender")){
                return gNames[Integer.parseInt(index)];
            }
            else if(name.equals("telCompany")){
                return telCompany[Integer.parseInt(index)];
            }
            return index;
        }
    %>
</body>
</html>

