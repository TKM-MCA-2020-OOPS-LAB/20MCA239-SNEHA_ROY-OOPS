package product;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class CO6_q6 {

	public static void main(String[] args)throws IOException {
		
		DatagramSocket client = new DatagramSocket();
		InetAddress address = InetAddress.getByName("localhost");
		String message = "hi server";
		byte[] bufBytes = message.getBytes();
		DatagramPacket datagramPacket = new DatagramPacket(bufBytes,bufBytes.length,address,1234);
		client.send(datagramPacket);
		client.close();

	}

}

    
