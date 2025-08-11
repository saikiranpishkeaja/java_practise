package array_task;

import java.util.ArrayList;

public class String_Arraylist {

	public static void main(String[] args) {
		
		ArrayList<String> animals= new ArrayList<>();
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Elephant");
		animals.add("Dog");
		animals.add("Wildfox");
		
		//forloop
		for(int i=0;i<animals.size();i++) {
			System.out.println(animals.get(i));
		}
		
		//Enhanced
		System.out.println("-----------------");
		for(String ani : animals) {
			System.out.println(ani);
		}
		
		//while
		System.out.println("#################");
		int num=0;
		while(num < animals.size()) {
			System.out.println(animals.get(num));
			num++;
		}
		
		//do-while
		int n=0;
		System.out.println("---------------");
		do {
			System.out.println(animals.get(n));
			n++;
		}
		while(n < animals.size());

	}

}
