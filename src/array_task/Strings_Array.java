package array_task;

public class Strings_Array {

	public static void main(String[]args) {
		
		String character[]= {"Ram","Sita","Arjun","Karna","Maya"};
		
		//for loop
		for(int i=0;i<character.length;i++) {
			System.out.println(character[i]);
		}
		
		//Enhanced-loop
		System.out.println("------------------");
		for(String names: character) {
			System.out.println(names);
		}
		
		//while
		System.out.println("##################");
		int num=0;
		if(num ==0){
		while(num < character.length) {
			System.out.println(character[num]);
			num++;
		}
		}
		
		//do-while
		System.out.println("------------------");
		int num1=0;
		do {
			System.out.println(character[num1]);
			num1++;
		}
		while(num1 < character.length);
	}
}
