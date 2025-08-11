package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExmple {

	public static void main(String[] args) {
		
		Queue<String> com= new PriorityQueue<>();
		com.add("Ram");
		com.add("laxman");
		com.add("hanuman");
		
		System.out.println("Total:" +com);
		
		com.remove("hanuman");
		System.out.println("Updated: "+com);
		
		System.out.println("peeked: "+com.peek());
		
		com.add("sita");
		com.add("ravan");
		
		System.out.println("POLL: "+(com.poll()));
		
		System.out.println("Updated:"+ com);

	}

}
