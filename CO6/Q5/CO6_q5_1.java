package product;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class CO6_q5_1 {

	public static void main(String[] args )throws Exception {
		// TODO Auto-generated method stub
		
		try {
			ServerSocket socketserver = new ServerSocket(4564);
			System.out.println("----waiting------");
			Socket socket = socketserver.accept();
			System.out.println("---------connected to server---------");
			InputStreamReader reader = new InputStreamReader(socket.getInputStream());
			BufferedReader buffer = new BufferedReader (reader);
			String message = buffer.readLine();
			System.out.println("message from Client: "+message);
			
			PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
			writer.println("Server here");
			writer.close();
			
		}
		catch (Exception e) {
			System.out.println("------error--------"+e);
		}

	}

}
