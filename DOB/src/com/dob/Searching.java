package com.dob;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Searching extends HttpServlet 
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		   int empid=0;
		   int id = 0;
		   String firstname = "",lastname = "",dob = "";
		   
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		       
		Connection con = DriverManager.
           getConnection("jdbc:oracle:thin:@192.168.1.154:1523:orcl"
               ,"NIRMAL","nirmal");
		
       Statement stmt = con.createStatement();
		
       empid = Integer.parseInt(req.getParameter("empid"));
    
       ResultSet  rs =stmt.executeQuery("SELECT * FROM EMP WHERE EMPID='"+empid+"'");
		

          while(rs.next()) 
          {
        	  
        	id = rs.getInt(1);
           
            firstname = (String) rs.getObject("firstname");
         
         	lastname = (String) rs.getObject("lastname");
    		  
            dob = (String) rs.getObject("dob");
          }
		}
		
		catch (SQLException | ClassNotFoundException  e1) 
		{		
		e1.printStackTrace();
	    }
		
		
		req.setAttribute("empid",id);
		req.setAttribute("firstname",firstname);
		req.setAttribute("lastname",lastname);
		req.setAttribute("dob",dob);
		
		req.getRequestDispatcher("printvalue.jsp").forward(req, resp);

		}
}
