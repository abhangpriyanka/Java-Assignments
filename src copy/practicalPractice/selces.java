package practicalPractice;

public class selces extends manager
{
double commision;
selces()
{
	commision=0;
}
selces(String name,date dob, int id,double salery,double commision)
{
	super(name,dob,id,salery);
	this.commision=commision;
}
void display()
{
	super.display();
	System.out.println("Commision:"+commision);
}
}
