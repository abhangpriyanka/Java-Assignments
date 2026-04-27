package Assignment_11;

import java.sql.*;

public class studentDB 
{
    private Connection conn;


    public void connect() 
    {
        try
        {
            JDBC_Connection obj = new JDBC_Connection();
            conn = obj.connection();  
            if (conn != null)
            {
                System.out.println("Connection established successfully.");
            } 
            else 
            {
                System.out.println("Connection failed.");
            }
        } catch (Exception e) 
        {
            System.out.println("Error connecting to database: " + e.getMessage());
        }
    }

    // Fetch student by roll number
    public void getStudentByRollNo(int rollNo) 
    {
        try {
            String query = "SELECT * FROM STUDENT WHERE roll_no = ?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, rollNo);
            ResultSet rs = ps.executeQuery();

            if (rs.next())
            {
                System.out.println("Student Details:");
                System.out.println("Roll No: " + rs.getInt("roll_no"));
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Class: " + rs.getString("class"));
                System.out.println("DOB: " + rs.getDate("DOB"));
            }
            else
            {
                System.out.println("No student found with roll no " + rollNo);
            }
        } catch (SQLException e) 
        {
            System.out.println("Error fetching student: " + e.getMessage());
        }
    }

    // Display all students
    public void displayAllStudents() 
    {
        try
        {
            String query = "SELECT * FROM STUDENT";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            System.out.printf("%-10s %-20s %-10s %-15s\n", "Roll No", "Name", "Class", "DOB");
            System.out.println("-------------------------------------------------------------");

            while (rs.next()) 
            {
                System.out.printf("%-10d %-20s %-10s %-15s\n",
                    rs.getInt("roll_no"),
                    rs.getString("name"),
                    rs.getString("class"),
                    rs.getDate("DOB").toString()
                );
            }
        } catch (SQLException e) 
        {
            System.out.println("Error displaying students: " + e.getMessage());
        }
    }
}
