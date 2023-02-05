// EditMarks.java

// ViewStud.java


package Controller;
import Model.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;


public class EditMarks extends HttpServlet //throws IOException,ServletException,Exception
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		

		String x = request.getParameter("fnum");
		System.out.println("Shabbaaa.... in edit marks function : f num : "+ x);
		response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        //out.println("shabbbaaaa..... IN DETAILS FUNCTION- REGISTER NUMBER IS: "+x);
        out.println("<html>");
        out.println("<style>");
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
        out.println("</style>");
         try{
        out.println("<form class='form-style'>");

        out.println("<input type='hidden' name='fnum' id='fnum'  value='"+x+"'>   ");
        out.println("Select Student department: <br>");

        out.println("<select name='id1' id='id1' > ");
        out.println("<option value='cse'> CSE </option>  ");
        out.println("<option value='ece'> ECE </option> ");
        out.println(" </select><br><br>");
        
        out.println("Select Student year:<br> ");
        out.println("<select id='id2' name='id2'> ");
        out.println("<option value='1'> 1 </option> ");
         out.println("<option value='2'> 2 </option> ");
         out.println("<option value='3'> 3 </option> ");
         out.println("</select><br><br>");

          out.println("Select  section:<br> ");
          out.println("<select id='id3' name='id3' > ");
          out.println("<option value='a'> A section </option> ");
          out.println("<option value='b'> B section </option> ");
           out.println("</select>");
           out.println("<br>  <br> ");

           out.println("Select  subject:<br> ");
          out.println("<select id='id4' name='id4' > ");
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
           out.println("ENTER THE REG NUM:<br> ");
           out.println("<input type='text' name='regnum' id='regnum'> <br><br>");
           out.println("ENTER MARKS TO BE UPDATED:<br> ");
           out.println("<input type='text' name='update' id='update'><br><br> ");
           out.println("<input type='button' value='Submit'  onclick='wattofunc(fnum.value,id1.value, id2.value, id3.value, id4.value, regnum.value, update.value)'  id='bbb4'> ");
           out.println("</form>");
           
       // ResultSet res= sm.getmarks(x);
        System.out.println("in the edit marks function, result set is received");
        //out.println("shabbbaaaa..... IN MODIFIED  DETAILS FUNCTION- REGISTER NUMBER IS: "+x);
        //out.println("<table>");
        //while(res.next())
        //{
          
         
        
        //}
        //out.println("</table>");
        //out.println(".........................................................");
        out.println("</html>");
        }//try-end

        catch(Exception E){System.out.println(E);}

	}
}		
    
