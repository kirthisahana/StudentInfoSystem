//CourseHand.java

package Controller;
import Model.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;


public class CourseHand extends HttpServlet //throws IOException,ServletException,Exception
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		

		String x = request.getParameter("fnum");
		response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        out.println("<style>");
        out.println("table {");
out.println("  border-collapse: separate;");
out.println("  border-spacing: 0 15px;");
out.println("}");

out.println("th {");
out.println("  background-color: #4287f5;");
out.println("  color: white;");
out.println("}");

out.println("th,");
out.println("td {");
out.println("  width: 150px;");
out.println("  text-align: center;");
out.println("  border: 1px solid black;");
out.println("  padding: 5px;");
out.println("}");
out.println("</style>");
         try{
        FacultyModel fm= new FacultyModel();
        ResultSet res= fm.getcourses(x);

        out.println("COURSES HANDLED BY: "+x);
        out.println("<table>");
         out.println(" <tr>  <th> COURSE CODE </th> <th> DEPARTMENT </th>");
           out.println("  <th> YEAR HANDLED </th> <th> SECTION </th>  </tr>");
        while(res.next())
        {
        	/*
         out.println("<tr><th> COURSE CODE  : </th><td>"+res.getString(5)+"</td></tr>"); 
         out.println("<tr><th>  DEPARTMENT: </th><td>"+res.getString(2)+"</td></tr>");
          out.println("<tr><th> YEAR HANDLED </th><td>"+res.getString(3)+"</td></tr>");
           out.println("<tr><th> SECTION : </th><td>"+res.getString(4)+"</td></tr>"); */

          out.println("<tr>");
          out.println("<td> "+res.getString(5)+"</td> ");
          out.println("<td> "+res.getString(2)+"</td> ");
          out.println("<td> "+res.getString(3)+"</td> ");
          out.println("<td> "+res.getString(4)+"</td> ");

          out.println("</tr> ");
           
        
        }
        out.println("</table>");
        }//try-end

        catch(Exception E){System.out.println(E);}

	}
}		
    
