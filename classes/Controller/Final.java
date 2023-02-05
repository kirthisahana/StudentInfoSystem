//Final.java

package Controller;
import Model.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;


public class Final extends HttpServlet //throws IOException,ServletException,Exception
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		

		String dept = request.getParameter("dept");
		
		//String column=""; boolean ans; String subject=""; int available=0; int p=0;
		response.setContentType("text/html");
        PrintWriter out= response.getWriter();
		
		
    out.println("<html>");
            out.println("<style>");
            out.println("table {");
            out.println("border-collapse: separate;");
out.println("border-spacing: 0 15px;");
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
		  
          AdminModel y = new AdminModel();
          ResultSet a= y.fetchmarksbydept(dept);
          out.println("<table>");
          out.println("<tr> ");
              out.println("<th> REGNUM </th> <th> YEAR </th> <th> SUB </th><th> SUB  </th><th> SUB </th><th> MARK </th><th> MARK </th><th> MARK </th> ");
              out.println("</tr> ");
          while(a.next())
          {              
              out.println("<tr> ");
              out.println("<td>"+a.getString(1)+" </td> <td>"+a.getString(2)+"</td> <td>"+a.getString(3)+"</td> <td>"+a.getString(4)+"</td ><td>"+a.getString(5)+"</td> ");
              out.println("<td>"+a.getString(6)+" </td> <td>"+a.getString(7)+"</td>  <td>"+a.getString(8)+"</td>  ");
              out.println("</tr> ");
              

          }
          out.println("</table>");
     }// try-end
	 
	 catch(Exception E)
     {
      System.out.println(E); 
      }	
    }
}
