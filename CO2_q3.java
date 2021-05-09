package product;

public class CO2_q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "hello";
		String s2 = "world";
		String word = s1+s2;
		
		System.out.println("------------STRING MANIPULATIONS----------");
		
		System.out.println(" String concagnate : we use + sign then :                                                    " + s1+s2);
		
		System.out.println(" length of a string : we use string.length :                                                 " +s1.length());
		
		System.out.println(" position of a character in a string (s1-->l) : we use indexOf :                             " +s1.indexOf('l'));
		
		System.out.println(" to find the character at a particular index (s1--> 3) : we usr charAt :                     " + s1.charAt(3));
		
		System.out.println(" to convert the string to uppercases : we use toUppercase :                                  "+s1.toUpperCase());
		
		System.out.println(" to convert the string to lowercases : we use toLowercase :                                  "+s1.toLowerCase());
		
		System.out.println(" to replace a strings : we use replace :                                                     " +word.replace("world", " Sara"));
		
		System.out.println(" to check whether a string end with a particular(s1-->o,true/false) : we use endsWith :       " +s1.endsWith("o"));
		
		System.out.println(" to check whether a string contain a particular string within or not(s1--> 'lh} : we use contains : "+s1.contains("lh"));
		
		System.out.println(" to compare a string to a given string : we use compareTo :                                      "+s1.compareTo("HEllo"));
		
		
	}

}
