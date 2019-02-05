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

public class Searchingdev  extends HttpServlet
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
		String task4="";
		int duration4=0;
		String task5="";
		int duration5=0;
		String task6="";
		int duration6=0;
		String task7="";
		int duration7=0;
		String task8="";
		int duration8=0;
		int total=0;
		
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		       
		Connection con = DriverManager.
           getConnection("jdbc:oracle:thin:@192.168.1.154:1523:orcl"
               ,"NIRMAL","nirmal");
		
       Statement stmt = con.createStatement();
       
       empid = req.getParameter("empid");
	        
       ResultSet  rs =stmt.executeQuery("SELECT * FROM DEV WHERE EMPID='"+empid+"'");
		

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
            
            task4 = (String) rs.getObject("task4");
            
            duration4 = rs.getInt("duration4");
            
            task5 = (String) rs.getObject("task5");
            
            duration5 = rs.getInt("duration5");
            
            task6 = (String) rs.getObject("task6");
            
            duration6 = rs.getInt("duration6");
            
            task7 = (String) rs.getObject("task7");
            
            duration7 = rs.getInt("duration7");
            
            task8 = (String) rs.getObject("task8");
            
            duration8 = rs.getInt("duration8");
            
            total = (duration1+duration2+duration3+duration4+duration5+duration6+duration7+duration8);
            
                      
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
		req.setAttribute("task4",task4);
		req.setAttribute("duration4",duration4);
		req.setAttribute("task5",task5);
		req.setAttribute("duration5",duration5);
		req.setAttribute("task6",task6);
		req.setAttribute("duration6",duration6);
		req.setAttribute("task7",task7);
		req.setAttribute("duration7",duration7);
		req.setAttribute("task8",task8);
		req.setAttribute("duration8",duration8);
		req.setAttribute("total",total);
		
	
		req.getRequestDispatcher("printvaluedev.jsp").forward(req, resp);

	}

	

}
