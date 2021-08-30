package product;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class CO4_Q18 {
	
	public static <i,s> Map<i,s> convertToTreeMap(Map<i,s> hashMap){
		
		Map<i,s> treeMap = new TreeMap<>();
		treeMap.putAll(hashMap);
		return treeMap;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer>hashMap = new HashMap<>();
		hashMap.put("Euphoria",1);
		hashMap.put("DNA",2);
		hashMap.put("Jump",5);
		
		System.out.println("HASHMAP: "+hashMap);
		
		Map <String,Integer>treemap = convertToTreeMap(hashMap);
		System.out.println("TREEMAP: "+treemap);
		
	}

}
