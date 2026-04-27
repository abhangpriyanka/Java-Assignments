package Assignment_11;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBC_Connection 
{
	
		Connection connection()
		{
		Connection conn=null;
		String pass="Priyanka";
		String user="root";
		String url="jdbc:mysql://localhost:3306/studentRecord";
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


