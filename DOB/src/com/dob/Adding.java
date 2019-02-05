package com.dob;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Adding extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		String empid;
		String firstname;
		String lastname;
		String dob;
  
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
        
		//System.out.println("before");
       
		Connection con = DriverManager.
           getConnection("jdbc:oracle:thin:@192.168.1.154:1523:orcl"
               ,"NIRMAL","nirmal");
		
	   // System.out.println("Created DB Connection....");
		
	    //System.out.println("after");
       
       Statement stmt = con.createStatement();
		
      
       empid = req.getParameter("empid");
       firstname = req.getParameter("firstname");
       lastname = req.getParameter("lastname");
       dob = req.getParameter("dob");

       stmt.executeQuery("insert into emp(empid,firstname,lastname,dob) VALUES('" +empid+ "','" +firstname+ "','" +lastname+ "','" +dob+ "')");
		
	    }
		
		catch (SQLException | ClassNotFoundException  e1) 
		{		
		e1.printStackTrace();
	    }
		
		 resp.sendRedirect("Successfull.jsp");
		
	}
	
	
	
}
