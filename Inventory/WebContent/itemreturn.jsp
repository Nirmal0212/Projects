<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style>

body {background-color: #009999; text-align: center;font-size: 150%; color: black;font-style: italic;font-family:Monaco;}

h1 {color: #ff6600;text-align: center;}
h4 {color: #ff6600;}


</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="returnadding" method="post">

<h4> To be filled by IT department after laptop is received..</h4>

Employee ID :&nbsp;&nbsp;&nbsp;<input type="text" name="empid" placeholder="emp id" /><br/><br>
Employee Name :&nbsp;&nbsp;&nbsp;<input type="text" name="empname" placeholder="emp name" /><br/><br> 
Date of return :&nbsp;&nbsp;&nbsp;<input type="text" name="dor" placeholder="date of return" /><br/><br>
Time of return :&nbsp;&nbsp;&nbsp;<input type="text" name="tor" placeholder="time of return" /><br/><br>

<input type="submit" value="Submit"/>  
<button type="reset" value="Reset">Reset</button>

</form>
<br><br>

<form action="returnsearch.jsp">

Want to Search return Details ?&nbsp;&nbsp;<input type="submit" value="SEARCH FOR"/> 

</form>

</body>
</html>