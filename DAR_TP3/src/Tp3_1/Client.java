package Tp3_1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("192.168.248.1", 1234);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

            // Send a message to the server
            pw.println("Hello, I am a client on this server");

        
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
