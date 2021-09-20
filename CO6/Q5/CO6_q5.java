package product;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CO6_q5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try {
			Socket socket = new Socket("localhost", 4564);
			PrintWriter write = new PrintWriter(socket.getOutputStream(), true);
			
			write.println("client here");
			
			InputStreamReader input = new InputStreamReader(socket.getInputStream());
			BufferedReader buffer = new BufferedReader(input);
			String message = buffer.readLine();
			System.out.println("message from server : "+message);
			write.close();
			socket.close();
		}
		catch(Exception e) {
			System.out.println("-----Error---------"+e);
		}

	}

}
