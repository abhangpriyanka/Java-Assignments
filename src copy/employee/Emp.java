package employee;

public class Emp
{
 String name;
 int empId;
 String category;
 double basicPay, hra, da, allowance;
 double pf, grossPay, netPay, incomeTax;

 public Emp(String name, int empId, String category, double basicPay) 
 {
     this.name = name;
     this.empId = empId;
     this.category = category;
     this.basicPay = basicPay;
 }
 public void calculateSalary() 
 {
     hra = 0.20 * basicPay;      
     da = 0.15 * basicPay;        
     allowance = 0.10 * basicPay; 
     pf = 0.12 * basicPay;       
     grossPay = basicPay + hra + da + allowance;
     incomeTax = 0.05 * grossPay; 
     netPay = grossPay - (pf + incomeTax);
 }
 public void display() 
 {
     System.out.println("Employee Name: " + name);
     System.out.println("Employee ID: " + empId);
     System.out.println("Category: " + category);
     System.out.println("Basic Pay: " + basicPay);
     System.out.println("HRA: " + hra);
     System.out.println("DA: " + da);
     System.out.println("Allowance: " + allowance);
     System.out.println("Provident Fund: " + pf);
     System.out.println("Gross Pay: " + grossPay);
     System.out.println("Income Tax: " + incomeTax);
     System.out.println("Net Pay: " + netPay);
 }
}
