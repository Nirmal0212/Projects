<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<style>

body {background-color: #009999; font-size: 200%; text-align: center; color: black ;font-style: italic;font-family:Monaco;}

h1 {color: #ff6600 ;text-align: center; font-size: 200%}
h4 {color:black;}


</style>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Enter Employee Details</title>
<h1 >EMPLOYEE DOB</h1>
</head>
<body>
<strong>
 <script>
    function myFunction() 
    {
      var a = document.forms["add"]["empid"].value;
      var b = document.forms["add"]["firstname"].value;
      var c = document.forms["add"]["lastname"].value;
      var d = document.forms["add"]["dob"].value;
      
      if (a == "" || b == ""|| c == ""|| d == "") 
      {
        error = "All fields must be entered";
        
        document.getElementById("errorid").innerHTML = error;
      }
    }
  </script>
<form name="add" action="adding" method="post">

Employee ID :<input type="text" name="empid" placeholder="Emp ID..." /><br/>
First Name :<input type="text" name="firstname" placeholder="First Name..."/><br/> 
Last Name :<input type="text" name="lastname" placeholder="Last Name..." /><br/> 
Date Of Birth :<input type="text" name="dob"  placeholder="D.O.B..." /><br/>  

<p id="errorid"></p>
<input onclick="myFunction()" type="submit" value="ADD"/>  
</form>
<br><br><br>

<form action="searchfor.jsp">

Want to Search Employee DOB?    <input type="submit" value="SEARCH FOR"/>  
  
</form>
</strong>
</body>
</html>