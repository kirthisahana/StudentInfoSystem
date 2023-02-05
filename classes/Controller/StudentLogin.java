//StudentLogin
package Controller;
import Model.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class StudentLogin extends HttpServlet //throws IOException,ServletException,Exception
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		HttpSession session = request.getSession(true);

		String x = request.getParameter("uname");
		String y = request.getParameter("upwd");
		response.setContentType("text/html");
        PrintWriter out= response.getWriter();
		
		//Cookie ss = new Cookie("student~session",x+"~"+session.getId()); 
		//ss.setMaxAge(60*60*24);
    //Cookie ss2 = new Cookie("student~regnum",x); //ss2.setMaxAge(60*60*24);
		//response.addCookie(ss);
    //ss.setPath("/");
    //ss2.setPath("/");
    //System.out.println("CHECK CHECK...");
    //System.out.println(x+"~"+session.getId()); System.out.println(x);
		//System.out.println("Student Login "+ss.getValue());
		String htmlres="<html>";
        try{
        	StudModel sm= new StudModel();
        	String res= sm.fetchdata(x,y);
        	if(res.equals("1"))
        	{
        		//htmlres+="<h2> You are logged in as "+x+" </h2></html> ";
        		//out.println(htmlres);
        		//out.println(" Existing Session ID= "+session.getId());
                //cu.adduser(x,session.getId());
            //System.out.println("just before calling Shome.html file using cookiesws");
            //response.addCookie(ss); response.addCookie(ss2);
            
            session.setAttribute("student~regnum",x);
            response.sendRedirect("shomeurl");
            return;
            

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
               htmlres+="<script> function myfunction(){alert('Invalid Username. Enter a valid username')}; </script>   ";
               htmlres+="</body></html>";
               out.println(htmlres); 


        	}
        }
		catch(Exception E){System.out.println(E);}
	}
}		
