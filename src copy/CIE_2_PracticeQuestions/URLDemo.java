package CIE_2_PracticeQuestions;

import java.net.*;

public class URLDemo {
    public static void main(String[] args) throws Exception {
        // Modern way: use URI and then convert to URL
        URI uri = new URI("https://www.example:800/test/index.html?user=piya");
        URL url = uri.toURL();

        System.out.println("Protocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port: " + url.getPort());
        System.out.println("Path: " + url.getPath());
        System.out.println("File: " + url.getFile());
        System.out.println("Query: " + url.getQuery());
    }
}
