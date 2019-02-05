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

public class Issueinsert extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		
		String empid;
		String empname;
		String dname;
		String icode;
		String doi;
		String toi;
		String laptop;
		String mouse;
		String keyboard;
		String others;
		
		
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
      
       empname = req.getParameter("empname");
      
       dname = req.getParameter("dname");
       
       icode = req.getParameter("icode");
 
       doi = req.getParameter("doi");
      
       toi = req.getParameter("toi");

       laptop = req.getParameter("laptop");
       
       mouse = req.getParameter("mouse");
        
       keyboard = req.getParameter("keyboard");
       
       others = req.getParameter("others");
       
    stmt.executeQuery("insert into DILIGENTSQUAD (empid,empname,dname,icode,doi,toi,laptop,mouse,keyboard,others) VALUES('" +empid+ "','" +empname+"','"+dname+"','"+icode+"','"+doi+"','"+toi+"','"+laptop+"','"+mouse+"','"+keyboard+"','"+others+"')");
		
	    }
		
		catch (SQLException | ClassNotFoundException  e1) 
		{		
		e1.printStackTrace();
	    }
		
		resp.sendRedirect("Successfull.jsp");
		
	}
	}
	
	


