package Assignment_7;

import java.io.*;
import java.net.*;
public class clientClass 
{
public static void main(String args[]) 
{
try
{
Socket s = new Socket("localhost",8081);
DataInputStream dis = new DataInputStream(s.getInputStream());
DataOutputStream dos = new DataOutputStream(s.getOutputStream());
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String clientMsg = "", serverMsg = "";
while(!clientMsg.equals("bye"))
{
clientMsg = br.readLine();
dos.writeUTF(clientMsg);
dos.flush();
serverMsg = dis.readUTF();
System.out.println("Server: " + serverMsg);
}
dis.close();
dos.close();
s.close();
} catch(Exception e) 
{
System.out.println(e);
}
}
}