//Ahome.java

package Controller;
import Model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

public class Ahome extends HttpServlet //throws IOException,ServletException,Exception
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		HttpSession session = request.getSession(true);

		
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		System.out.println("im in ahome function :)");
        String regnum= session.getAttribute("admin~num").toString();
        System.out.println("In Ahome.java the admin number is: "+regnum);
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
        out.println("<form class='c1' id='imform1' action='addstudenturl' method='get'>");
        //out.println("<input type='hidden' name='reg'  value='"+regnum+"'>   ");
        out.println("<input type='button' value='Add Student' onclick='jokerfunc()' id='zb1'> ");
        out.println("</form>");
        out.println("<br>");
       
        out.println("<form class='c1' id='imform3' action='viewmarks1url' method='get'> ");
         //out.println("<input type='hidden' name='reg' value='"+regnum+"'> ");
        out.println("<input type='button' value='view marks' onclick='blah2func()' id='zb3'>  ");
        out.println("</form>");
        out.println("<br>"); 

        out.println("<form class='c1' id='imform2' action='viewtopperurl' method='get'> ");
         //out.println("<input type='hidden' name='reg' value='"+regnum+"'> ");
        out.println("<input type='button' value='view topper' onclick='mehfunc()' id='zb2'>  ");
        out.println("</form>");
        out.println("<br>"); 

        out.println("</div>");
        out.println("<div id='result'> </div>   ");

        out.println(" <script>");
        out.println(" function jokerfunc(){");
        out.println(" var xmlhttp = new XMLHttpRequest(); console.log(xmlhttp);");
        //out.println("console.log(r); ");
        out.println(" xmlhttp.onreadystatechange = function() {");
        out.println("if (this.readyState == 4 && this.status == 200) { ");
        out.println(" document.getElementById('result').innerHTML = this.responseText;");
        out.println(" }; }");
        out.println(" xmlhttp.open('GET', 'addstudenturl', true); ");
        out.println("xmlhttp.send(); ");
        out.println("  }");

        /*
        out.println("function batmanfunc(){ ");
        out.println("var x=document.getElementById('y').value; ");
        out.println("var one='1'; var two='2'; var three='3';  ");
        out.println("  console.log(x);  ");
        out.println("if(x==one){console.log('in 1 func'); document.getElementById('year1').style.display='block';  document.getElementById('year2').style.display='none';  document.getElementById('year3cse').style.display='none';  }   ");
         out.println("if(x==two){console.log('in 2 func'); document.getElementById('year2').style.display='block';  document.getElementById('year1').style.display='none';  document.getElementById('year3cse').style.display='none';  }   ");
          out.println("if(x==three){console.log('in 3 func'); document.getElementById('year3cse').style.display='block';  document.getElementById('year1').style.display='none';  document.getElementById('year2').style.display='none';  }   }");
         */
        
        out.println(" function largefunc(regnum,pwd,sname,gender,dob,email,phone,addr,dept,other,info,gname,gphone,sect,y,sub1,sub2,sub3,m1,m2,m3){");
        out.println(" var xmlhttp = new XMLHttpRequest(); console.log(xmlhttp);");
        out.println(" xmlhttp.onreadystatechange = function() {");
        out.println("if (this.readyState == 4 && this.status == 200) { ");
        out.println(" document.getElementById('result').innerHTML = this.responseText;");
        out.println(" }; }");
        out.println(" xmlhttp.open('GET', 'largeurl?reg='+regnum+'&pwd='+pwd+'&sname='+sname+'&gender='+gender+'&dob='+dob+'&email='+email+'&phone='+phone+'&addr='+addr+'&dept='+dept+'&other='+other+'&info='+info+'&gname='+gname+'&gphone='+gphone+'&sect='+sect+'&y='+y+'&sub1='+sub1+'&sub2='+sub2+'&sub3='+sub3+'&m1='+m1+'&m2='+m2+'&m3='+m3, true); ");
        out.println("xmlhttp.send(); ");
        out.println("  }");
         
        out.println(" function blah2func(){");
        out.println(" var xmlhttp = new XMLHttpRequest(); console.log(xmlhttp);");
        //out.println("console.log(id1);  console.log(id2); ");
        out.println(" xmlhttp.onreadystatechange = function() {");
        out.println("if (this.readyState == 4 && this.status == 200) { ");
        out.println(" document.getElementById('result').innerHTML = this.responseText;");
        out.println(" }; }");
        out.println(" xmlhttp.open('GET', 'viewmarks1url', true); ");
        out.println("xmlhttp.send(); ");
        out.println("  }"); 

         out.println(" function mehfunc(){");
        out.println(" var xmlhttp = new XMLHttpRequest(); console.log(xmlhttp);");
        //out.println("console.log(id1);  console.log(id2); ");
        out.println(" xmlhttp.onreadystatechange = function() {");
        out.println("if (this.readyState == 4 && this.status == 200) { ");
        out.println(" document.getElementById('result').innerHTML = this.responseText;");
        out.println(" }; }");
        out.println(" xmlhttp.open('GET', 'viewtopperurl', true); ");
        out.println("xmlhttp.send(); ");
        out.println("  }"); 

       out.println(" function epicfunc(dept,year){");
        out.println(" var xmlhttp = new XMLHttpRequest(); console.log(xmlhttp);");
        //out.println("console.log(id1);  console.log(id2); ");
        out.println(" xmlhttp.onreadystatechange = function() {");
        out.println("if (this.readyState == 4 && this.status == 200) { ");
        out.println(" document.getElementById('result').innerHTML = this.responseText;");
        out.println(" }; }");
        out.println(" xmlhttp.open('GET', 'disptopperurl?dept='+dept+'&year='+year, true); ");
        out.println("xmlhttp.send(); ");
        out.println("  }"); 

         
        out.println(" function somefunc(dept){");
        out.println(" var xmlhttp = new XMLHttpRequest(); console.log(xmlhttp);");
        //out.println("console.log(id1);  console.log(id2); ");
        out.println(" xmlhttp.onreadystatechange = function() {");
        out.println("if (this.readyState == 4 && this.status == 200) { ");
        out.println(" document.getElementById('result').innerHTML = this.responseText;");
        out.println(" }; }");
        out.println(" xmlhttp.open('GET', 'finalurl?dept='+dept, true); ");
        out.println("xmlhttp.send(); ");
        out.println("  }"); 

        out.println("</script>");
        out.println("</body>");
        out.println("</html>");

        //out.println("............BYE .............");

    }
}