//StudModel

package Model;
import java.util.*;
import java.sql.*;

public class StudModel 
{
 public String fetchdata( String x, String y) throws Exception
 {
   Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
  //System.out.println("Hey I am after forname method");
  //3. Open a Connection
  try{
  String user = "root";
  String password = "#Dharshana1";
  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproj_db?autoReconnect=true&useSSL=false",user,password);
  System.out.println("con--->"+con);
  System.out.println("The username recd and the pwd recd is" +x+" "+y);
  System.out.println("HI :) IM JUS BEFORE THE EXECUTE QUERY");
  String s= "select * from StudentLoginTable where username =  '"+ x +"'  ";
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

}// end of try
catch(Exception E)
{
System.out.println(E); return "none";
}

 }//end of fetch-data

public ResultSet getdetails(String regnum) throws Exception
{

  Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
  //System.out.println("Hey I am after forname method");
  //3. Open a Connection
  
  String user = "root";
  String password = "#Dharshana1";
  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproj_db?autoReconnect=true&useSSL=false",user,password);
  System.out.println("con--->"+con);
  System.out.println("The register number received in getDetails is" +regnum);
  System.out.println("HI :) IM JUS BEFORE THE EXECUTE QUERY");
  String s= "select * from DetailsTable where regnum =  '"+ regnum +"'  ";
  Statement st= con.createStatement();
  ResultSet rs = st.executeQuery(s);
  //rs.next();
  
  return rs;
}



public String getcurrentyear(String regnum) throws Exception
{

  Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
  //System.out.println("Hey I am after forname method");
  //3. Open a Connection
  
  String user = "root";
  String password = "#Dharshana1"; String y="";
  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproj_db?autoReconnect=true&useSSL=false",user,password);
  System.out.println("con--->"+con);
  System.out.println("The register number received in getDetails is" +regnum);
  System.out.println("HI :) IM JUS BEFORE THE EXECUTE QUERY");
  String s= "select year from DetailsTable where regnum =  '"+ regnum +"'  ";
  Statement st= con.createStatement();
  ResultSet rs = st.executeQuery(s);
  while(rs.next())
     y= rs.getString(1);
  
  
  return y;
}







public ResultSet getcurrentmarks(String regnum, String year) throws Exception
{

  Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
  //System.out.println("Hey I am after forname method");
  //3. Open a Connection
  
  String user = "root";
  String password = "#Dharshana1";
  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproj_db?autoReconnect=true&useSSL=false",user,password);
  System.out.println("con--->"+con);
  System.out.println("The register number received in getcurrentmarks() is" +regnum);
  System.out.println("HI :) IM JUS BEFORE THE EXECUTE QUERY");
  String s= "select * from MarksTable where regnum =  '"+ regnum +"' and year= '"+year+"' ";
  Statement st= con.createStatement();
  ResultSet rs = st.executeQuery(s);
  //rs.next();
  
  return rs;
}



public ResultSet getpreviousmarks(String regnum, String year) throws Exception
{

  Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
  //System.out.println("Hey I am after forname method");
  //3. Open a Connection
  
  String user = "root";
  String password = "#Dharshana1";
  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproj_db?autoReconnect=true&useSSL=false",user,password);
  System.out.println("con--->"+con);
  System.out.println("The register number received in getcurrentmarks() is" +regnum);
  System.out.println("HI :) IM JUS BEFORE THE EXECUTE QUERY");
  String s= "select * from MarksTable where regnum =  '"+ regnum +"' and year < '"+year+"' ";
  Statement st= con.createStatement();
  ResultSet rs = st.executeQuery(s);
  //rs.next();
  
  return rs;
}



public ResultSet getcoursemarks(String regnum, String y, String column, String subject) throws Exception
{

  Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
  //System.out.println("Hey I am after forname method");
  //3. Open a Connection
  
  String user = "root";
  String password = "#Dharshana1";
  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproj_db?autoReconnect=true&useSSL=false",user,password);
  System.out.println("con--->"+con);
  System.out.println("The register number received in getcurrentmarks() is" +regnum);
  System.out.println("HI :) IM JUS BEFORE THE EXECUTE QUERY");
  String s= "   select "+column+",year,dept,sec from MarksTable where regnum =  '"+ regnum +"' and "+subject+" = '"+y+"'        ";
  System.out.println(s);
  Statement st= con.createStatement();
  ResultSet rs = st.executeQuery(s);
  //rs.next();
  
  return rs;
}


public ResultSet getother(String regnum) throws Exception
{

  Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
  //System.out.println("Hey I am after forname method");
  //3. Open a Connection
  
  String user = "root";
  String password = "#Dharshana1";
  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproj_db?autoReconnect=true&useSSL=false",user,password);
  System.out.println("con--->"+con);
  System.out.println("The register number received in getcurrentmarks() is" +regnum);
  System.out.println("HI :) IM JUS BEFORE THE EXECUTE QUERY");
  String s= "select * from OtherFacTable where regnum =  '"+ regnum +"'  ";
  Statement st= con.createStatement();
  ResultSet rs = st.executeQuery(s);
  //rs.next();
  
  return rs;
}



public ResultSet getallbus() throws Exception
{

  Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
  //System.out.println("Hey I am after forname method");
  //3. Open a Connection
  
  String user = "root";
  String password = "#Dharshana1";
  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproj_db?autoReconnect=true&useSSL=false",user,password);
  System.out.println("con--->"+con);
  System.out.println("HI :) IM JUS BEFORE THE EXECUTE QUERY");
  String s= "select * from BusTable  ";
  Statement st= con.createStatement();
  ResultSet rs = st.executeQuery(s);
  //rs.next();
  
  return rs;
}


}//end of class studModel