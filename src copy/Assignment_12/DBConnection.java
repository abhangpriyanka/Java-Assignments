package Assignment_12;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection 
{
	Connection connection()
	{
	Connection conn=null;
	String pass="Priyanka";
	String user="root";
	String url="jdbc:mysql://localhost:3306/employeeadetails";
	try
	{
	Class.forName("com.mysql.cj.jdbc.Driver");
    conn = DriverManager.getConnection(url,user,pass );
	}
    catch(Exception e)
	{
    	System.out.println(e);
	}
	return conn;
	}

}
