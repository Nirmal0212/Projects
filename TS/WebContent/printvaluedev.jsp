<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>

body {background-color: #009999; text-align: center; color: #248f8f ;font-style: italic;font-family:Monaco;}

h4 {color: black;text-align: center; }
h2 {color: black;text-align: center;font-style: italic;}
h1 {color: #ff6600;text-align: center;font-style: italic;}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Development</title>
<h1>Employee Details</h1>

</head>
<body>
<h4>

<lable > Employee Id : <%String empid = (String)request.getAttribute("empid"); %><%= empid%></lable><br>
<lable >Employee name : <%String empname = (String)request.getAttribute("empname"); %><%= empname%></lable><br>
<lable > Date : <%String date1 = (String)request.getAttribute("date1"); %><%= date1%></lable><br><br>
<lable > Task 1 : <%String task1 = (String)request.getAttribute("task1"); %><%= task1%></lable><br>
<lable > Duration  : <%int duration1 = (Integer)request.getAttribute("duration1"); %><%= duration1%> hours</lable><br><br>
<lable >Task 2 : <%String task2 = (String)request.getAttribute("task2"); %><%= task2%></lable><br>
<lable > Duration  : <%int duration2 = (Integer)request.getAttribute("duration2"); %><%= duration2%> hours</lable><br><br>
<lable > Task 3 : <%String task3 = (String)request.getAttribute("task3"); %><%= task3%></lable><br>
<lable > Duration  : <%int duration3 = (Integer)request.getAttribute("duration3"); %><%= duration3%> hours</lable><br><br>
<lable >Task 4 : <%String task4 = (String)request.getAttribute("task4"); %><%= task4%></lable><br>
<lable > Duration  : <%int duration4 = (Integer)request.getAttribute("duration4"); %><%= duration4%> hours</lable><br><br>
<lable > Task 5 : <%String task5 = (String)request.getAttribute("task5"); %><%= task5%></lable><br>
<lable > Duration  : <%int duration5 = (Integer)request.getAttribute("duration5"); %><%= duration5%> hours</lable><br><br>
<lable >Task 6 : <%String task6 = (String)request.getAttribute("task6"); %><%= task6%></lable><br>
<lable > Duration  : <%int duration6 = (Integer)request.getAttribute("duration6"); %><%= duration6%> hours</lable><br><br>
<lable > Task 7 : <%String task7 = (String)request.getAttribute("task7"); %><%= task7%></lable><br>
<lable > Duration  : <%int duration7 = (Integer)request.getAttribute("duration7"); %><%= duration7%> hours</lable><br><br>
<lable > Task 8 : <%String task8 = (String)request.getAttribute("task8"); %><%= task8%></lable><br>
<lable > Duration  : <%int duration8 = (Integer)request.getAttribute("duration8"); %><%= duration8%> hours</lable><br>
</h4>
<h2>
<lable> Total Hours of Work  : <%int total = (Integer)request.getAttribute("total"); %><%= total%> hours</lable><br><br>
</h2>
</body>
</html>