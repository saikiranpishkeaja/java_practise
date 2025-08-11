package stack;

import java.util.Stack;

public class StackExample {

	public static void main(String[]args) {
		Stack<Integer> com= new Stack<>();
		com.push(10);
		com.push(20);
		com.push(null);
		com.push(30);
		com.push(0);
		com.push(40);
//		com.push(null);
//		com.push(70);
		
		// peek represent add item
		System.out.println("Top Element: " +com.peek());
		
		
		int item= com.pop();
		System.out.println("POP: " +item);
		
		int top= com.peek();
		System.out.println("PEEK:"+top);
		
		if(com.empty()) {
			System.out.println("stack is Empty");
		}else {
			System.out.println("stack not Empty");
		}
		
		
		int obj= com.search(null);
		System.out.println("position " +obj);
		
		while(!com.empty()) {
			System.out.println(com.pop());
		}
		
	}
}
