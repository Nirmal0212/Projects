<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style>

body {background-color: #009999; text-align: center; color: black; font-style: italic;font-family:Monaco;}

h1 {color: #ff6600;text-align: center;}
h4 {color: #ff6600;text-align: center;}


</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LAPTOP REQUISITION FORM</title>
</head>
<body>
<h1>INVENTORY MANAGEMENT SYSTEM</h1>
<h4> To be filled by user at the time of issuing a laptop..</h4>


<form action="issueadding" method="post">
<table align="center">
<tr><td>
Employee ID :&nbsp;&nbsp;&nbsp;<input type="text" name="empid" placeholder="emp id" /><br/><br>
</td></tr>
<tr><td>
Employee Name :&nbsp;&nbsp;&nbsp;<input type="text" name="empname" placeholder="emp name"/><br/><br> 
</td></tr><tr><td>
Department Name :&nbsp;&nbsp;&nbsp;<input type="text" name="dname" placeholder="department name" /><br/><br> 
</td></tr><tr><td>
Inventory Code :&nbsp;&nbsp;&nbsp;<input type="text" name="icode" placeholder="inventory code" /><br/><br>  
</td></tr><tr><td>
Date of Issue :&nbsp;&nbsp;&nbsp;<input type="text" name="doi" placeholder="date of issue" /><br/><br>
</td></tr><tr><td>
Time of Issue :&nbsp;&nbsp;&nbsp;<input type="text" name="toi" placeholder="time of issue" /><br/><br>
</td></tr><tr><td>
Laptop :&nbsp;&nbsp;&nbsp;<input type="text" name="laptop" placeholder="Yes or No ?" /><br/><br> 
</td></tr><tr><td>
Mouse :&nbsp;&nbsp;&nbsp;<input type="text" name="mouse" placeholder="Yes or No ?" /><br/><br> 
</td></tr><tr><td>
Keyboard :&nbsp;&nbsp;&nbsp;<input type="text" name="keyboard" placeholder="Yes or No ?"/><br/><br> 
</td></tr><tr><td>
Others :&nbsp;&nbsp;&nbsp;<input type="text" name="others" placeholder="What u get ?"/><br/><br> 
</td></tr> </table>

<input type="submit" value="Submit"/>  
<button  type="reset" value="Reset">Reset</button>

</form>
<form action="itemreturn.jsp" align="center">

Want to insert details for Item Return ?<input type="submit" value="ITEM RETURN"/> 

</form>

<br>
<form action="issuesearch.jsp" align="center">

Want to Search Employee Details ?<input type="submit" value="SEARCH FOR"/> 

</form>

<br><br>

</body>
</html>