/*Create an interface having prototypes of functions area() and perimeter(). Create two 
classes Circle and Rectangle which implements the above interface. Create a menu driven 
program to find area and perimeter of objects. */

package product;
import java.util.Scanner;

 interface calculation {
void area();
void perimeter();
}

class Circle implements calculations{
	
	float radius;
	
	 public void area(float r) {
		 this.radius = r;
		System.out.println("Area of the given circle is : "+(3.14*radius*radius));
	 }
	 
	 public void perimeter(float r)
	 {
		 this.radius = r;
		 System.out.println("Perimeter of the given circle is : " +(2*3.14*radius));
	 }
	 
 static class Rectangle extends Circle{
	int length;
	int breadth;
	
	public void area(int l ,int b) {
		this.length =l;
		this.breadth =b;
		System.out.println("Area of the given rectangle is : "+(length*breadth));
		
	}
	
	public void perimeter(int l,int b) {
		this.length =l;
		this.breadth =b;
		System.out.println("Perimeter of the given rectangle is : "+(2*(length+breadth)));
	}
		
}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		float radius;
		int length;
		int breadth;
		Circle obj = new Circle();
		Rectangle obj1 = new Rectangle();
		
		
		System.out.print("choose \n 1-> circle\n 2-> rectangle : ");
		int key = scan.nextInt();
		
		if(key == 1) {
			System.out.println("enter radius : ");
			radius = scan.nextFloat();
			obj.area(radius);
			obj.perimeter(radius);
			
		}
		else if (key == 2) {
			System.out.print("enter length : ");
			length = scan.nextInt();
			
			System.out.print("enter breadth : ");
			breadth = scan.nextInt();

			obj1.area(length,breadth);
			obj1.perimeter(length,breadth);
		}

	}
}

