<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Practice18</title>
    <style>
        table {
            border-collapse: collapse;
            width: 90%;
            margin-left: 3%;
            margin-top: 20px; /* Add margin to push the table down */
        }
        .sunday {
            color: red;
        }
        .saturday {
            color: blue;
        }
        .bold {
            font-weight: bold;
            margin-left:80%;
        }
    </style>
</head>
<body>
<%
    Calendar cal_today = Calendar.getInstance();
    int year_today = cal_today.get(Calendar.YEAR);
    int month_today = cal_today.get(Calendar.MONTH);
    int date_today = cal_today.get(Calendar.DATE);

    String dateStr = year_today + "-" + (month_today + 1) + "-" + date_today;

    int day = cal_today.get(Calendar.DAY_OF_WEEK);
    int start = cal_today.getMinimum(Calendar.DATE);
    int end = cal_today.getActualMaximum(Calendar.DATE); // 30 31
    int date = start; // 1-31
    int i, j, k;

    out.print("<div class=\"bold\">" + dateStr + "</div>");

    String[] daysOfWeek = {"일", "월", "화", "수", "목", "금", "토"};

    out.println("<table border=1>");

    for (i = 0; i < 7; i++) {
        out.print("<td>");
        if (i == 0) {
            out.print("<span class=\"sunday\">" + daysOfWeek[i] + "</span>");
        } else if (i == 6) {
            out.print("<span class=\"saturday\">" + daysOfWeek[i] + "</span>");
        } else {
            out.print(daysOfWeek[i]);
        }
        out.print("</td>");
    }

    out.println("</tr>");

    while (date <= end) {
        for (i = 0; i < 7; i++) {
            out.print("<td>");
            if (i == 0) {
                out.print("<span class=\"sunday\">" + date + "</span>");
            } else if (i == 6) {
                out.print("<span class=\"saturday\">" + date + "</span>");
            } else {
                out.print(date);
            }
            out.print("</td>");
            date++;
        }
        out.println("</tr>");
    }
    out.println("</table>");
%>
</body>
</html>
