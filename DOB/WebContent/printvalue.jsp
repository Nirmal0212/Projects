<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>

body {background-color: #009999;color: #ff6600; font-size: 150%; font-style: italic;font-family:Monaco;}

h4 {color: #ff6600 ;text-align: center;font-style: italic;}
h1 {color: black ;text-align: center;font-style: italic;}

</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee's DoB</title>
<BR><BR>
<h1>Employee's Date of Birth</h1>
</head>
<body>
<h4><lable > Employee Id : <%int empid = (Integer)request.getAttribute("empid"); %><%= empid%></lable><br><br>
<lable >First name: <%String firstname = (String)request.getAttribute("firstname"); %><%= firstname%></lable><br><br>
<lable > Last name: <%String lastname = (String)request.getAttribute("lastname"); %><%= lastname%></lable><br><br>
<lable > Date Of Birth : <%String dob = (String)request.getAttribute("dob"); %><%= dob%></lable><br><br>
</h4>

</body>
</html>