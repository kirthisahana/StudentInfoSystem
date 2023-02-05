// Large.java

package Controller;
import Model.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;
//largeurl?reg='+regnum+'&pwd='+pwd+'&sname='+sname+'&gender='+gender+'&dob='+dob+'&email='+email+'&phone='+phone+'&addr='+addr+'&dept='+dept+'&other='+other+'&info='+info+'&gname='+gname+'&gphone='+gphone+'&sect='+sect+'&y='+y+'&sub1='+sub1+'&sub2='+sub2+'&sub3='+sub3+'&m1='+m1+'&m2='+m2+'&m3='+m3, true); ");
       

public class Large extends HttpServlet //throws IOException,ServletException,Exception
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		
        System.out.println("WELCOME TO LARGE FUNC...");
		String r = request.getParameter("reg");
		String p = request.getParameter("pwd");
		String n = request.getParameter("sname");
		String g = request.getParameter("gender");
		String d = request.getParameter("dob");
		String e = request.getParameter("email");
		String ph = request.getParameter("phone");
		String a = request.getParameter("addr");
		String dept = request.getParameter("dept");
		String o = request.getParameter("other");
		String i = request.getParameter("info");
		String gname = request.getParameter("gname");
		String gph = request.getParameter("gphone");
		String sec = request.getParameter("sect");
		String year = request.getParameter("y");
		String sub1 = request.getParameter("sub1");
		String sub2 = request.getParameter("sub2");
		String sub3 = request.getParameter("sub3");
		int  m1 = Integer.parseInt(request.getParameter("m1"));
		int  m2 = Integer.parseInt(request.getParameter("m2"));
		int  m3 = Integer.parseInt(request.getParameter("m3"));
        int aff=0; int we=0; int lo=0; int shi=0;
		response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        /*
		console.log(r ); console.log(p ); console.log(n ); console.log("g "); console.log("d "); console.log("e "); console.log("ph "); console.log("a "); 
		console.log("dept "); console.log("o "); console.log("i "); console.log(" gname"); console.log("gph ");
		 console.log(" sec"); console.log("year "); console.log("sub1 "); console.log("sub2 "); console.log("sub3 "); console.log("m1 "); console.log("m2 ");
		console.log("m3 "); */

		System.out.println(r); System.out.println(p); System.out.println(n); System.out.println(g); System.out.println(d); System.out.println(e); 
		System.out.println(ph);
		System.out.println(a); System.out.println(dept); System.out.println(o); System.out.println(i); System.out.println(gname); System.out.println(gph);
		System.out.println(sec); System.out.println(year); System.out.println(sub1); System.out.println(sub2); System.out.println(sub3); System.out.println(m1); 
		System.out.println(m2); System.out.println(m3);
		//console.log(" "); console.log(" ");
		
		//System.out.println("Shabbaaa.... in view students function : f num : "+ x);
		
        //out.println("shabbbaaaa..... IN DETAILS FUNCTION- REGISTER NUMBER IS: "+x);
         try{

            AdminModel am= new AdminModel();
            aff= am.addstudentdetails(r,year,dept,n,g,d,e,ph,a,gname,gph);
            out.println("<ul>");
            if (aff!=0)
            	
            	out.println("Personal Details of the student added <br>");
            AdminModel j= new AdminModel();

            we= j.addotherfac(r,o,i);
            if(we!=0)
               out.println("Other facilities details of the student added <br>");	
            
            AdminModel pp= new AdminModel();

            lo=pp.addlogin(r,p);
            if(lo!=0)
            	out.println("Login details of the students added <br>");

            AdminModel mm = new AdminModel();
            shi= mm.addmarks(r,year,sub1,sub2,sub3,m1,m2,m3,dept,sec);
            if(shi!=0)
               out.println("Student marks added <br>");
            out.println("</ul>");






         }// try end
         catch(Exception E){System.out.println(E);}

    }// doget end

}// large ends