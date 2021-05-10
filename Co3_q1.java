package product;
import java.util.Scanner;

public class Co3_q1 {
	
	public void area(int a) {
		System.out.println("the area of the square is : "+(a*a));
	}
	public void area(int a , int b) {
		System.out.println("the area of the rectangle is : "+(a*b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ,b;
		
		Scanner in = new Scanner(System.in);
		
		Co3_q1 obj = new Co3_q1();
		
		System.out.println("enter the values for a , b : ");
		
		a = in.nextInt();
		b = in.nextInt();
		
		System.out.println("------AREA------");
		obj.area(a);
		obj.area(a , b);
		

	}

}
