// AdminModel

package Model;
import java.util.*;
import java.sql.*;

public class AdminModel 
{
 public String fetchdata( String x, String y) throws Exception
 {
   Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
  //System.out.println("Hey I am after forname method");
  //3. Open a Connection
  try{
  String user = "root";
  String password = "pswd1234";
  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproj_db?autoReconnect=true&useSSL=false",user,password);
  System.out.println("con--->"+con);
  System.out.println("The username recd and the pwd recd is" +x+" "+y);
  String s= "select * from AdminLoginTable where username =  '"+ x +"'  ";
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



public int addstudentdetails(String r, String year,String dept,String n, String g,String d,String e,String ph,String a,String gname, String gph) throws Exception
{

  Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

  //3. Open a Connection
  
  String user = "root";
  String password = "pswd1234";
  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproj_db?autoReconnect=true&useSSL=false",user,password);
  System.out.println("con--->"+con);

  //String s= "select * from FacSubTable where regnum =  '"+ fnum +"' and dept='"+dept+" ' and year= '"+year+" ' and sec='"+sec+" ' ";

  //String s= "   select regnum,"+column+" from MarksTable where dept =  '"+ dept +"' and "+subject+" = '"+y+"' and year='"+year+" ' and sec='"+sec+" '   ";
  String s="insert into DetailsTable values(\"" + r+"\" , \"" + year+"\", \"" + dept+"\", \"" + n+"\", \"" + g+"\", \"" + d+"\",\"" + e+"\",\"" + ph+"\",\"" + a+"\", \"" + gname+"\" , \"" + gph+"\", NULL) ";
  System.out.println(s);
  Statement st= con.createStatement();
  int row = st.executeUpdate(s);
  //rs.next();
  
  return row;
}

public int addlogin(String r, String p) throws Exception
{

  Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

  String user = "root";
  String password = "pswd1234";
  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproj_db?autoReconnect=true&useSSL=false",user,password);
  System.out.println("con--->"+con);
  
  //String s= "select * from FacSubTable where regnum =  '"+ fnum +"' and dept='"+dept+" ' and year= '"+year+" ' and sec='"+sec+" ' ";

  //String s= "   select regnum,"+column+" from MarksTable where dept =  '"+ dept +"' and "+subject+" = '"+y+"' and year='"+year+" ' and sec='"+sec+" '   ";
  String s="insert into StudentLoginTable values(\"" + r+"\" , \"" +p+"\") ";
  System.out.println(s);
  Statement st= con.createStatement();
  int row = st.executeUpdate(s);
  //rs.next();
  
  return row;
}


public int addmarks(String r,String year, String sub1,String sub2,String sub3, int m1,int m2,int m3,String dept,String sec)throws Exception
{

  Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

  
  String user = "root";
  String password = "pswd1234";
  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproj_db?autoReconnect=true&useSSL=false",user,password);
  System.out.println("con--->"+con);
  
  //String s= "select * from FacSubTable where regnum =  '"+ fnum +"' and dept='"+dept+" ' and year= '"+year+" ' and sec='"+sec+" ' ";

  //String s= "   select regnum,"+column+" from MarksTable where dept =  '"+ dept +"' and "+subject+" = '"+y+"' and year='"+year+" ' and sec='"+sec+" '   ";
  String s="insert into MarksTable values(\"" + r+"\" , \"" + year+"\", \"" + sub1+"\", \"" + sub2+"\", \"" + sub3+"\","+m1+","+m2+","+m3+",\"" + dept+"\",\"" + sec+"\") ";
  System.out.println(s);
  Statement st= con.createStatement();
  int row = st.executeUpdate(s);
  //rs.next();
  
  return row;
}



public int addotherfac(String r, String o, String i) throws Exception
{

  Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
  String user = "root";
  String password = "pswd1234";
  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproj_db?autoReconnect=true&useSSL=false",user,password);
  System.out.println("con--->"+con);
  
  //String s= "select * from FacSubTable where regnum =  '"+ fnum +"' and dept='"+dept+" ' and year= '"+year+" ' and sec='"+sec+" ' ";

  //String s= "   select regnum,"+column+" from MarksTable where dept =  '"+ dept +"' and "+subject+" = '"+y+"' and year='"+year+" ' and sec='"+sec+" '   ";
  String s="insert into OtherFacTable values(\"" + r+"\" , \"" + o+"\", \"" + i+"\") ";
  System.out.println(s);
  Statement st= con.createStatement();
  int row = st.executeUpdate(s);
  //rs.next();
  
  return row;
}

public ResultSet fetchmarksbydept(String dept) throws Exception
{

  Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
  String user = "root";
  String password = "pswd1234";
  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproj_db?autoReconnect=true&useSSL=false",user,password);
  System.out.println("con--->"+con);
  
  //String s= "select * from FacSubTable where regnum =  '"+ fnum +"' and dept='"+dept+" ' and year= '"+year+" ' and sec='"+sec+" ' ";

  //String s= "   select regnum,"+column+" from MarksTable where dept =  '"+ dept +"' and "+subject+" = '"+y+"' and year='"+year+" ' and sec='"+sec+" '   ";
  String s="select * from MarksTable where dept= '"+dept+"' ";
  //System.out.println(s);
  Statement st= con.createStatement();
  ResultSet rs = st.executeQuery(s);
  //rs.next();
  
  return rs;
}


public ResultSet getmaxtotal(String dept, String year) throws Exception
{

  Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
  String user = "root";
  String password = "pswd1234";
  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproj_db?autoReconnect=true&useSSL=false",user,password);
  System.out.println("con--->"+con);

  String s= "select regnum,sec,(SUM(m1)+SUM(m2)+SUM(m3) ) AS total from MarksTable where dept='"+dept+" ' and year= '"+year+"' GROUP BY regnum ORDER BY total DESC  ";

  //String s= "   select regnum,"+column+" from MarksTable where dept =  '"+ dept +"' and "+subject+" = '"+y+"' and year='"+year+" ' and sec='"+sec+" '   ";
  //String s="select * from MarksTable where dept= '"+dept+"' ";
  //System.out.println(s);
  Statement st= con.createStatement();
  ResultSet rs = st.executeQuery(s);
  //rs.next();
  
  return rs;
}


public ResultSet getyear(String reg) throws Exception
{

  Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
  String user = "root";
  String password = "pswd1234";
  Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/miniproj_db?autoReconnect=true&useSSL=false",user,password);
  System.out.println("con--->"+con);
  
  String s= "select year from DetailsTable where regnum='"+reg+"' ";

  //String s= "   select regnum,"+column+" from MarksTable where dept =  '"+ dept +"' and "+subject+" = '"+y+"' and year='"+year+" ' and sec='"+sec+" '   ";
  //String s="select * from MarksTable where dept= '"+dept+"' ";
  //System.out.println(s);
  Statement st= con.createStatement();
  ResultSet rs = st.executeQuery(s);
  //rs.next();
  
  return rs;
}

}
