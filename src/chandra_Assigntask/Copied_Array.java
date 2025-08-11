package chandra_Assigntask;

import java.util.Arrays;
import java.util.Scanner;

public class Copied_Array {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 
		System.out.println("Enter the size:");
		int size= sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the elements:");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		int[] copy_Array= new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			copy_Array[i]=arr[i];
		}
		
		System.out.println("Copied Array :"+Arrays.toString(copy_Array));
		System.out.println("Original Array :"+Arrays.toString(arr));
	}

}
