package practicalPractice;

public class emp
{
	String eName;
	date dob;
	int id;
	
	emp()
	{
		eName=null;
		dob=null;
		id=0;
		
	}
	emp(String eName,date dob,int id)
	{
		this.eName=eName;
		this.dob=dob;
		this.id=id;
	}
	void display()
	{
		System.out.println("Employee Name:"+eName);
		System.out.println("Employee DOB:"+dob);
		System.out.println("Employee id:"+id);
	}

}
