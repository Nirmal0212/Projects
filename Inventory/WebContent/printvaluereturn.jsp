<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style>

body {background-color: #009999;color: black; font-size: 150%; text-align: center; font-style: italic;font-family:Monaco;}

h1 {color: #ff6600;text-align: center;}

h4 {color: black;text-align: center;}


</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Item Return Details</title>

</head>
<body>

<h1>Item Returned Details</h1>
<h4>

<lable > Employee Id : <%String empid = (String)request.getAttribute("empid"); %><%= empid%></lable><br><br>
<lable >Employee name : <%String empname = (String)request.getAttribute("empname"); %><%= empname%></lable><br><br>
<lable > Date of Return : <%String dor = (String)request.getAttribute("dor"); %><%= dor%></lable><br><br>
<lable > Time of Return : <%String tor = (String)request.getAttribute("tor"); %><%= tor%></lable><br><br>

</h4>

</body>
</html>