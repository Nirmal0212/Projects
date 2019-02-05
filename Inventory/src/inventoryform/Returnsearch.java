package inventoryform;

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

public class Returnsearch extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
	

		String empid="";
		String empname="";
		String dor="";
		String tor="";
		
		
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		       
		Connection con = DriverManager.
           getConnection("jdbc:oracle:thin:@192.168.1.154:1523:orcl"
               ,"NIRMAL","nirmal");
		
       Statement stmt = con.createStatement();
       
       empid = req.getParameter("empid");
	        
       ResultSet  rs =stmt.executeQuery("SELECT * FROM DILIGENTSQUADRETURN WHERE EMPID='"+empid+"'");
		

          while(rs.next()) 
          {
        	  
        	empid = (String) rs.getObject("empid");
           
            empname = (String) rs.getObject("empname");
          
            dor = (String) rs.getObject("dor");
           
            tor = (String) rs.getObject("tor");
                                
          }
		}
		
		catch (SQLException | ClassNotFoundException  e1) 
		{		
		e1.printStackTrace();
	    }
		
		req.setAttribute("empid",empid);
		req.setAttribute("empname",empname);
		req.setAttribute("dor",dor);
		req.setAttribute("tor",tor);
		
		req.getRequestDispatcher("printvaluereturn.jsp").forward(req, resp);

	}

		
	}
	