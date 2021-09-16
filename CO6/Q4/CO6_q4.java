package product;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CO6_q4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream source = new FileInputStream ("C:\\Users\\user\\Documents\\second sem\\oops\\product\\src\\product\\source.txt");
		FileOutputStream destination_odd = new FileOutputStream ("C:\\Users\\user\\Documents\\second sem\\oops\\product\\src\\product\\odd.txt");
		FileOutputStream destination_even = new FileOutputStream ("C:\\Users\\user\\Documents\\second sem\\oops\\product\\src\\product\\even.txt");
		
		int i;
		while((i = source.read()) != -1){
			if(i%2==0) {
				
				destination_even.write(i);
			}
			else {
				
				destination_odd.write(i);
			}
			}
		System.out.println("copied");
		source.close();
		destination_even.close();
		destination_odd.close();

		

	}

}
