package chandra_Task;

import java.util.Scanner;

public class TwoNumber_Max {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		
		
		if(a>b) {
			System.out.println("a GREATER than b");
		}
		else if(b<a) {
			System.out.println("b LESSER than a");
		}
		else {
			System.out.println("a is EQUAL to b");
		}

	
	sc.close();
	}

}
