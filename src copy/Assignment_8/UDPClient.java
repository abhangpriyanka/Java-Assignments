package Assignment_8;

import java.net.*;

public class UDPClient 
{
	public static void main(String args[]) 
	{
		try 
		{
			DatagramSocket ds = new DatagramSocket();
			String msg = "Hello Server";
			byte b[] = msg.getBytes();
			InetAddress ip = InetAddress.getByName("localhost");
			DatagramPacket dp = new DatagramPacket(b, b.length, ip, 8081);
			ds.send(dp);
			byte b1[] = new byte[1024];
			DatagramPacket dp1 = new DatagramPacket(b1, b1.length);
			ds.receive(dp1);
			String reply = new String(dp1.getData(), 0, dp1.getLength());
			System.out.println("Server reply: " + reply);
			ds.close();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}