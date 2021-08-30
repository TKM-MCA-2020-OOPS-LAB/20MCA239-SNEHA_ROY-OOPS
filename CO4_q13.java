package product;
import java.util.PriorityQueue;
public class CO4_q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> queue= new PriorityQueue<String>();
		
		queue.add("something");
		queue.add("just");
		queue.add("like");
		queue.add("this");
		
		System.out.println("original queue : "+queue);
		//peek will return the top value
		System.out.println("the head of the queue : "+queue.peek());
		System.out.println("after peek operation : "+queue);
		//poll will remove and give you the top
		System.out.println("the head of the queue : "+queue.poll());
		System.out.println("after poll operation : "+queue);
		

	}

}
