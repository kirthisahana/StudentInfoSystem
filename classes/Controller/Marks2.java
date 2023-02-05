// Marks2.java

package Controller;
import Model.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;


public class Marks2 extends HttpServlet //throws IOException,ServletException,Exception
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		

		String x = request.getParameter("id1");
		String y = request.getParameter("id2");
		String r=  request.getParameter("r");
		String column=""; boolean ans; String subject=""; int available=0; int p=0;
		response.setContentType("text/html");
        PrintWriter out= response.getWriter();
		System.out.println("Shabbaaa.... in marks222222 function : choice : "+ x);
		System.out.println("Shabbaaa.... in marks222222 function : subject code : "+ y);
		System.out.println("shabbaaaa..... in marks 22222 function : register number:" +r);
		out.println("<br><br><br>");
		StudModel sm= new StudModel();
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
		  String curyear= sm.getcurrentyear(r);
          System.out.println("Given current year of the student is"+curyear);
		
          if(x.equals("current"))
          {
            StudModel m = new StudModel();
          	ResultSet a = m.getcurrentmarks(r,curyear);
            
          	out.println("<table>");
          	while(a.next())
          	{
              out.println("<tr><th> REGISTER NUMBER: </th><td>"+a.getString(1)+"</td></tr> ");
              out.println("<tr><th>  YEAR : </th><td>"+a.getString(2)+"</td></tr> ");
               out.println("<tr><th> DEPT: </th><td>"+a.getString(9)+"</td></tr> ");
              out.println("<tr><th> SECTION: </th><td>"+a.getString(10)+"</td></tr> ");
              out.println("<tr><th> SUB CODE : </th><td>"+a.getString(3)+"</td></tr> ");
              out.println("<tr><th> MARK: </th><td>"+a.getString(6)+"</td></tr> ");
              out.println("<tr><th> SUB CODE: </th><td>"+a.getString(4)+"</td></tr> ");
              out.println("<tr><th> MARK: </th><td>"+a.getString(7)+"</td></tr> ");
              out.println("<tr><th> SUB CODE: </th><td>"+a.getString(5)+"</td></tr> ");
              out.println("<tr><th> MARK: </th><td>"+a.getString(8)+"</td></tr> ");
             
              out.println("</table>");
          	}
          }




          if(x.equals("prev"))
          {

          	StudModel m = new StudModel();
          	ResultSet a = m.getpreviousmarks(r,curyear);
          	out.println("<table>");
          	while(a.next())
          	{
              out.println("<tr><th> REGISTER NUMBER: </th><td>"+a.getString(1)+"</td></tr> ");
              out.println("<tr><th>  YEAR : </th><td>"+a.getString(2)+"</td></tr> ");
               out.println("<tr><th> DEPT: </th><td>"+a.getString(9)+"</td></tr> ");
              out.println("<tr><th> SECTION: </th><td>"+a.getString(10)+"</td></tr> ");
              out.println("<tr><th> SUB CODE : </th><td>"+a.getString(3)+"</td></tr> ");
              out.println("<tr><th> MARK: </th><td>"+a.getString(6)+"</td></tr> ");
              out.println("<tr><th> SUB CODE: </th><td>"+a.getString(4)+"</td></tr> ");
              out.println("<tr><th> MARK: </th><td>"+a.getString(7)+"</td></tr> ");
              out.println("<tr><th> SUB CODE: </th><td>"+a.getString(5)+"</td></tr> ");
              out.println("<tr><th> MARK: </th><td>"+a.getString(8)+"</td></tr> ");
              p=1;
            } 
            out.println("</table>");
          	if(p==0)
          		out.println("No previous records found!");
          }



          if(x.equals("coursecode"))
          {
            String[] nameArray = new String[]{"s1", "s4", "s7", "s10"};
            List<String> nameList = new ArrayList<>(Arrays.asList(nameArray));
            ans=nameList.contains(y);
            if(ans)
            {	
            	column+="m1"; subject+="sub1";
            }
            String[] nameArray2 = new String[]{"s2", "s5", "s8", "s11"};
            List<String> nameList2 = new ArrayList<>(Arrays.asList(nameArray2));
            ans=nameList2.contains(y);
            if(ans)
            {
            	column+="m2"; subject+="sub2";
            }
            String[] nameArray3 = new String[]{"s3", "s6", "s9", "s12"};
            List<String> nameList3 = new ArrayList<>(Arrays.asList(nameArray3));
            ans=nameList3.contains(y);
            if(ans)
            {
            	column+="m3"; subject+="sub3";
            }

            System.out.println("The column value is: "+column);    
            System.out.println("The column heading is: "+subject);    

          	StudModel m = new StudModel();
          	ResultSet a = m.getcoursemarks(r,y,column,subject);
          	out.println("<table>");
          	while(a.next())
          	{
              out.println("<tr><th> REGISTER NUMBER: </th><td>"+r+"</td></tr> ");
              out.println("<tr><th>  SUB CODE : </th><td>"+y+"</td></tr> ");
              out.println("<tr><th> MARK: </th><td>"+a.getString(1)+"</td></tr> ");
              out.println("<tr><th> YEAR: </th><td>"+a.getString(2)+"</td></tr> ");
              out.println("<tr><th> DEPARTMENT : </th><td>"+a.getString(3)+"</td></tr> ");
              out.println("<tr><th> SECTION : </th><td>"+a.getString(4)+"</td></tr> ");
              
              out.println("</table>");
              available=1;
          	}
          	if(available==0)
          		out.println("Invalid Course code - You have not taken up this course yet!");
          }
     
          out.println("</html>");

     }// try-end
	 
	 catch(Exception E)
     {
      System.out.println(E); 
      }	
    }
}