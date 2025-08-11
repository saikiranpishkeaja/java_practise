package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExmple {

	public static void main(String[]args) {
		
		Queue<String> com= new LinkedList<>();
		
		com.add("apple");
		com.add("banana");
		com.add("cherry");
		
		System.out.println("Total: " +com);
		
		String front= com.remove();
		System.out.println("Removed Element:"+ front);
		
		System.out.println("Queue updated:" +com);
		
		com.add("pineapple");
		com.add("strawberry");
		
		//fetch the front item
		String peeked= com.peek();
		System.out.println("peeked Element:"+ peeked);
		
		System.out.println("Queue updated:"+ com);
		
	}
}
