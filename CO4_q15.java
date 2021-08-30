package product;

import java.util.LinkedHashSet;

public class CO4_q15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> hash = new LinkedHashSet<String>();
		hash.add("ann");
		hash.add("megha");
		hash.add("gauthami");
		
		System.out.printf("size of the set is  : "+ hash.size()+"\n");
		System.out.printf("the set is : "+ hash+"\n");
		System.out.printf("removing string ann from the set : "+ hash.remove("ann")+"\n");
		System.out.printf("the set is  : "+ hash+"\n");
		System.out.print("checking if ann is in the list or not :" +hash.contains("ann")+"\n");
		
		

	}

}
