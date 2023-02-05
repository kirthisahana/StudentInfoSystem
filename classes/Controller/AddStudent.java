//AddStudent.java

package Controller;
import Model.*;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;


public class AddStudent extends HttpServlet //throws IOException,ServletException,Exception
{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException
	{
		

		//String x = request.getParameter("reg");
		//System.out.println("Shabbaaa.... in marks function : reg num : "+ x);
		response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        //out.println("shabbbaaaa..... IN DETAILS FUNCTION- REGISTER NUMBER IS: "+x);
         try{
        //StudModel sm= new StudModel();

          out.println("<style> ");
          out.println("#year1, #year2, #year3cse {display: none;} ");
          out.println(".form-style{");
          out.println("max-width: 500px;");
    out.println("padding: 10px 20px;");
                        out.println(" background: #f4f7f8;");
                         out.println("margin: 10px auto;");
                         out.println("padding: 20px;");
                         out.println("background: #f4f7f8;");
                         out.println("border-radius: 8px;");
                         out.println("font-family: Georgia, 'Times New Roman', Times, serif;");
                        out.println("}");
                       out.println(".form-style fieldset{");
                        out.println("border: none;");
                        out.println("}");
                       out.println(" .form-style legend {");
                        out.println("font-size: 1.4em;");
                        out.println("margin-bottom: 10px;");
                        out.println("}");
                         
           out.println("</style> ");

           out.println("<form class='form-style'> ");
           out.println("REGISTER NUM: <br> ");
           out.println("<input type='text' id='regnum' name='regnum'><br><br> ");

           out.println("<input type='hidden' name='pwd' id='pwd'  value='abc'>   ");

           out.println("NAME: <br> ");
           out.println(" <input type='text' id='sname' name='sname'> <br><br> ");
           out.println("GENDER: <br> ");
            out.println("<select id='gender' name='gender' > ");
           out.println("<option value='m'>MALE </option> ");
           out.println("<option value='f'>FEMALE </option> ");
           out.println("</select>");
           out.println("<br><br> ");
           out.println("ENTER DATE-OF-BIRTH: <br>");
           out.println("<input type='date' id='dob' name='dob'><br><br>  ");
           out.println("EMAIL: <br> ");
           out.println("<input type='email' id='email' name='email'><br><br>  ");
           out.println("CONTACT: <br>");
           out.println("<input type='tel' id='phone' name='phone'><br> <br> ");
           out.println("ADDRESS: <br> ");
           out.println("<textarea id='addr' name='addr'rows='3' cols='65'> </textarea><br><br>  ");
           out.println("PARENT/GUARDIAN NAME: <br>");
           out.println("<input type='text' id='gname' name='gname'> <br><br> ");
           out.println("PARENT/GUARDIAN CONTACT: <br> ");
           out.println("<input type='tel' id='gphone' name='gphone'><br><br>  ");







  



           out.println("DEPARTMENT: <br> ");
           out.println("<select id='dept' name='dept' > ");
          out.println("<option value='cse'>CSE </option> ");
          out.println("<option value='ece'>ECE </option> ");
           out.println("</select>");
           out.println("<br>  <br> ");

           out.println("OTHER FACILITIES: <br> ");
           out.println("<select id='other' name='other' > ");
          out.println("<option value='d'>DAY SCHOLAR </option> ");
          out.println("<option value='h'>HOSTELLER </option> ");
           out.println("</select>");
           out.println("<br>  <br> ");
          
          out.println("BUS NUM/ HOSTEL ROOM NUM ALLOCATED: <br> ");
          out.println("<input type='text' id='info' name='info'><br> <br>");

           out.println("SECTION: <br> ");
           out.println("<select id='sect' name='sect' > ");
          out.println("<option value='a'> A section </option> ");
          out.println("<option value='b'> B section </option> ");
           out.println("</select>");
           out.println("<br>  <br> ");

           out.println("CURRENT YEAR: <br>");
           out.println("<select id='y' name='y'> ");
           out.println("<option value='none'> NONE </option>");
           out.println("<option value='1'> 1 </option> ");
           out.println("<option value='2'> 2 </option> ");
           out.println("<option value='3'> 3 </option> ");
           out.println("</select>");
           out.println("<br>  <br> ");
        
           out.println("SELECT SUB CODE1: <br>");
           out.println("<select id='sub1' name='sub1' > ");
          out.println("<option value='s1'> S1 </option> ");
         out.println("<option value='s2'> S2 </option> ");
         out.println("<option value='s3'> S3 </option> ");
         out.println("<option value='s4'> S4 </option> ");
          out.println("<option value='s5'> S5 </option> ");
          out.println("<option value='s6'> S6 </option> ");
          out.println("<option value='s7'> S7 </option> ");
         out.println("<option value='s8'> S8 </option> ");
          out.println("<option value='s9'> S9 </option> ");
          out.println("<option value='s10'> S10 </option> ");
           out.println("<option value='s11'> S11 </option> ");
            out.println("<option value='s12'> S12 </option> ");
           out.println("</select>");
           out.println("<br>  <br> ");
           out.println("MARK 1:<br>");
           out.println("<input type='text' id='m1' name='m1'><br><br> ");



           out.println("SELECT SUB CODE2: <br>");
           out.println("<select id='sub2' name='sub2' > ");
          out.println("<option value='s1'> S1 </option> ");
         out.println("<option value='s2'> S2 </option> ");
         out.println("<option value='s3'> S3 </option> ");
         out.println("<option value='s4'> S4 </option> ");
          out.println("<option value='s5'> S5 </option> ");
          out.println("<option value='s6'> S6 </option> ");
          out.println("<option value='s7'> S7 </option> ");
         out.println("<option value='s8'> S8 </option> ");
          out.println("<option value='s9'> S9 </option> ");
          out.println("<option value='s10'> S10 </option> ");
           out.println("<option value='s11'> S11 </option> ");
            out.println("<option value='s12'> S12 </option> ");
           out.println("</select>");
           out.println("<br>  <br> ");  out.println("MARK 2:<br>");
           out.println("<input type='text' id='m2' name='m2'><br><br> ");


           out.println("SELECT SUB CODE3: <br>");
           out.println("<select id='sub3' name='sub3' > ");
          out.println("<option value='s1'> S1 </option> ");
         out.println("<option value='s2'> S2 </option> ");
         out.println("<option value='s3'> S3 </option> ");
         out.println("<option value='s4'> S4 </option> ");
          out.println("<option value='s5'> S5 </option> ");
          out.println("<option value='s6'> S6 </option> ");
          out.println("<option value='s7'> S7 </option> ");
         out.println("<option value='s8'> S8 </option> ");
          out.println("<option value='s9'> S9 </option> ");
          out.println("<option value='s10'> S10 </option> ");
           out.println("<option value='s11'> S11 </option> ");
            out.println("<option value='s12'> S12 </option> ");
           out.println("</select>");
           out.println("<br>  <br> "); out.println("MARK 3:<br>");
           out.println("<input type='text' id='m3' name='m3'><br><br> ");

          


           /*
           out.println("<div id='year1'> ");
           out.println("YEAR 1-MARK 1:");
            out.println("<input type='hidden' name='sub1' id='sub1'  value='s1'>   ");
           out.println("<input type='text' id='m1' name='m1'> ");
           out.println("YEAR 1-MARK 2:");
            out.println("<input type='hidden' name='sub2' id='sub2'  value='s2'>   ");
           out.println("<input type='text' id='m2' name='m2'> ");
           out.println("YEAR 1-MARK 3:");
            out.println("<input type='hidden' name='sub3' id='sub3'  value='s3'>   ");
           out.println("<input type='text' id='m3' name='m3'> ");
           out.println("</div> ");

           out.println("<div id='year2'> ");
           out.println("YEAR 2-MARK 1:");
            out.println("<input type='hidden' name='sub1' id='sub1'  value='s4'>   ");
           out.println("<input type='text' id='m1' name='m1'> ");
           out.println("YEAR 2-MARK 2:");
            out.println("<input type='hidden' name='sub2' id='sub2'  value='s5'>   ");
           out.println("<input type='text' id='m2' name='m2'> ");
           out.println("YEAR 2- MARK 3:");
            out.println("<input type='hidden' name='sub3' id='sub3'  value='s6'>   ");
           out.println("<input type='text' id='m3' name='m3'> ");
           out.println("</div> ");

           out.println("<div id='year3cse'> ");
           out.println("YEAR 3-MARK 1:");
            out.println("<input type='hidden' name='sub1' id='sub1'  value='s7'>   ");
           out.println("<input type='text' id='m1' name='m1'> ");
           out.println("YEAR 3-MARK 2:");
            out.println("<input type='hidden' name='sub2' id='sub2'  value='s8'>   ");
           out.println("<input type='text' id='m2' name='m2'> ");
           out.println("YEAR 3- MARK 3:");
            out.println("<input type='hidden' name='sub3' id='sub3'  value='s9'>   ");
           out.println("<input type='text' id='m3' name='m3'> ");
           out.println("</div> ");
           System.out.println("marks received is:" +m1.value+" "+m2.value+" " +m3.value+" " );
           
           
           out.println("<div id='year3ece'> ");
           out.println("YEAR 3-MARK 1:");
            out.println("<input type='hidden' name='sub1' id='sub1'  value='s10'>   ");
           out.println("<input type='text' id='m1' name='m1'> ");
           out.println("YEAR 3-MARK 2:");
            out.println("<input type='hidden' name='sub2' id='sub2'  value='s11'>   ");
           out.println("<input type='text' id='m2' name='m2'> ");
           out.println("YEAR 3- MARK 3:");
            out.println("<input type='hidden' name='sub3' id='sub3'  value='s12'>   ");
           out.println("<input type='text' id='m3' name='m3'> ");
           out.println("</div> "); */

           out.println("<br>  <br> ");
           out.println("<input type='button' value='Submit' onclick='largefunc(regnum.value,pwd.value,sname.value,gender.value,dob.value,email.value,phone.value,addr.value,dept.value,other.value,info.value,gname.value,gphone.value,sect.value,y.value,sub1.value,sub2.value,sub3.value,m1.value,m2.value,m3.value)' id='g4'> ");

           out.println("</form>");
           
       // ResultSet res= sm.getmarks(x);
        System.out.println("in the marks function, result set is received");
        //out.println("shabbbaaaa..... IN MODIFIED  DETAILS FUNCTION- REGISTER NUMBER IS: "+x);
        //out.println("<table>");
        //while(res.next())
        //{
          
         
        
        //}
        //out.println("</table>");
        //out.println(".........................................................");
        }//try-end

        catch(Exception E){System.out.println(E);}

	}
}		
    
