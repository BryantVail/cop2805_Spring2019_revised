package week13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * 
 * @author bryant vail
 *
 */
public class MyClient {
	
	public static void main(String[] args)  throws IOException {
		// 
		
		//init
		int port = 8000;
		String host = "127.0.0.1";
		DataInputStream in;
		DataOutputStream out;
		Socket socket;
		
		//new socket
		socket = new Socket(host, port);
		
		//input set up 
		in = new DataInputStream(socket.getInputStream());
		out = new DataOutputStream(socket.getOutputStream());
		
		System.out.print("Enter radius: ");
		Scanner input = new Scanner(System.in);
		
		//get next double
		double radius = input.nextDouble();
		
		
		out.writeDouble(radius);
		
		//streamRead double
		double area = in.readDouble();
		
		//local console
		System.out.println("Got area: " + area);
		
		socket.close();
		input.close();
		
		
	}

}
