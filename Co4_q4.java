/*Find the average of N positive integers, raising a user defined exception for each negative 
input*/


package product;
import java.util.Scanner;

public class Co4_q4 {

	public static void main(String[] args)  {
      
		
		int digit =0;
		try {
			negativevalidation(digit);
		}
		catch(NegativeException e){
			System.out.println("Exception occured "+e+"\n"+e.Message());
			
		}
	}

	private static void negativevalidation(float number) throws NegativeException {
		
		
		Scanner scan = new Scanner(System.in);

		float sum =0;
		float digit=0;
		
		System.out.print("enter the number to be inserted :");
		number = scan.nextInt();
		
		for (int i = 1; i<=number; i++) {
			
			System.out.print("enter "+i+" number : ");
			digit = scan.nextInt();
			
		         if (!(digit>0)) {
				         throw new NegativeException();
				
			                    }
		    
			    else {
			            sum = sum+digit;
		             }
		    }
		System.out.println("the average of the given number : " +(sum/number));
				
	}
	}
