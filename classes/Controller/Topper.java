// Topper.java


package Controller;
import Model.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;


public class Topper extends HttpServlet //throws IOException,ServletException,Exception
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        
         try{
        
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
        
        out.println("Select dept: <br> ");
        out.println("<select name='dept' id='dept'  > ");
        out.println("<option value='cse'> CSE DEPT </option>  ");
        out.println("<option value='ece'> ECE DEPT </option> ");
        out.println("</select>");
        out.println("<br>  <br> ");
        out.println("Select year: <br>");
        out.println("<select id='year' name='year'> ");
        out.println("<option value='1'> 1 </option> ");
         out.println("<option value='2'> 2 </option> ");
         out.println("<option value='3'> 3 </option> ");
           out.println("</select>");
           out.println("<br>  <br> ");

           out.println("<input type='button' value='Submit'  onclick='epicfunc(dept.value,year.value,)'  id='b4'> ");
           out.println("</form>");
           
      
        }//try-end

        catch(Exception E){System.out.println(E);}

	}
}		
    
