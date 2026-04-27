package ClintServerDemo;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
public class server 
{
	    public static void main(String[] args) {
	        try {
	            ServerSocket server = new ServerSocket(8081);
	            System.out.println("Server started, waiting for client...");
	            Socket s = server.accept();
	            System.out.println("Client connected!");

	            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
	            PrintWriter out = new PrintWriter(s.getOutputStream(), true);
	            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

	            String msg;
	            while((msg = in.readLine()) != null) {
	                System.out.println("Client: " + msg);
	                System.out.print("Server: ");
	                String reply = console.readLine();
	                out.println(reply);
	            }

	            in.close();
	            out.close();
	            s.close();
	            server.close();
	        } catch(Exception e) {
	            e.printStackTrace();
	        }
	    }
	}
