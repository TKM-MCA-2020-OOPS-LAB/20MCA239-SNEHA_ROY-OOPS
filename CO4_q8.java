/* Program to create a generic stack and do the Push and Pop operations. */

package product;

import java.util.Scanner;

public class CO4_q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackArray array= new StackArray();
		array.StackOperation();
		

	}

}
class StackArray{
	
	Scanner scan = new Scanner(System.in);
	int array[]  = new int[20];
	int top = -1;
	int choice;
	int size;
	int item;
	
	
	public void StackOperation() {
		
		System.out.print("enter the size of the array:  ");
		size = scan.nextInt();
		System.out.println("\n");
		for(int i=0;i< 3;i++) {
		System.out.print("CHOICES \n (1) \t push \n (2) \t pop  \n select : ");
		choice = scan.nextInt();
		System.out.println("\n");
		
		switch (choice) {
		case 1 :
			System.out.println("you have chose for push operation");
			if(top == (size-1)) {
				System.out.println("stack is overflow not able to conduct the push operation");
			}
			else {
				
				System.out.print("enter the element : ");
				item= scan.nextInt();
				
				top=top+1;
				array[top]=item;
				
			}break;
		case 2:
			System.out.println("you have chose for pop operation ");
			
			if(top== -1) {
				System.out.println("stack underflow not able to conduct the pop operation");
			}
			else {
				array[top] ='\0';
				top=top-1;
				
			}break;
			default:System.out.println("invalid choice ---try with 1 and 2");
		}
		if(top <0) {
			System.out.println("stack is empty");
		}
		else {
			System.out.println("the given stack is ");
			for( int j =(size-1); j>=0; j--) {
				System.out.println(array[j]);
			}
		}
		
		
	}}
}