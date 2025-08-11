package chandra_Assigntask;

import java.util.Scanner;

public class FibonocciSeries {

	public static void main(String[] args) {
//       Scanner sc= new Scanner(System.in);
//       
//       System.out.println("Enter the nth value :");
//       int num= sc.nextInt();
		
		int num=10;
       
		int n1=0, n2=1;
		
		for(int i=0;i<=num;i++) {
			System.out.println("The series of values :"+n1);
			
			int n=n1+n2;
			n1=n2;
			n2=n;
			
		}

	}

}
