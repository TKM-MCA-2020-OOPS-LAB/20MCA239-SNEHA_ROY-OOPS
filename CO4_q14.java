package product;

import java.util.Deque;
import java.util.LinkedList;

public class CO4_q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deq= new LinkedList<String>();
		
		deq.add("first");
		deq.addFirst("head");
		deq.addLast("tail");
		deq.offer("1");
		deq.offerFirst("2");
		deq.offerLast("6");
		deq.push("12");
		
		System.out.printf("deque elements : "+deq+"\n");
		
		
		
		deq.removeLast();
		deq.removeFirst();
		System.out.printf("after removing : "+deq+"\n");

	}

}
