// Fhome.java

package Controller;
import Model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class Fhome extends HttpServlet //throws IOException,ServletException,Exception
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		HttpSession session = request.getSession(true);

		
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		System.out.println("im in Fhome function :");
		/*
		Cookie cookies[]= request.getCookies();
		String sid=""; String regnum="";
		for (Cookie c : cookies)
		{
          if (c.getName().equals("student~session"))
           {      sid+=c.getValue(); c.setMaxAge(0); }

          if(c.getName().equals("student~regnum"))
          	{    regnum+=c.getValue(); c.setMaxAge(0); }
          if(c.getValue().equals("195001005")
            {c.setMaxAge(0); System.out.println("disaster deleted");}
            c.setMaxAge(0);
		}
        response.addCookie(c)*/
        String fnum= session.getAttribute("faculty~regnum").toString();
        System.out.println("In Fhome.java the faculty number is: "+fnum);
        //out.println("........HELLO..........");

        out.println("<html>");
        out.println("<style>");
        out.println("#form-style, #result{");
          out.println("max-width: 500px;");
    out.println("padding: 10px 20px;");
                        out.println(" background: #f4f7f8;");
                         out.println("margin: 10px auto;");
                         out.println("padding: 20px;");
                         out.println("background: #f4f7f8;");
                         out.println("border-radius: 8px;");
                         out.println("font-family: Georgia, 'Times New Roman', Times, serif;");
                        out.println("}");
                       out.println("#form-style fieldset{");
                        out.println("border: none;");
                        out.println("}");
                       out.println(" #form-style legend {");
                        out.println("font-size: 1.4em;");
                        out.println("margin-bottom: 10px;");
                        out.println("}");
        out.println("</style>");
        out.println("<body>");
        out.println("<div id='form-style'> ");
        out.println("<form class='c1' id='itsform1' action='coursehandurl' method='get'>");
        out.println("<input type='hidden' name='fnum'  value='"+fnum+"'>   ");
        out.println("<input type='button' value='Courses handled' onclick='func1(fnum.value)' id='b1'> ");
        out.println("</form>");
        out.println("<br>");

        out.println("<form class='c1' id='itsform3' action='editmarksurl' method='get'>");
        out.println("<input type='hidden' name='fnum'  value='"+fnum+"'>   ");
        out.println("<input type='button' value='Edit marks' onclick='func3(fnum.value)' id='b3'> ");
        out.println("</form>");
        out.println("<br>");

        out.println("<form class='c1' id='itsform2' action='viewstudurl' method='get'>");
        out.println("<input type='hidden' name='fnum'  value='"+fnum+"'>   ");
        out.println("<input type='button' value='View Student Marks' onclick='func2(fnum.value)' id='b2'> ");
        out.println("</form>");
        out.println("<br>");
        out.println("</div>");
        out.println("<div id='result'> </div>   ");

        out.println(" <script>");

        out.println(" function func1(f){");
        out.println(" var xmlhttp = new XMLHttpRequest(); console.log(xmlhttp);");
        out.println("console.log(f); ");
        out.println(" xmlhttp.onreadystatechange = function() {");
        out.println("if (this.readyState == 4 && this.status == 200) { ");
        out.println(" document.getElementById('result').innerHTML = this.responseText;");
        out.println(" }; }");
        out.println(" xmlhttp.open('GET', 'coursehandurl?fnum='+f, true); ");
        out.println("xmlhttp.send(); ");
        out.println("  }");

        out.println(" function func3(f){");
        out.println(" var xmlhttp = new XMLHttpRequest(); console.log(xmlhttp);");
        out.println("console.log(f); ");
        out.println(" xmlhttp.onreadystatechange = function() {");
        out.println("if (this.readyState == 4 && this.status == 200) { ");
        out.println(" document.getElementById('result').innerHTML = this.responseText;");
        out.println(" }; }");
        out.println(" xmlhttp.open('GET', 'editmarksurl?fnum='+f, true); ");
        out.println("xmlhttp.send(); ");
        out.println("  }");

        out.println(" function func2(f){");
        out.println(" var xmlhttp = new XMLHttpRequest(); console.log(xmlhttp);");
        out.println("console.log(f); ");
        out.println(" xmlhttp.onreadystatechange = function() {");
        out.println("if (this.readyState == 4 && this.status == 200) { ");
        out.println(" document.getElementById('result').innerHTML = this.responseText;");
        out.println(" }; }");
        out.println(" xmlhttp.open('GET', 'viewstudurl?fnum='+f, true); ");
        out.println("xmlhttp.send(); ");
        out.println("  }");

        out.println(" function idiotfunc(f,dept, year, sec, code){");
        out.println(" var xmlhttp = new XMLHttpRequest(); console.log(xmlhttp);");
        out.println("console.log(f); ");
        out.println(" xmlhttp.onreadystatechange = function() {");
        out.println("if (this.readyState == 4 && this.status == 200) { ");
        out.println(" document.getElementById('result').innerHTML = this.responseText;");
        out.println(" }; }");
        out.println(" xmlhttp.open('GET','coursehand2url?fnum='+f+'&dept='+dept+'&year='+year+'&sec='+sec+'&code='+code , true); ");
        out.println("xmlhttp.send(); ");
        out.println("  }");


        out.println(" function wattofunc(f,dept, year, sec, code, regnum, update){");
        out.println(" var xmlhttp = new XMLHttpRequest(); console.log(xmlhttp);");
        out.println("console.log(f); ");
        out.println(" xmlhttp.onreadystatechange = function() {");
        out.println("if (this.readyState == 4 && this.status == 200) { ");
        out.println(" document.getElementById('result').innerHTML = this.responseText;");
        out.println(" }; }");
        out.println(" xmlhttp.open('GET','secondurl?fnum='+f+'&dept='+dept+'&year='+year+'&sec='+sec+'&code='+code+'&reg='+regnum+'&up='+update , true); ");
        out.println("xmlhttp.send(); ");
        out.println("  }");





        out.println("</script>");
        out.println("</body>");
        out.println("</html>");



    }// end of do-get


}// Fhome ends