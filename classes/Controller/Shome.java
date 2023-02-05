// Shome.java


package Controller;
import Model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class Shome extends HttpServlet //throws IOException,ServletException,Exception
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		HttpSession session = request.getSession(true);

		
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		System.out.println("im in shome function :)");
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
        String regnum= session.getAttribute("student~regnum").toString();
        System.out.println("In Shome.java the student name is: "+regnum);
        //out.println("........HELLO..........");

        out.println("<html>");
        //out.println("<head>    HELLO    WORLD    </head>");
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
        out.println("<form class='c1' id='form1' action='viewdetailsurl' method='get'>");
        out.println("<input type='hidden' name='reg'  value='"+regnum+"'>   ");
        out.println("<input type='button' value='view details' onclick='idkfunc(reg.value)' id='b1'> ");
        out.println("</form>");
        out.println("<br>");
       
        out.println("<form class='c1' id='form3' action='viewfacilitiesurl' method='get'> ");
         out.println("<input type='hidden' name='reg' value='"+regnum+"'> ");
        out.println("<input type='button' value='view other facilities' onclick='omgfunc(reg.value)' id='b3'>  ");
        out.println("</form>");
        out.println("<br>");

        /*out.println("<form class='c1' id='form5' action='viewannounceurl' method='get'> ");
         out.println("<input type='hidden' name='reg' value='"+regnum+"'> ");
        out.println("<input type='button' value='view announcements' onclick='   ' id='b5'>  ");
        out.println("</form>");
        out.println("<br>");


       out.println("<form class='c1' id='form4' action='editdetailsurl' method='get'> ");
         out.println("<input type='hidden' name='reg' value='"+regnum+"'> ");
        out.println("<input type='button' value='edit details' onclick='    ' id='b4'>  ");
        out.println("</form>");
        out.println("<br>"); */

        out.println("<form class='c1' id='form2' action='viewmarksurl' method='get'> ");
         out.println("<input type='hidden' name='reg'  value='"+regnum+"'> ");
        out.println("<input type='button' value='view marks' onclick='whatfunc(reg.value)' id='b2'> ");
        out.println("</form>");
        out.println("<br>");
        out.println("</div>");
        out.println("<div id='result'> </div>   ");

        out.println(" <script>");
        out.println(" function idkfunc(r){");
        out.println(" var xmlhttp = new XMLHttpRequest(); console.log(xmlhttp);");
        out.println("console.log(r); ");
        out.println(" xmlhttp.onreadystatechange = function() {");
        out.println("if (this.readyState == 4 && this.status == 200) { ");
        out.println(" document.getElementById('result').innerHTML = this.responseText;");
        out.println(" }; }");
        out.println(" xmlhttp.open('GET', 'viewdetailsurl?reg='+r, true); ");
        out.println("xmlhttp.send(); ");
        out.println("  }");


        out.println(" function omgfunc(r){");
        out.println(" var xmlhttp = new XMLHttpRequest(); console.log(xmlhttp);");
        out.println("console.log(r); ");
        out.println(" xmlhttp.onreadystatechange = function() {");
        out.println("if (this.readyState == 4 && this.status == 200) { ");
        out.println(" document.getElementById('result').innerHTML = this.responseText;");
        out.println(" }; }");
        out.println(" xmlhttp.open('GET', 'viewfacilitiesurl?reg='+r, true); ");
        out.println("xmlhttp.send(); ");
        out.println("  }");

        out.println(" function whatfunc(r){");
        out.println(" var xmlhttp = new XMLHttpRequest(); console.log(xmlhttp);");
        out.println("console.log(r); ");
        out.println(" xmlhttp.onreadystatechange = function() {");
        out.println("if (this.readyState == 4 && this.status == 200) { ");
        out.println(" document.getElementById('result').innerHTML = this.responseText;");
        out.println(" }; }");
        out.println(" xmlhttp.open('GET', 'viewmarksurl?reg='+r, true); ");
        out.println("xmlhttp.send(); ");
        out.println("  }");

        out.println("function myfunc(){ ");
        out.println("var x=document.getElementById('id1').value; ");
        out.println("var c='coursecode'; ");
        out.println("console.log(c);  console.log(x);  ");
        out.println("if(x==c){ document.getElementById('id2').style.display='block';  }   }");


        out.println(" function blahfunc(r,id1, id2){");
        out.println(" var xmlhttp = new XMLHttpRequest(); console.log(xmlhttp);");
        out.println("console.log(id1);  console.log(id2); ");
        out.println(" xmlhttp.onreadystatechange = function() {");
        out.println("if (this.readyState == 4 && this.status == 200) { ");
        out.println(" document.getElementById('result').innerHTML = this.responseText;");
        out.println(" }; }");
        out.println(" xmlhttp.open('GET', 'marks2url?r='+r+'&id1='+id1+'&id2='+id2, true); ");
        out.println("xmlhttp.send(); ");
        out.println("  }");

        out.println("</script>");
        out.println("</body>");
        out.println("</html>");

        //out.println("............BYE .............");

    }
}






/*
        session.invalidate();
        if(session == null || !request.isRequestedSessionIdValid())
            {System.out.println("session invalidated");}
        }//try-end

        catch(Exception E){System.out.println(E);}

	}
}		

*/


