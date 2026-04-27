package practicalPractice;

public class exceptionMainClass {

	public static void main(String[] args) 
	{
		int marks=0,id=101;
		try
		{
			if(marks<=0 || marks>100)
			{
				throw new throwException("marks out of bound it must be in between 0 and 100");
			}
			else
			{
				System.out.println("marks:"+marks);
				System.out.println("Roll No:"+id);
				
			}
			
			
		}
		catch( Exception e)
		{
			System.out.println(e);
		}

	}

}
