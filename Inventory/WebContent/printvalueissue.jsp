<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style>

body {background-color: #009999;color: black; font-size: 150%; font-style: italic;font-family:Monaco;}

h1 {color: #ff6600;text-align: center;}

h4 {color: black;text-align: center;}


</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Item Issued Details</title>
</head>
<body>
<h1>Item Issued Details</h1>
<h4>

<lable > Employee Id : <%String empid = (String)request.getAttribute("empid"); %><%= empid%></lable><br><br>
<lable > Employee name : <%String empname = (String)request.getAttribute("empname"); %><%= empname%></lable><br><br>
<lable > Department Name : <%String dname = (String)request.getAttribute("dname"); %><%= dname%></lable><br><br>
<lable > Inventory Code : <%String icode = (String)request.getAttribute("icode"); %><%= icode%></lable><br><br>
<lable > Date of Issue : <%String doi = (String)request.getAttribute("doi"); %><%= doi%></lable><br><br>
<lable > Time of Issue : <%String toi = (String)request.getAttribute("toi"); %><%= toi%></lable><br><br>
<lable > Laptop : <%String laptop = (String)request.getAttribute("laptop"); %><%= laptop%></lable><br><br>
<lable > Mouse : <%String mouse = (String)request.getAttribute("mouse"); %><%= mouse%></lable><br><br>
<lable > Keyboard : <%String keyboard = (String)request.getAttribute("keyboard"); %><%= keyboard%></lable><br><br>
<lable > Others : <%String others = (String)request.getAttribute("others"); %><%= others%></lable><br><br>

</h4>

</body>
</html>