package chandra_Assigntask;

import java.util.Arrays;

public class Remove_value {

	public static void main(String[] args) {
		int arr[]= {2,6,9,4,1,8};
		int value_Remove= 6;
		boolean found =false;
		
		for(int num: arr) {
		  if(num== value_Remove) {
			  found= true;
			  break;
		  }
		}
		
		int []new_array= new int[arr.length-1];
		int count=0;
		
		for(int num: arr) {
			if(num != value_Remove) {
				new_array[count++]= num;
			}
		}
		
		System.out.println("Removed value "+value_Remove+" New array  created "+Arrays.toString(new_array));

	}

}
