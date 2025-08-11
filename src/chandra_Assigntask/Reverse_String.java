package chandra_Assigntask;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
//		String word= "Java Developer";
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the word :");
		String word= sc.nextLine();
		
		for(int i=word.length()-1;i>=0;i--) {
			System.out.print(word.charAt(i));
		}
		
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println(sb);
		System.out.println(sb.reverse());

	}

}
