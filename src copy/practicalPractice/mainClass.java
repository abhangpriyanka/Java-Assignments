package practicalPractice;

public class mainClass {

	public static void main(String[] args)
	{
		System.out.println("Employee Data");
		emp e=new emp("piya",new date(27,10,2002),101);
		e.display();
		System.out.println("manager Data");
		manager m=new manager("didi",new date(28,5,2000),101,20000);
		m.display();
		System.out.println("selces manager Data");
		selces s= new selces("piya",new date(27,10,2002),101,20000,30000);
		s.display();
		

	}

}
