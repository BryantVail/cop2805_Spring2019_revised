package week13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {

	public static void main(String[] args)  throws IOException {
		// 
		
		int port = 8000;
//		String host = "localHost";
		DataInputStream in;
		DataOutputStream out;
		ServerSocket server = null;
		Socket socket;
		
		server = new ServerSocket(port);
		
		System.out.println("Please enter your Radius: ...");
		
		//wait for new socket
		socket = server.accept();
		
		//loop until "end chat" is read
		boolean keepChatting = true;
		while(keepChatting) {
			in = new DataInputStream(socket.getInputStream());
			
		}
		
		
		out = new DataOutputStream(socket.getOutputStream());
		
		double radius = in.readDouble();
		System.out.println("Got radius: " + radius);
		double area = Math.PI *radius *radius;//((2*3.14)*radius);
		
		//write area
		out.writeDouble(area);
		
		//close server
		server.close();

	}

}
