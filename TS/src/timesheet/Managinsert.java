package timesheet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Managinsert extends HttpServlet 
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		

		String empid;
		String empname;
		String date1;
		String task1;
		int duration1;
		String task2;
		int duration2;
		String task3;
		int duration3;
				
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
        
		//System.out.println("before");
       
		Connection con = DriverManager.
           getConnection("jdbc:oracle:thin:@192.168.1.154:1523:orcl"
               ,"NIRMAL","nirmal");
		
	    //System.out.println("Created DB Connection....");
		
	    //System.out.println("after");
       
       Statement stmt = con.createStatement();
       

       empid = req.getParameter("empid");
      
       empname = req.getParameter("empname");
      
       date1 = req.getParameter("date1");
       
       task1 = req.getParameter("task1");

       duration1 = Integer.parseInt(req.getParameter("duration1"));
       
       task2 = req.getParameter("task2");
       
       duration2 = Integer.parseInt(req.getParameter("duration2"));
       
       task3 = req.getParameter("task3");

       duration3 = Integer.parseInt(req.getParameter("duration3"));
             
       
       stmt.executeQuery("insert into management(empid,empname,date1,task1,duration1,task2,duration2,task3,duration3) VALUES('" +empid+ "','" +empname+"','"+date1+"','"+task1+"','"+duration1+"','"+task2+"','"+duration2+"','"+task3+"','"+duration3+"')");
		
	    }
		
		catch (SQLException | ClassNotFoundException  e1) 
		{		
		e1.printStackTrace();
	    }
		
		resp.sendRedirect("Successfull.jsp");
			
	}
	
}
