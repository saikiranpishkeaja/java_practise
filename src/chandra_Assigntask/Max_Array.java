package chandra_Assigntask;

import java.util.Scanner;

public class Max_Array {

	public static void main(String[] args) {
//		int arr[]= {6,3,1,9,5,4};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array");
		int size= sc.nextInt();
		
		int arr[]=new int[size];
		
		int max=arr[0];
		
		System.out.println("Enter the elements:");
		for (int i=0;i<size;i++) {
			size=sc.nextInt();
		}
		int maximun =large_max(arr);
		System.out.println("The largest maximum value :"+max);

	}
	
	static int large_max(int arr[]) {
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}

}
