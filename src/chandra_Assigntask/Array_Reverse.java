package chandra_Assigntask;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Reverse {

	public static void main(String[] args) {
//		int arr[]= {1,2,3,4,5};
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size:");
		int size= sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		reverse_check(arr);
		System.out.println("Reverse array " +Arrays.toString(arr));
	}
	
	static void reverse_check(int arr[]) {
		int start=0;
		int end=arr.length-1;
		
		while(start<end) {
			
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		
	
		start++;
		end--;
		}
	}


}
