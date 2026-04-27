package Assignment_7;
	import java.net.*;
	import java.io.*;

	public class mainClass 
	{
		public static void main(String args[]) 
		{
		try
		{
		ServerSocket ss = new ServerSocket(5000);
		System.out.println("Server is waiting for client...");
		Socket s = ss.accept();
		System.out.println("Client connected.");
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String clientMsg = "", serverMsg = "";
		while(!clientMsg.equals("bye")) 
		{
		clientMsg = dis.readUTF();
		System.out.println("Client: " + clientMsg);
		serverMsg = br.readLine();
		dos.writeUTF(serverMsg);
		dos.flush();
		}
		dis.close();
		dos.close();
		s.close();
		ss.close();
		} 
		catch(Exception e) 
		{
		System.out.println(e);
		}
		}
		}