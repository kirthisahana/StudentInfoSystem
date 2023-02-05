// CourseHand2.java


package Controller;
import Model.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;


public class CourseHand2 extends HttpServlet //throws IOException,ServletException,Exception
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		

		String f = request.getParameter("fnum");
		String dept = request.getParameter("dept");
		String year=  request.getParameter("year");
		String sec=  request.getParameter("sec");
		String code=  request.getParameter("code");
		String column=""; boolean ans; String subject=""; 
		int available=0; 
		//int p=0;
		response.setContentType("text/html");
        PrintWriter out= response.getWriter();
		out.println("<br><br><br>");
		FacultyModel hi= new FacultyModel();
		try{
			ResultSet rs= hi.getClasses(f,dept,year,sec,code);
			while(rs.next())
			{

              // The faculty is allowed to access the database which she teaches

			  String[] nameArray = new String[]{"s1", "s4", "s7", "s10"};
            List<String> nameList = new ArrayList<>(Arrays.asList(nameArray));
            ans=nameList.contains(code);
            if(ans)
            {	
            	column+="m1"; subject+="sub1";
            }
            String[] nameArray2 = new String[]{"s2", "s5", "s8", "s11"};
            List<String> nameList2 = new ArrayList<>(Arrays.asList(nameArray2));
            ans=nameList2.contains(code);
            if(ans)
            {
            	column+="m2"; subject+="sub2";
            }
            String[] nameArray3 = new String[]{"s3", "s6", "s9", "s12"};
            List<String> nameList3 = new ArrayList<>(Arrays.asList(nameArray3));
            ans=nameList3.contains(code);
            if(ans)
            {
            	column+="m3"; subject+="sub3";
            }

            System.out.println("The column value is: "+column);    
            System.out.println("The column heading is: "+subject);    
			  FacultyModel g= new FacultyModel();
              ResultSet res= g.getStudentMarks(dept, year,sec, column, subject,code);
              out.println("<table>");
              out.println(" <tr>  <th> REGISTER NUM </th> <th> MARKS </th><tr>");
              while(res.next())
              {
                out.println("<tr>");
                out.println("<td> "+res.getString(1)+"</td> ");
                out.println("<td> "+res.getString(2)+"</td> ");
                out.println("</tr>");
              }
              out.println("</table>");
              available=1; // Faculty teaches the particular class she wants access the marks for
			}

           if(available==0)
           {
           	out.println("You dont have access to look into this database! ");
           }




       }// end-try
       catch(Exception E){System.out.println(E);}

    }// doget end

}// class ends

