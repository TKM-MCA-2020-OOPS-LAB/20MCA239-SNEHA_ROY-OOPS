/*Define 2 classes; one for generating Fibonacci numbers and other for displaying even 
numbers in a given range. Implement using threads. (Runnable Interface)*/

package product;

import java.util.Scanner;

public class CO4_q6 {

	public static void main(String[] args) throws InterruptedException {
		
	
		Fibonacci fib = new Fibonacci();
		Thread thread= new Thread(fib);
	    thread.start();
		thread.sleep(200);
		
		Even number = new Even();
		Thread threads= new Thread(number);
		threads.start();
		threads.sleep(200);

	}

}

class Fibonacci implements Runnable{
	int P=0;

	@Override
	public void run() {
		Scanner scan = new Scanner(System.in);
		int n1=0;
		int n2=1;
		int n3=0;
		
		System.out.println("------FIBONACCI SERIES-------");
		
		System.out.print(n1+"\t"+n2);
		
		for (int i=2; i<=10; i++) {
			
				n3=n1+n2;
				System.out.print("\t"+n3);
				n1=n2;
				n2=n3;
			
		}
		
	}
	
}

class Even implements Runnable{

	@Override
	public void run() {
		
		Scanner scan = new Scanner(System.in);
		int number;
		System.out.println("\n-------EVEN NUMBERS-----");
		System.out.print("enter the limit : ");
		number= scan.nextInt();
		
		for(int i=0; i<=number; i++) {
			
			if(i% 2 == 0) {
				System.out.print(i+"\t");
			}
			
		}
	}
	
}