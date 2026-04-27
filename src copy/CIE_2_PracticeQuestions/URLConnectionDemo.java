package CIE_2_PracticeQuestions;

import java.net.*;
import java.io.*;

class URLConnectionDemo {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.example.com");
        URLConnection conn = url.openConnection();
        System.out.println("Content Type: " + conn.getContentType());
        System.out.println("Content Length: " + conn.getContentLength());
        System.out.println("Date: " + conn.getDate());
        System.out.println("Last Modified: " + conn.getLastModified());
    }
}
