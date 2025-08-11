package chandra_Assigntask;

import java.util.Scanner;

public class Sum_array {

	public static void main(String[] args) {
//		int arr[]= {6,4,9,2,7};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size:");
		int size= sc.nextInt();
		
		int arr[]= new int[size];
		
		System.out.println("Enter the array:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();	
		}
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("The sum of Array:"+sum);

	}

}
