package chandra_Assigntask;

import java.util.Scanner;

public class Duplicate_Array {

	public static void main(String[] args) {
//		int arr[]= {5,2,4,5,7,2,3,7};
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the size");
		int size= sc.nextInt();
		
		int arr[]=new int[size];
		
		System.out.println("Enter the elements");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print("The Duplicate Elements :" +arr[i]+" ");
					
				}
			}
		}

	}

}
