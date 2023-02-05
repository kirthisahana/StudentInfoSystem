
// Admin login



package Controller;
import Model.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class AdminLogin extends HttpServlet //throws IOException,ServletException,Exception
{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		HttpSession session = request.getSession(true);

		String x = request.getParameter("uname");
		String y = request.getParameter("upwd");
		response.setContentType("text/html");
        PrintWriter out= response.getWriter();
		
		//Cookie as = new Cookie("admin~session",x+"~"+session.getId()); 
		//as.setMaxAge(60*60*24);

		//response.addCookie(as);
		//System.out.println("Admin Login "+as.getValue());
		String htmlres="<html>";
        try{
        	AdminModel ad= new AdminModel();
        	String res= ad.fetchdata(x,y);
        	if(res.equals("1"))
        	{
        		//htmlres+="<h2> Admin logged in as "+x+" </h2></html> ";
        		//out.println(htmlres);
        		//out.println(" Existing Admin Session ID= "+session.getId());
                //cu.adduser(x,session.getId());

            session.setAttribute("admin~num",x);
            response.sendRedirect("ahomeurl");
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
               htmlres+="<script> function myfunction(){alert('Invalid  Faculty Username. Enter a valid username')}; </script>   ";
               htmlres+="</body></html>";
               out.println(htmlres); 


        	}
        }
		catch(Exception E){System.out.println(E);}
	}
}		
