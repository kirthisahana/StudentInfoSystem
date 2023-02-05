// DisplayTopper.java

//Details.java


package Controller;
import Model.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;


public class DisplayTopper extends HttpServlet //throws IOException,ServletException,Exception
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		

		String dept = request.getParameter("dept"); String year = request.getParameter("year");
		System.out.println("in display topper function : year : "+ year); System.out.println("in display topper function : dept : "+ dept);
		response.setContentType("text/html");
        PrintWriter out= response.getWriter(); String r=""; String curyear="";
        //out.println("shabbbaaaa..... IN DETAILS FUNCTION- REGISTER NUMBER IS: "+x);
         try{
        AdminModel z= new AdminModel();
        ResultSet res= z.getmaxtotal(dept, year);
        System.out.println("in the details function, result set is received");
        //out.println("shabbbaaaa..... IN MODIFIED  DETAILS FUNCTION- REGISTER NUMBER IS: "+x);
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
        out.println("<table>");
        out.println("<tr>");
        out.println("<th> REGNUM </th> <th> SEC </th> <th> TOTAL </th> ");
        out.println("</tr>");
        while(res.next())
        {
          
        
         out.println("<tr>");
         out.println("<td>"+res.getString(1)+" </td> <td>"+res.getString(2)+"</td>  <td>"+res.getString(3)+"</td>  ");
         out.println("</tr> ");
         
        }
        out.println("</table>");
        //out.println(".........................................................");
        }//try-end

        catch(Exception E){System.out.println(E);}

	}
}		
    
