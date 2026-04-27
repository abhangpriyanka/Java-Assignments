package Assignment_2;
import employee.Emp;

public class SalaryMain 
{
 public static void main(String[] args) 
 {
     Emp e1 = new Emp("Rahul", 101, "Manager", 50000);
     e1.calculateSalary();
     e1.display();
 }
}

