package product;
import java.util.Stack;

public class CO4_q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<String>();
		
		stack.add("LIFE");
		stack.add("GOES");
		stack.add("ON");
		stack.add("BTS");
		
		System.out.println("original stack : "+stack);
		
		
		stack.remove(2);
		
		System.out.println("stack after deletion : "+stack);
		
	}

}
