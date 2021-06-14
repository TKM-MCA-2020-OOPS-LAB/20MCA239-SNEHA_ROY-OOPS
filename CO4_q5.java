/*Define 2 classes; one for generating multiplication table of 5 and other for displaying first 
N prime numbers. Implement using threads. (Thread class) */

package product;
import java.util.Scanner;
public class CO4_q5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Multiplication object = new Multiplication();
		object.start();
		object.sleep(200);
		
		Prime object1 = new Prime();
		object1.start();
		object1.sleep(200);
		
		
		

	}

}
class Multiplication extends Thread{
	public void run() {
		
		System.out.println("---------MULTIPLICATION TABLE OF 5---------- \n\n");
		for(int i =1; i<=10; i++) {
			
			System.out.println(i+" X 5 = " +(5*i));
		}
	}
}
class Prime extends Thread {
	public void run() {
		int number;
		int flag ;
		
		Scanner scan = new Scanner(System.in);

		System.out.print("\nenter N : ");
		number = scan.nextInt();
		
		System.out.println("-----------PRIME NUMBERS ARE--------- ");
		
		for (int i = 2; i <= number; i++)
	    {
			flag = 0;


	        for (int j = 2; j <= i / 2; j++)
	        {
	            if (i % j == 0)
	            {
	                flag = 1;
	                break;
	            }
	        }

	        if (flag == 0)
	            System.out.println(i);
	    }
}}