package practicalPractice;

public class manager extends emp
{
	double salery;
	manager()
	{
		salery=0;
	}
	manager(String name,date dob,int id,double salery)
	{
		super(name,dob,id);
		this.salery=salery;
	}
	void display()
	{
		super.display();
		System.out.println("Employee Salery:"+salery);
	}

}
