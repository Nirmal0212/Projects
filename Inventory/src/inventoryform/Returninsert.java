package inventoryform;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Returninsert extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
	

		String empid;
		String empname;
		String dor;
		String tor;
		
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		
        
		//System.out.println("before");
       
		Connection con = DriverManager.
           getConnection("jdbc:oracle:thin:@192.168.1.154:1523:orcl"
               ,"NIRMAL","nirmal");
		
	  //  System.out.println("Created DB Connection....");
		
	    //System.out.println("after");
       
       Statement stmt = con.createStatement();
   
       empid = req.getParameter("empid");
      
       empname = req.getParameter("empname");
  
       dor = req.getParameter("dor");
      
       tor = req.getParameter("tor");

       
    stmt.executeQuery("insert into DILIGENTSQUADRETURN (empid,empname,dor,tor) VALUES('" +empid+ "','" +empname+"','"+dor+"','"+tor+"')");
		
	    }
		
		catch (SQLException | ClassNotFoundException  e1) 
		{		
		e1.printStackTrace();
	    }
		
		resp.sendRedirect("Successfull.jsp");
		
	}
	}