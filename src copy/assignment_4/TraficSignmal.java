package assignment_4;
//27-2-26
public class TraficSignmal extends Thread
{

		public static void main(String[] args) 
		{
	        String[] lights = {"RED", "GREEN", "YELLOW"};
	        try 
	        {
	            for (int i = 0; i < 6; i++) 
	            {
	                for (String light : lights)
	                {
	                    System.out.println("Signal: " + light);
	                    Thread.sleep(1000);
	                }
	            }
	        } 
	        catch (InterruptedException e)
	        {
	            System.out.println(e);
	        }
	}

}
