package product;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class CO6_q6_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		DatagramSocket server = new DatagramSocket(1234);
		byte[] buffer = new byte[256];
		DatagramPacket pack = new DatagramPacket(buffer,buffer.length);
		server.receive(pack);
		String message = new String(pack.getData());
		System.out.println("message from client : "+message);
		server.close();
		
		

	}

}

