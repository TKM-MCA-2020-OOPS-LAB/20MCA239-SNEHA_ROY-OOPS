/*Maintain a list of Strings using ArrayList from collection framework, perform built-in 
operations.*/

package product;

import java.util.ArrayList;
import java.util.Collections;

public class CO4_q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("sneha");
		list.add("megha");
		list.add("gauthami");
		list.add("manna");
		list.add("ann");
		
		System.out.println("-----arraylist------\n using add operation");
		for(String elements:list)
			System.out.println(elements);
		
		list.remove(3);
		list.remove("ann");
		System.out.println("-----arraylist------\n using remove operation");
		for(String elements:list)
			System.out.println(elements);
		
		Collections.sort(list);
		System.out.println("-----arraylist------\n using sorting operation");
		for(String elements:list)
			System.out.println(elements);
		
		System.out.println("--using contains operations--");
	
		System.out.println(" sneha is in the given array list or not :  "+list.contains("sneha"));
		System.out.println(" ann is in the given array list or not :  "+list.contains("ann"));
		
		System.out.println("--using get operations--");
		System.out.println("element in the 2 nd index number : "+list.get(1));
		
		
		System.out.println("--using size operations--");
		System.out.println("size of the arraylist is : "+list.size());
		
		System.out.println("--using clear operations--");
		list.clear();
		System.out.println("after clear operation is the array list is : "+list);
	}

}
