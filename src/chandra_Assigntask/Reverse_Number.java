package chandra_Assigntask;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
//		int num=12345;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the value:");
		int num= sc.nextInt();
		
		int sum=0, digit;
		
		while(num!=0) {
			digit = num%10;
			sum= sum*10+digit;
			num/=10;
		}
		System.out.println(sum);
//		System.out.println(num);

	}

}
