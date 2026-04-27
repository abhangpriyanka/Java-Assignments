package demo;
public class threadDemo extends Thread
{
 
    public void run()
    {
        for(int i=0;i<4;i++) 
        {
            System.out.println("Working...");
            try 
            {
				Thread.sleep(1000);
			} 
            catch (InterruptedException e) 
            {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
           
        }
    }
   public static void main(String[] args) throws Exception {
	   threadDemo t = new threadDemo();
        t.start();
        t.interrupt(); 
    }
}
