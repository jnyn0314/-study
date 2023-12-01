<!-- 엣지 최적화 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>강의 시간표</title>
    <style>
        table {
            border: 2px solid black;
            border-collapse: collapse;
            table-layout: fixed;
            width: 80%;
            height: 400px;
            margin-top: 20px;
            margin-left: auto;
            margin-right: auto;
        }

        tr, td {
            border: 2px solid black;
            text-align: center;
        }

        h3 {
            text-align: center;
            margin-top: 30px;
            padding-bottom: 5px;
        }

        th {
            font-weight: 550;
            font-size: 20px;
        }

        .date {
            text-align: center;
            font-size: 13px;
        }
    </style>
</head>
<body>
<%! 
    int[][] lectureType = {
        {0, 1, 1, 0, 1},
        {1, 0, 0, 0, 2},
        {0, 0, 2, 0, 4},
        {2, 3, 0, 3, 0},
        {0, 0, 0, 2, 0},
        {0, 0, 0, 0, 0}
    };

    int[][] consecutive = {
        {1, 2, 1, 1, 1},
        {2, 0, 1, 1, 1},
        {0, 1, 1, 1, 4},
        {2, 1, 1, 1, 0},
        {0, 1, 1, 2, 0},
        {1, 1, 1, 0, 0}
    };

    int[][] lectureTitle = {
        {-1, 4, 5, -1, 5},
        {3, -1, -1, -1, 1},
        {-1, -1, 1, -1, 7},
        {0, 6, -1, 6, -1},
        {-1, -1, -1, 2, -1},
        {-1, -1, -1, -1, -1}
    };

    String[] titleNames = {
        "웹프로그래밍", "운영체제", "소프트웨어프로그래밍", "데이터베이스개론", 
        "자료구조", "네트워크", "창의와감성", "사회봉사"
    };
%>

<%	
    out.println("<div align=\"center\"><h3>강의 시간표</h3></div>");
    out.println("<table>");

    // 월화수목금 표시
    out.println("<tr>");
    out.println("<th rowspan=\"2\">2학년</th>");
    out.println("<td class=\"date\">월</td>");
    out.println("<td class=\"date\">화</td>");
    out.println("<td class=\"date\">수</td>");
    out.println("<td class=\"date\">목</td>");
    out.println("<td class=\"date\">금</td>");
    out.println("</tr>");

    for (int i = 0; i < 6; i++) {
        out.println("<tr>");
        out.println("<th>" + (i + 1) + "</th>");

        for (int j = 0; j < 5; j++) {
            out.print("<td");

            // 배경색 설정
            if (lectureType[i][j] != 0) {
                out.print(" bgcolor=\"");

                if (lectureType[i][j] == 1) {
                    out.print("#FFE08C"); // 전공
                } else {
                    out.print("#B2CCFF"); // 교양
                }
                out.print("\"");
            }

            // 연강 설정
            if (consecutive[i][j] > 1) {
                out.print(" rowspan=\"" + consecutive[i][j] + "\"");
            }
            out.print(">");

            // 강의명 출력
            if (lectureType[i][j] != 0 && lectureTitle[i][j] != -1) {
                out.print(titleNames[lectureTitle[i][j]]);
            }

            out.println("</td>");
        }

        out.println("</tr>");
    }

    out.println("</table>");
%>
</body>
</html>


