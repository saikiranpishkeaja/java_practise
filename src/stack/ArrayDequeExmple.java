package stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExmple {

	public static void main(String[]args) {
		 
		Deque<String> com= new ArrayDeque<>();
		com.add("A");
		com.add("B");
//		com.add(null);
		com.add("C");
		com.add("D");
		
		System.out.println(com);
		
		while(!com.isEmpty()) {
			System.out.println(com.poll());
		}
		System.out.println(com.pollFirst());
		System.out.println(com.pollLast());
		
		
		Deque<Integer> demo= new ArrayDeque<>();
		demo.push(20);
		demo.push(30);
		demo.push(40);
		demo.push(50);
		
		System.out.println(demo);
		System.out.println(demo.pollFirst());
		System.out.println(demo.pop());
		
	}
}
