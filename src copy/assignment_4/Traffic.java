package assignment_4;

class TrafficSignal extends Thread 
{ public void run()  

{ 

try  

{ 

while (true)  

       { 

         System.out.println("Signal: RED"); Thread.sleep(2000); 

        System.out.println("Signal: YELLOW"); Thread.sleep(2000); 

        System.out.println("Signal: GREEN"); Thread.sleep(2000); 

       } 

  }  

catch (InterruptedException e) { System.out.println("Signal Interrupted"); 

  } 

} 

} 

  

public class Traffic  

 { 

public static void main(String[] args) { TrafficSignal t = new TrafficSignal(); t.start(); 

 } 

} 