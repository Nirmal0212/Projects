<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>

<head>
<style>

body {background-color: #009999; text-align: center; color: black;font-style: italic;font-family:Monaco;}

h1 {color: #ff6600;text-align: center;}


</style>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>MANAGEMENT</title>

</head>

<body>

<h1>MANAGEMENT TEAM</h1><br>

<form action="management" method="post">

Employee ID :&nbsp;&nbsp;&nbsp;<input type="text" name="empid" placeholder="emp id" /><br/><br>

Employee Name :&nbsp;&nbsp;&nbsp;<input type="text" name="empname" placeholder="emp name" /><br/><br> 

Date :&nbsp;&nbsp;&nbsp;<input type="text" name="date1" placeholder="date" /><br/><br> 

Task :
<select name="task1" >
  <option value="notask">No Task</option>
  <option value="clientcall">Client Call</option>
  <option value="ticketupdation">Ticket Updation</option>
  <option value="schedulepreparation">Schedule Preparation</option>
 
  
</select>

&nbsp;&nbsp;&nbsp;

Duration :&nbsp;<input type="text" name="duration1" placeholder="hours" />hours<br/><br> 
 
 Task :
<select name="task2" >
  <option value="notask">No Task</option>
  <option value="clientcall">Client Call</option>
  <option value="ticketupdation">Ticket Updation</option>
  <option value="schedulepreparation">Schedule Preparation</option>
 
  
</select>

&nbsp;&nbsp;&nbsp;

Duration :&nbsp;<input type="text" name="duration2" placeholder="hours" />hours<br/><br> 
 
 Task :
<select name="task3" >
 <option value="notask">No Task</option>
  <option value="clientcall">Client Call</option>
  <option value="ticketupdation">Ticket Updation</option>
  <option value="schedulepreparation">Schedule Preparation</option>
 
</select>

&nbsp;&nbsp;&nbsp;

Duration :&nbsp;<input type="text" name="duration3" placeholder="hours" />hours<br/><br> 
 
 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

<input type="submit" value="Submit"/>  &nbsp;&nbsp;&nbsp;

<button type="reset" value="Reset">Reset</button>

</form>
<br><br>
<form action="Managesearchfor.jsp">

Want to Search Employee Details ?&nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="SEARCH FOR"/> 

</form>

</body>

</html>