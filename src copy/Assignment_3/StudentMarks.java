package Assignment_3;
//25-2-26
import java.util.Scanner;

public class StudentMarks 
{
    public static void main(String[] args)
     {
    	
            Scanner sc = new Scanner(System.in);
        
            System.out.print("Enter Roll Number: ");
            int rollNo = sc.nextInt();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            try 
            {
                if (marks < 0 || marks > 100) 
                    {
                    throw new MarksOutOfBoundException("Marks out of bound its  Must be between 0 and 100.");
                    }
                System.out.println("Roll No: " + rollNo + ", Marks: " + marks);
            } 
            catch (MarksOutOfBoundException e)
            {
                System.out.println("Exception: " + e.getMessage());
            }
            sc.close();
        
     }
}
