package timesheet;

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

public class Searchingmanag extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{

		String empid="";
		String empname="";
		String date1="";
		String task1="";
		int duration1=0;
		String task2="";
		int duration2=0;
		String task3="";
		int duration3=0;
		int total=0;
		
		
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		       
		Connection con = DriverManager.
           getConnection("jdbc:oracle:thin:@192.168.1.154:1523:orcl"
               ,"NIRMAL","nirmal");
		
       Statement stmt = con.createStatement();
       
       empid = req.getParameter("empid");
	        
       ResultSet  rs =stmt.executeQuery("SELECT * FROM MANAGEMENT WHERE EMPID='"+empid+"'");
		

          while(rs.next()) 
          {
        	  
        	  empid = (String) rs.getObject("empid");
           
            empname = (String) rs.getObject("empname");
         
         	 date1 = (String) rs.getObject("date1");
    		  
            task1 = (String) rs.getObject("task1");
            
            duration1 = rs.getInt("duration1");
            
            task2 = (String) rs.getObject("task2");
            
            duration2 = rs.getInt("duration2");
            
            task3 = (String) rs.getObject("task3");
            
            duration3 = rs.getInt("duration3");
             
            total = (duration1+duration2+duration3);

            
          }
		}
		
		catch (SQLException | ClassNotFoundException  e1) 
		{		
		e1.printStackTrace();
	    }
		
		
		req.setAttribute("empid",empid);
		req.setAttribute("empname",empname);
		req.setAttribute("date1",date1);
		req.setAttribute("task1",task1);
		req.setAttribute("duration1",duration1);
		req.setAttribute("task2",task2);
		req.setAttribute("duration2",duration2);
		req.setAttribute("task3",task3);
		req.setAttribute("duration3",duration3);
		req.setAttribute("total",total);

		req.getRequestDispatcher("printvaluemanag.jsp").forward(req, resp);

	}
	}

	

