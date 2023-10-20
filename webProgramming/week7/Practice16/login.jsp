<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Practice16-login</title>
</head>
<body>
	<table>
            <form name="frm1" method="post" action="result.jsp">
                <tr>
                    <td colspan="3">
                        <input type="image" src="image/eclass_title.jpg" class="image_title" width="100%">
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <h1>로그인</h1>
                        <hr>
                    </td>
                </tr>
                <tr>
                    <td rowspan="5">
                        <input type="image" src="image/eclass_logo.png" class="image_logo">
                    </td>
                    <td colspan="2">
                        <b><p>회원님의 아이디와 비밀번호를 정확히 입력하세요.</p></b>
                    </td>
                </tr>
                <tr>
                    <th></th>
                    <td>
                        <select name="type">
                            <option name="underGraduate" value="학부생">학부생</option>
                            <option name="Graduate" value="대학원생">대학원생</option>
                            <option name="staff" value="교직원">교직원</option>
                        </select>
                    </td>
                </tr>
                <tr>
                    <th>아이디</th>
                    <td><input type="text" name="strID" class="id"></td>
                </tr>
                <tr>
                    <th>비밀번호</th>
                    <td><input type="text" name="strPwd" class="pwd"></td>
                </tr>
                <tr>
                    <th><input type="submit" value="로그인"></th>
                    <td><input type="submit" value="가입하기" onclick="document.location='member2.html'"></td>
                </tr>
            </form>
        </table>
</body>
</html>