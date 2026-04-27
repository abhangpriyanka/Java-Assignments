package Assignment_10;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class mainClass 
{

	public static void main(String[] args) 
	{
		System.out.println("hiiiii");
//	    Scanner sc =new Scanner(System.in);
//	    int i=sc.nextInt();
//	    System.out.println("i="+i);
	    
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection conn = DriverManager.getConnection(
	            	    "jdbc:mysql://localhost:3306/demo", "root", "Priyanka");
                System.out.println("Connected successfully!");
                
                String query="insert into myInfo(myID,myName)values(?,?)";
                PreparedStatement pstmt = conn.prepareStatement(query); 
               
                pstmt.setInt(1, 3);
                pstmt.setString(2, "Monika"); 
                int rows = pstmt.executeUpdate();
                if (rows > 0)
                { 
                	System.out.println("Data inserted successfully!"); 
                }
                
	            conn.close();
	        }
	        catch (Exception e) 
	        {
	            e.printStackTrace();
	        }
//	        sc.close();
}
}
