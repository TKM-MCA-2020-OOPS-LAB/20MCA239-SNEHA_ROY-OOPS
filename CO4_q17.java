package product;

import java.util.HashMap;
import java.util.Map;

public class CO4_q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<Integer,String> hashmap1 = new HashMap<Integer,String>();
		Map<Integer, String>hashmap2 = new HashMap<Integer,String>();
		
		hashmap1.put(1, "lets");
		hashmap1.put(2, "jump");
		hashmap1.put(3, "v");
		
		hashmap2.put(4,"like" );
		hashmap2.put(5,"an" );
		hashmap2.put(6,"echo" );
		
		
		System.out.println("Hash Map1 :"+hashmap1);
		System.out.println("Hash Map2 : "+hashmap2);
		
		hashmap1.put(3, "BTS");
		hashmap2.put(5, "goes");
		
		System.out.println("Hash Map1 after changing :"+hashmap1);
		System.out.println("Hash Map2 after changing : "+hashmap2);
		
		
		
		hashmap1.remove(3);
		hashmap2.remove(5);
		
		System.out.println("Hash Map1 after removing :"+hashmap1);
		System.out.println("Hash Map2 after removing : "+hashmap2);
		
		
		

	}

}
