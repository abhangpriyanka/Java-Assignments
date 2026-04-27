package CIE_2_PracticeQuestions;

import java.net.*;

class InetDemo
{
    public static void main(String[] args) throws Exception 
    {
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("Host Name: " + ip.getHostName());
        System.out.println("IP Address: " + ip.getHostAddress());
    }
}
