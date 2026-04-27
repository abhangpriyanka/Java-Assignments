package ClintServerDemo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class client  
{
	    public static void main(String[] args)
	    {
	        try {
	            Socket socket = new Socket("localhost", 8081);
	            System.out.println("Connected to server!");

	            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
	            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

	            String msg;
	            while(true) {
	                System.out.print("Client: ");
	                msg = console.readLine();
	                out.println(msg);

	                String reply = in.readLine();
	                System.out.println("Server: " + reply);
	            }
	        } 
	        catch(Exception e) 
	        {
	            e.printStackTrace();
	        }
	    }
	}

