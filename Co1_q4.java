package product;
import java.util.Scanner;


public class Co1_q4 {

	public static void main(String[] args) {
		
		
		int size,i,j;
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter the number of rows and coloumns : ");
		
		size= in.nextInt();
		
		
		int x[][]= new int[size][size];
		
		System.out.println("enter your matrix elements : ");
		
		for(i = 0; i < size; i ++) {
			
			for(j = 0; j < size; j ++) 
				
				x [i][j] = in.nextInt();
		
				
				System.out.println() ;
				
			}
	
		
		System.out.println("the transpose of the given matrix is :");
		
for(i = 0; i < size; i ++) {
			
			for(j = 0; j < size; j ++) 
				
				System.out.println(x[j][i] );
			    
			 System.out.println("\t");
			
}
  boolean symmetry = true;
    
  for(i = 0;i < size ;i ++) {
	
	for(j = 0;j < size ; j++)
	
    if(x[j][i]!= x[i][j]) {
    	
    	symmetry=false;
    	break;
    }
  }
  
  if(symmetry) {
	  
	  System.out.println(" symmetric");
  }
  else {
	 
	  System.out.println("non symmetric");
  }

	}	

	}


