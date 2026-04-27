package Assignment_11;

public class mainClass 
{
    public static void main(String[] args)
    {
    
        if (args.length == 0)
        {
            System.out.println("Please provide roll number as command line argument.");
            return;
        }

        int rollNo = Integer.parseInt(args[0]);
        studentDB sd = new studentDB();
        sd.connect();
        sd.getStudentByRollNo(rollNo);
        System.out.println("\nAll Student Records:");
        sd.displayAllStudents();
    }
}
