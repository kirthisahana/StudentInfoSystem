// Marks.java




package Controller;
import Model.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;


public class Marks extends HttpServlet //throws IOException,ServletException,Exception
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
        out.println("#id2 {display: none;} ");
        out.println("</style> ");
        out.println("<form class='form-style'> ");
        out.println("<input type='hidden' name='reg' id='reg'  value='"+x+"'>   ");
        out.println("view marks by:<br> ");
        out.println("<select name='id1' id='id1' onchange='myfunc()'  > ");
        out.println("<option value='current'> CURRENT YEAR </option>  ");
        out.println("<option value='prev'> PREVIOUS YEARS </option> ");
        out.println("<option value='coursecode'> COURSE CODE </option> ");
        out.println(" </select><br><br>");
        out.println("<select id='id2' name='id2'> ");
        out.println(" <option value='none'> NONE </option>");
        out.println("<option value='s1'> S1 </option> ");
         out.println("<option value='s2'> S2 </option> ");
         out.println("<option value='s3'> S3 </option> ");
         out.println("<option value='s4'> S4 </option> ");
          out.println("<option value='s5'> S5 </option> ");
          out.println("<option value='s6'> S6 </option> ");
          out.println("<option value='s7'> S7 </option> ");
         out.println("<option value='s8'> S8 </option> ");
          out.println("<option value='s9'> S9 </option> ");
          out.println("<option value='s10'> S10 </option> ");
           out.println("<option value='s11'> S11 </option> ");
            out.println("<option value='s12'> S12 </option> ");
           out.println("</select>");
           out.println("<br>  <br> ");
           out.println("<input type='button' value='Submit'  onclick='blahfunc(reg.value,id1.value, id2.value)'  id='b4'> ");
           out.println("</form>");
           
       // ResultSet res= sm.getmarks(x);
        System.out.println("in the marks function, result set is received");
        }//try-end

        catch(Exception E){System.out.println(E);}

	}
}		
    
