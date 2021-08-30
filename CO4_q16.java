package product;

import java.util.Arrays;
import java.util.HashSet;

public class CO4_q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(2);
		
		System.out.println("the first set is : "+hs);
	
		
		HashSet<Integer>hs2= new HashSet<Integer>();
		hs2.addAll(Arrays.asList(new Integer[] {1,3,4,5,7,8}));
		System.out.println("the second set is : "+hs2);
		
		HashSet<Integer> union = new HashSet<Integer>(hs);
	        
		union.addAll(hs2);
		System.out.println("the union of  2 sets is : " +union);
		
		
		HashSet<Integer> intersection = new HashSet<Integer>(hs);
        intersection.retainAll(hs2);
		System.out.println("the intersection of 2 sets is : " +intersection);
		
		 HashSet<Integer> difference = new HashSet<Integer>(hs);
	  
		difference.removeAll(hs2);
		System.out.println("the difference of 2 sets is : "+ difference);
		

	}

}
