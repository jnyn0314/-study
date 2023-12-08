<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <html lang="ko">
        <head>
            <title>Practice07</title>
            <style>
                table{
                    margin: auto;
                }
                .tb2{
                    border-collapse: collapse;
                    margin:auto;
                    margin-top: 50px;
                    width:70%;
                    height:50px;
                }
                thead, tfoot, .title{
                    background-color:#ECECEC;
                    text-align: center;
                    font-weight:400px;
                }
                #first_comment{
                    overflow: scroll;
                    width:200px;
                    height:100px;
                }
                input.imageAlign{
                    vertical-align: middle;
                }
            </style>
            <script>
                function checkEmail(){
                    var txtMail = frm3.email.value;
                    var result = txtMail.indexOf("@");
                    if(result == -1){
                        alert('이메일주소 형식이 다릅니다.');
                    }
                    else{
                        alert('사용가능한 이메일 주소입니다.');
                    }
                }
            </script>
        </head>
        <body>
            <table class="tb1">
                <tr>
                    <td><input type="image" src="../Practice34/image/eclass_title.jpg" width="100%"></td>
                </tr>
                <tr>
                <form method="post" name="frm3" action="Practice34.jsp">    
                    <td>
                <table border="1" class="tb2">
                    <thead>
                        <th colspan="2">회원가입</th>
                    </thead>
                    <tbody>
                        <tr>
                            <td class="title">아이디</td>
                            <td>
                                <input type="text" size="10" name="strID">
                                <input type="image" src="image/check.gif" class="imageAlign">
                            </td>
                        </tr>
                        <tr>
                            <td class="title">패스워드</td>
                            <td><input type="text" name="strPwd"></td>
                        </tr>
                        <tr>
                            <td class="title">성별</td>
                            <td>
                                <input type="radio" name="gen" value="0">남
                                <input type="radio" name="gen" value="1" checked>여
                            </td>
                        </tr>
                        <tr>
                            <td class="title">국적</td>
                            <td>
                                <input type="text" name="country">
                                <input type="button" value="국적변경" disabled>
                            </td>
                        </tr>
                        <tr>
                            <td class="title">휴대폰</td>
                            <td>
                                <select name="phone1">
                                    <option value="0">010</option>
                                    <option value="1">011</option>
                                    <option value="2">017</option>
                                    <option value="3">070</option>    
                                </select> -
                                <input type="text" maxlength="4" size="4" name="phone2"> -
                                <input type="text" maxlength="4" size="4" name="phone3">
                            </td>
                        </tr>
                        <tr>
                            <td class="title">이메일</td>
                            <td><input type="text" name="email" value="소식지 받아보기" onclick="this.value=''">
                                <input type="image" src="image/check.gif" class="imageAlign" onclick="checkEmail()">
                            </td>
                        </tr>
                        <tr>
                            <td class="title">생일</td>
                            <td><input type="date" name="birth"></td>
                        </tr>
                        <tr>
                            <td class="title">관심분야</td>
                            <td>
                                <input type="checkbox" name="hobby" value="뉴스">뉴스
                                <input type="checkbox" name="hobby" value="맛집" checked>맛집
                                <input type="checkbox" name="hobby" value="책">책
                                <input type="checkbox" name="hobby" value="영화">영화
                                <input type="checkbox" name="hobby" value="여행">여행
                            </td>
                        </tr>
                        <tr>
                            <td class="title">가입인사</td>
                            <td><textarea id="first_comment" name="memo">회원들에게 간단한 가입인사를 남겨주세요</textarea></td>
                        </tr>
                            <tr>
                                <td class="title">증명사진</td>
                                <td><input type="file"></td>
                            </tr>
                        </tbody>
                    <tfoot>
                        <td colspan="2" style="text-align: center">
                            <input type="submit" value="가입하기">
                            <input type="reset" value="다시작성">
                        </td>
                    </tfoot>  
                </table>
                </td>
            </form>
        </tr>
        </table>
        </body>
</html>