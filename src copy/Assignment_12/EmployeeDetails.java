package Assignment_12;
import java.sql.*;

public class EmployeeDetails 
{
    public void showEmpDetails() 
    {
    	DBConnection  db = new DBConnection();
        Connection conn = db.connection();

        if (conn == null) 
        {
            System.out.println("Database connection failed.....");
            return;
        }

        try {
            String query = "SELECT emp_id, first_name, last_name, age, date_of_joining FROM EMPLOYEE";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.printf("%-10s %-15s %-15s %-5s %-15s\n", 
                              "EmpID", "First Name", "Last Name", "Age", "Date of Joining");
            System.out.println("---------------------------------------------------------------");

            while (rs.next()) 
            {
                System.out.printf("%-10d %-15s %-15s %-5d %-15s\n",
                        rs.getInt("emp_id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getInt("age"),
                        rs.getDate("date_of_joining").toString());
            }

            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) 
        {
            System.out.println("Error fetching employee details: " + e.getMessage());
        }
    }
}
