<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>

body {background-color: #009999; text-align: center; color: #ff6600 ;font-style: italic;font-family:Monaco;}

h4 {color: black;text-align: center;font-style: italic;}
h1 {color: #ff6600;text-align: center;font-style: italic;}
</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Management</title>
<h1>Employee Details</h1>

</head>
<body>
<h4>

<lable > Employee Id : <%String empid = (String)request.getAttribute("empid"); %><%= empid%></lable><br>
<lable >Employee name : <%String empname = (String)request.getAttribute("empname"); %><%= empname%></lable><br>
<lable > Date : <%String date1 = (String)request.getAttribute("date1"); %><%= date1%></lable><br><br><br>
<lable > Task 1 : <%String task1 = (String)request.getAttribute("task1"); %><%= task1%></lable><br>
<lable > Duration  : <%int duration1 = (Integer)request.getAttribute("duration1"); %><%= duration1%> hours</lable><br><br><br>
<lable >Task 2 : <%String task2 = (String)request.getAttribute("task2"); %><%= task2%></lable><br>
<lable > Duration  : <%int duration2 = (Integer)request.getAttribute("duration2"); %><%= duration2%> hours</lable><br><br><br>
<lable > Task 3 : <%String task3 = (String)request.getAttribute("task3"); %><%= task3%></lable><br>
<lable > Duration  : <%int duration3 = (Integer)request.getAttribute("duration3"); %><%= duration3%> hours</lable><br><br><br>
<lable > Total Hours of Work  : <%int total = (Integer)request.getAttribute("total"); %><%= total%> hours</lable><br><br>
</h4>

</body>
</html>