//Last.java


package Controller;
import Model.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;


public class Last extends HttpServlet //throws IOException,ServletException,Exception
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		

		String x = request.getParameter("reg");
		response.setContentType("text/html");
        PrintWriter out= response.getWriter();
         try{
        //StudModel sm= new StudModel();
        out.println("<style> ");
        out.println(".form-style, #result{");
          out.println("max-width: 500px;");
    out.println("padding: 10px 20px;");
                        out.println(" background: #f4f7f8;");
                         out.println("margin: 10px auto;");
                         out.println("padding: 20px;");
                         out.println("background: #f4f7f8;");
                         out.println("border-radius: 8px;");
                         out.println("font-family: Georgia, 'Times New Roman', Times, serif;");
                        out.println("}");
                       out.println(".form-style fieldset{");
                        out.println("border: none;");
                        out.println("}");
                       out.println(" .form-style legend {");
                        out.println("font-size: 1.4em;");
                        out.println("margin-bottom: 10px;");
                        out.println("}");
        
        out.println("</style> ");
        out.println("<form class='form-style'> ");
        //out.println("<input type='hidden' name='reg' id='reg'  value='"+x+"'>   ");
        out.println("view marks by dept :<br> ");
        out.println("<select name='id1' id='id1'   > ");
        out.println("<option value='cse'> CSE </option>  ");
        out.println("<option value='ece'> ECE </option> ");
        
        out.println(" </select><br><br>");
        
           out.println("<input type='button' value='Submit'  onclick='somefunc(id1.value)'  id='b4'> ");
           out.println("</form>");
           
       // ResultSet res= sm.getmarks(x);
        System.out.println("in the marks function, result set is received");
        }//try-end

        catch(Exception E){System.out.println(E);}

	}
}		
    
