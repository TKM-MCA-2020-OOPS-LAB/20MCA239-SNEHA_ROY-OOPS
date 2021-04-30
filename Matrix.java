package product;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		
		int col,row,i,j;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter the number of rows:");
	    row = in.nextInt(); 
	    
	    System.out.println("Enter the number columns:");
	    col = in.nextInt();
	    
	    
	    int x[][] = new int[row][col];
	    int y[][] = new int[row][col];
	    int total[][] = new int[row][col];
	    
	    
	    System.out.println("Enter the elements of first matrix:"); 
	    for ( i= 0 ; i < row ; i++ )
	    {  
	    for ( j= 0 ; j < col ;j++ )
	    x[i][j] = in.nextInt(); 
	    System.out.println();
	    }
	    
	    
	    System.out.println("Enter the elements of second matrix");  
	    for ( i= 0 ; i < row ; i++ )
	    {   
	    for ( j= 0 ; j < col ;j++ )
	    y[i][j] = in.nextInt(); 
	    System.out.println();
	    }
	    
	    for ( i= 0 ; i < row ; i++ )
	    for ( j= 0 ; j < col ;j++ )
	    total[i][j] = x[i][j] + y[i][j] ; 
	    System.out.println("Sum of matrices:");  
	    for ( i= 0 ; i < row ; i++ )
	    { 
	    for ( j= 0 ; j < col ;j++ )
	    System.out.print(total[i][j]+"\t");  
	    System.out.println();
	    }  
		
		
}
}
