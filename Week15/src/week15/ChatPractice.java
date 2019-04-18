package week15;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ChatPractice {

	

	public static void main(String[] args) throws IOException {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter listen port: ");
	int listenPort = Integer.parseInt(input.nextLine());

	Listener listener = new Listener(listenPort);
	Thread thread = new Thread(listener);
	thread.start();

	System.out.print("Enter IP number: ");
	//String host = "192.168.224.73";
	String host = input.nextLine();
	System.out.print("Enter send port: ");
	int sendPort = Integer.parseInt(input.nextLine());

	//int port = 8000;

	Socket socket = null;
	do {
	try {
	socket = new Socket(host, sendPort);
	}
	catch (Exception ex) {
	// ignore exception and try again
	}
	} while (socket == null);

	DataOutputStream out = new DataOutputStream(socket.getOutputStream());

	System.out.println("Ready...");

	String line = "";
	while (!line.equals("exit")) {
	line = input.nextLine();
	out.writeUTF(line);
	}

	socket.close();
	input.close();
	}
}

class Listener implements Runnable {

	int listenPort = 0;

	public Listener(int listenPort) {
		this.listenPort = listenPort;
	}

	@Override
	public void run() {
		int port = listenPort;
		DataInputStream in;
		ServerSocket server = null;
		Socket socket;

		try {
			server = new ServerSocket(port);

			System.out.println("Listening for a client to connect...");
			socket = server.accept();
			in = new DataInputStream(socket.getInputStream());

			while (true) {
				String line = in.readUTF();
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
