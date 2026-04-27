package practicalPractice;

import java.util.Scanner;

public class trafficSignal extends Thread
{
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			
			try 
			{
			System.out.println("Green");
			Thread.sleep(1000);
			System.out.println("red");
			Thread.sleep(1000);
			System.out.println("yellow");
			Thread.sleep(1000);	
			} 
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
