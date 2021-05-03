package product;
import java.util.Scanner;

public class Sum_complex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int real1,imagenary1,real2,imagenary2;
		
		Scanner in= new Scanner(System.in);
		
		System.out.println("enter the real part of your 1st complex number : ");
		
		real1 = in.nextInt();
		
		System.out.println("enter the imagenary part of your 1st complex number :");
		
	     imagenary1 = in.nextInt();
	     

		System.out.println("enter the real part of your 1st complex number : ");
			
		real2 = in.nextInt();
			
		System.out.println("enter the imagenary part of your 1st complex number :");
			
		 imagenary2 = in.nextInt();
		     
	     System.out.println((real1+real2)+ "+ i "+(imagenary1+imagenary2));
		
		
		
		
		
		
		
		

	}

}
