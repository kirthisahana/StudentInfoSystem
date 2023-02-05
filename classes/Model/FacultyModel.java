//FacultyModel

package Model;
import java.util.*;
import java.sql.*;

public class FacultyModel 
{
 public String fetchdata( String x, String y) throws Exception
 {
   Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
  try{
  String user = "root";
  String password = "pswd1234";
  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproj_db?autoReconnect=true&useSSL=false",user,password);
  System.out.println("con--->"+con);
  System.out.println("The username recd and the pwd recd is" +x+" "+y);
  String s= "select * from FacultyLoginTable where username =  '"+ x +"'  ";
  Statement st= con.createStatement();
  ResultSet rs = st.executeQuery(s);
  if(rs.next())
  {
    if(rs.getString(2).equals(y))
    {
    	st.close();con.close();return "1";
    }
    else
    	{st.close(); con.close(); return "Wrong password";}
  }//if-end
  else
  	{st.close(); con.close(); return "Invalid Login";}

}
catch(Exception E)
{
System.out.println(E); return "none";
}

 }//end of fetch-data


public ResultSet getcourses(String fnum) throws Exception
{

  Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
  String user = "root";
  String password = "pswd1234";
  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproj_db?autoReconnect=true&useSSL=false",user,password);
  System.out.println("con--->"+con);
  String s= "select * from FacSubTable where regnum =  '"+ fnum +"'  ";
  Statement st= con.createStatement();
  ResultSet rs = st.executeQuery(s);
  //rs.next();
  
  return rs;
}


public ResultSet getClasses(String fnum, String dept, String year, String sec, String code) throws Exception
{
  // To find whether the given fac teaches the given class the given course
  Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
  String user = "root";
  String password = "pswd1234";
  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproj_db?autoReconnect=true&useSSL=false",user,password);
  System.out.println("con--->"+con);
  System.out.println("The faculty number received in getClasses() is" +fnum);
  String s= "select * from FacSubTable where regnum =  '"+ fnum +"' and dept='"+dept+" ' and year= '"+year+" ' and sec='"+sec+" 'and code='"+code+" ' ";
  Statement st= con.createStatement();
  ResultSet rs = st.executeQuery(s);
  //rs.next();
  
  return rs;
}


public ResultSet getStudentMarks(String dept, String year, String sec, String column, String subject, String y) throws Exception
{

  Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
  //System.out.println("Hey I am after forname method");
  //3. Open a Connection
  
  String user = "root";
  String password = "pswd1234";
  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproj_db?autoReconnect=true&useSSL=false",user,password);
  System.out.println("con--->"+con);
  //String s= "select * from FacSubTable where regnum =  '"+ fnum +"' and dept='"+dept+" ' and year= '"+year+" ' and sec='"+sec+" ' ";

  String s= "   select regnum,"+column+" from MarksTable where dept =  '"+ dept +"' and "+subject+" = '"+y+"' and year='"+year+" ' and sec='"+sec+" '   ";
  System.out.println(s);
  Statement st= con.createStatement();
  ResultSet rs = st.executeQuery(s);
  //rs.next();
  
  return rs;
}


public int editmarksfunc(String dept, String year, String sec, String column, String subject, String code, String regnum, int mark) throws Exception
{

  Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
  String user = "root";
  String password = "pswd1234";
  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproj_db?autoReconnect=true&useSSL=false",user,password);
  System.out.println("con--->"+con);
  //String s= "select * from FacSubTable where regnum =  '"+ fnum +"' and dept='"+dept+" ' and year= '"+year+" ' and sec='"+sec+" ' ";

  //String s= "   select regnum,"+column+" from MarksTable where dept =  '"+ dept +"' and "+subject+" = '"+y+"' and year='"+year+" ' and sec='"+sec+" '   ";
  String s="UPDATE MarksTable SET "+column+"= '"+mark+"' where regnum='"+regnum+"' and dept='"+dept+"' and year='"+year+" ' and sec='"+sec+" 'and "+subject+" = '"+code+"' ";
  System.out.println(s);
  Statement st= con.createStatement();
  int row = st.executeUpdate(s);
  //rs.next();
  
  return row;
}


}//end of class FacultyModel
