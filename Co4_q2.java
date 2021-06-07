package product;
import java.util.Scanner;
import arithematicpack.Arithematic;
public class Co4_q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		float num1;
		float num2;
		
		Arithematic operation = new Arithematic ();
		
		System.out.println("enter the two number: ");
		System.out.print("number 1 = ");
		 num1 = scan.nextInt();
		
		System.out.print("number 2 = ");
		 num2 = scan.nextInt();
		 
		 System.out.println("------------------------------------------");
		 System.out.println("ARITHEMATIC OPERATION RESULT");
		 
		 operation.add(num1, num2);
		 operation.subtract(num1, num2);
		 operation.multiply(num1, num2);
		 operation.divide(num1, num2);

	}

}
