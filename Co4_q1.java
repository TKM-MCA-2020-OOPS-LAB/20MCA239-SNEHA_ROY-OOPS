package product;
import graphicspack.Math;
import java.util.Scanner;
public class Co4_q1 {

	public static void main(String[] args) {
		
		Math obj = new Math ();
		Scanner scan = new Scanner (System.in);
		
		int length;
		int breadth;
		int radius;
		int side;
		int height;
		int base;
		
		
		System.out.println("enter the following :");
		System.out.println("RECTANGLE-\n");

		System.out.print("length  : ");
		length = scan.nextInt();
		System.out.print("breadth :");
		breadth = scan.nextInt();
		
		System.out.println("CIRCLE-\n");

		System.out.print("radius : ");
		radius = scan.nextInt();
		System.out.println("TRIANGLE-\n");

		System.out.print("height : ");
		height= scan.nextInt();
		
		System.out.print("base : ");
		base = scan.nextInt();
		
		System.out.println("SQUARE-\n");

		System.out.print("side: ");
		side = scan.nextInt();
		
		obj.circle(radius);
		obj.rectangle(length, breadth);
		obj.triangle(height, base);
		obj.square(side);
		
		System.out.println("-----------AREA--------------");

		obj.display();
		

	}

}
