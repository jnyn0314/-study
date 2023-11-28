<!-- 20220803 컴퓨터학과 정여진 -->
<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>calc_result</title>
   <style>
        html, body{
            height: 100%; overflow: hidden;
        }
        table{
            width:600px;
            height:95%;
            margin: 5px auto;
            border-collapse: collapse;
            border-color: #ededed;
        }
        .border{
            background-color: #32CCFE;
            width:10%; /*td의 부모인 tr의 width:100%로 뒀으니까 그거의 10%*/
            height:85px; 
        }
        h1{
            text-align: center;
        }
        #img_cal{
            width:90%;
            margin:auto;
            display: block; 
        }
        #button{
            margin:auto;
            display: block;
        }
    </style>
    <script type="text/javascript">
        function calc(){
            var exp = prompt("계산할 수식을 입력하세요");

            if(exp != null){
                var result = eval(exp);
                alert(result);
            }
        }
    </script>
</head>
<body>
    <jsp:useBean id="calc" class="jspbook.pr31.Calculator" scope="page"/>
    <jsp:setProperty name="calc" property="*"/><br> 
    <table border="1">
        <tr>
            <td colspan="2" class="border"><h1>CalCuLaTor</h1></td>
        </tr>
        <tr height="300px">
            <td><input type="image" src="image/cal.jpg" id="img_cal"></td>
            <td style="text-align:center">
            	<div style="border:1px solid; width:50%; margin:auto;" readonly text-align="center">
            	<jsp:getProperty name="calc" property="op1"/></div>
            	<br><br>
            	<jsp:getProperty name="calc" property="operation"/>
            	<br><br>
         		<div style="border:1px solid; width:50%; margin:auto;" readonly text-align="center">
         		<jsp:getProperty name="calc" property="op2"/></div>
            	<br><br>
            	=
            	<br><br>
            	<div style="border:1px solid; width:50%; margin:auto;" readonly text-align="center">
            	<%  result = calc.calc(calc.getOp1(), calc.getOp2(), calc.getOperation()); 
            		out.println(result);
            	%>
             </td>
        </tr>
        <tr>
            <td colspan="2" class="border"></td>
        </tr>
    </table>
    
</body>
</html>