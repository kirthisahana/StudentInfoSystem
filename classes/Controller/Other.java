//Other.java


package Controller;
import Model.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;


public class Other extends HttpServlet //throws IOException,ServletException,Exception
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{

      String r=  request.getParameter("reg");
      System.out.println("In transport other register number is : "+r);
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
        StudModel sm= new StudModel();
        ResultSet res= sm.getother(r);
        System.out.println("in the details function, result set is received");
        //out.println("shabbbaaaa..... IN MODIFIED  DETAILS FUNCTION- REGISTER NUMBER IS: "+x);

        out.println("<table>");
        while(res.next())
        {
          
         out.println("<tr><th> REGISTER NUMBER: </th><td>"+res.getString(1)+"</td></tr>");
         out.println("<tr><th> DAYSCHOLLAR/HOSTELLAR: </th><td>"+res.getString(2)+"</td></tr>");
         if(res.getString(2).equals("d"))
         {
           out.println("<tr><th> BUS NUMBER : </th><td>"+res.getString(3)+"</td></tr>");
           out.println("</table>");
           out.println("<br><br>");
           out.println("Available Bus routes : <br>");
           StudModel d= new StudModel();
           ResultSet bin= d.getallbus();
           out.println("<table>");
           while(bin.next())
           {
             out.println("<tr><th> BUS NUMBER: </th><td>"+bin.getString(1)+"</td></tr>");
             out.println("<tr><th> BUS ROUTE: </th><td>"+bin.getString(2)+"</td></tr>");
           }
           out.println("</table>");

         }
         else
         {
         	out.println("<tr><th> ROOM NUMBER : </th><td>"+res.getString(3)+"</td></tr>");
         }


        }// while end
        
        

        }//try end

        catch(Exception E){System.out.println(E);}


      


	}


}// end of other-class