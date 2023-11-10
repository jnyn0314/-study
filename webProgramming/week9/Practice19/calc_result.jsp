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
    <%
    	String num1 = request.getParameter("num1");
    	String num2 = request.getParameter("num2");
    	String op = request.getParameter("operation");
    	String result = "";
    	String show_op ="";
    	switch(op){
    	case "plus" :{
    		show_op = String.valueOf("+");
    		result = String.valueOf(Integer.parseInt(num1) + Integer.parseInt(num2));
    		break;
    	}    		
    	case "minus":{
    		result = String.valueOf(Integer.parseInt(num1) - Integer.parseInt(num2));
    		break;
    		}
    	case "mutiple":{
    		result = String.valueOf(Integer.parseInt(num1) * Integer.parseInt(num2));
    		break;
    		}
    	case "division":{
    		result = String.valueOf(Integer.parseInt(num1) / Integer.parseInt(num2));
    		break;
    		}
    	default :
    		break;
    	}    	
    %>
    <table border="1">
        <tr>
            <td colspan="2" class="border"><h1>CalCuLaTor</h1></td>
        </tr>
        <tr height="300px">
            <td><input type="image" src="image/cal.jpg" id="img_cal"></td>
            <td style="text-align:center">
            	<div style="border:1px solid; width:50%; margin:auto;" readonly text-align="center"><%=num1 %></div>
            	<br><br>
            	<%=show_op %>
            	<br><br>
         		<div style="border:1px solid; width:50%; margin:auto;" readonly text-align="center"><%=num2 %></div>
            	<br><br>
            	=
            	<br><br>
            	<div style="border:1px solid; width:50%; margin:auto;" readonly text-align="center"><%=result %></div>
             </td>
        </tr>
        <tr>
            <td colspan="2" class="border"></td>
        </tr>
    </table>
    
</body>
</html>