package product;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class CO6_q3 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		
			
			FileInputStream fileinput = new FileInputStream("C:\\Users\\user\\Documents\\second sem\\oops\\product\\src\\product\\source.txt");
			
			FileOutputStream fileoutput = new FileOutputStream("C:\\Users\\user\\Documents\\second sem\\oops\\product\\src\\product\\destination.txt");
			
			int i;
			while((i = fileinput.read()) != -1){
				fileoutput.write(i);
				}
			System.out.println("copied");
			fileinput.close();
			fileoutput.close();
	

}
	}
