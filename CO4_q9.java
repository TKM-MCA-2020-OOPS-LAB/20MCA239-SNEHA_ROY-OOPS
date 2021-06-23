package product;
import java.util.Scanner;

public class CO4_q9 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int size ;
	
		
		System.out.print("enter the size of the array : ");
		size = scan.nextInt();
		
		sorting sort = new sorting();
		sort.bublesorting(size);
	

	}

}
class sorting{
	int arraysize;
	int temp;
	public void bublesorting(int size) {
		this.arraysize = size;
	
		
		
		int [] array = new int [arraysize];
		Scanner scan = new Scanner(System.in);
for(int i = 0; i <size; i++) {
			
			System.out.print("enter the element : ");
			//element= scan.nextInt();
			array[i]=scan.nextInt();
		}
		
		
		for(int j=0; j<arraysize-1; j++) {
			
			for(int k=0; k<arraysize-1; k++) {
				
				if(array[k]>array[k+1]) {
					temp= array[k];
					array[k]=array[k+1];
					array[k+1]=temp;
				}
			}
		}
		System.out.println("\n ----SORTED ARRAY-----");
		for(int l=0; l<arraysize; l++) {
			System.out.print(array[l]+" ");
		}
		
	}
	
	
	
}
