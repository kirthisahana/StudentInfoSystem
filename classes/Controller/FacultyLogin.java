//FacultyLogin

package Controller;
import Model.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class FacultyLogin extends HttpServlet //throws IOException,ServletException,Exception
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		HttpSession session = request.getSession(true);

		String x = request.getParameter("uname");
		String y = request.getParameter("upwd");
		response.setContentType("text/html");
        PrintWriter out= response.getWriter();
		
		
		//System.out.println("Faculty Login "+fs.getValue());
		String htmlres="<html>";
        try{
        	FacultyModel fac= new FacultyModel();
        	String res= fac.fetchdata(x,y);
        	if(res.equals("1"))
        	{

        		session.setAttribute("faculty~regnum",x);
                response.sendRedirect("fhomeurl");
                return;
        		//htmlres+="<h2> Faculty logged in as "+x+" </h2></html> ";
        		//out.println(htmlres);
        		//out.println(" Existing Faculty Session ID= "+session.getId());
                //cu.adduser(x,session.getId());
        	}
        	if(res.equals("Wrong password"))
        	{
        	   htmlres+=" <body onload='myfunction()'> ";
               htmlres+="<script> function myfunction(){alert('Incorrect password. Please try again')}; </script>   ";
               htmlres+="</body></html>";
               out.println(htmlres);
        	}
        	if(res.equals("Invalid Login"))
        	{ 
        		//htmlres+= "<h2> Invalid Login</h2>" ; 
        		
                htmlres+=" <body onload='myfunction()'> ";
               htmlres+="<script> function myfunction(){alert('Invalid  Faculty Username. Enter a valid username')}; </script>   ";
               htmlres+="</body></html>";
               out.println(htmlres); 


        	}
        }
		catch(Exception E){System.out.println(E);}
	}
}		
