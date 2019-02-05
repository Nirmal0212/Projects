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

public class Issuesearch extends HttpServlet
{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		

		String empid="";
		String empname="";
		String dname="";
		String icode="";
		String doi="";
		String toi="";
		String laptop="";
		String mouse="";
		String keyboard="";
		String others="";
		
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
		       
		Connection con = DriverManager.
           getConnection("jdbc:oracle:thin:@192.168.1.154:1523:orcl"
               ,"NIRMAL","nirmal");
		
       Statement stmt = con.createStatement();
       
       empid = req.getParameter("empid");
	        
       ResultSet  rs =stmt.executeQuery("SELECT * FROM DILIGENTSQUAD WHERE EMPID='"+empid+"'");
		

          while(rs.next()) 
          {
        	  
        	  empid = (String) rs.getObject("empid");
           
            empname = (String) rs.getObject("empname");
         
            dname = (String) rs.getObject("dname");
    		  
            icode = (String) rs.getObject("icode");
            
           
            
            doi = (String) rs.getObject("doi");
            
            
            toi = (String) rs.getObject("toi");
            
            
            laptop = (String) rs.getObject("laptop");
            
            
            mouse = (String) rs.getObject("mouse");
            
            
            keyboard = (String) rs.getObject("keyboard");
            
            
            others = (String) rs.getObject("others");
            
                      
          }
		}
		
		catch (SQLException | ClassNotFoundException  e1) 
		{		
		e1.printStackTrace();
	    }
		
		
		req.setAttribute("empid",empid);
		req.setAttribute("empname",empname);
		req.setAttribute("dname",dname);
		req.setAttribute("icode",icode);
		req.setAttribute("doi",doi);
		req.setAttribute("toi",toi);
		req.setAttribute("laptop",laptop);
		req.setAttribute("mouse",mouse);
		req.setAttribute("keyboard",keyboard);
		req.setAttribute("others",others);
		
		req.getRequestDispatcher("printvalueissue.jsp").forward(req, resp);

	}

		
	}
	
	


