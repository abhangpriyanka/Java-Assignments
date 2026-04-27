package Assignment_8;

import java.net.*;

public class UDPServer 
{
	public static void main(String args[]) 
	{
		try 
		{
			DatagramSocket ds = new DatagramSocket(8081);
			byte b[] = new byte[1024];
			DatagramPacket dp = new DatagramPacket(b, b.length);
			System.out.println("Server waiting for message...");
			ds.receive(dp);
			String msg = new String(dp.getData(), 0, dp.getLength());
			System.out.println("Client message: " + msg);
			String reply = "Message received";
			byte b1[] = reply.getBytes();
			DatagramPacket dp1 = new DatagramPacket(b1, b1.length, dp.getAddress(), dp.getPort());
			ds.send(dp1);
			ds.close();
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}