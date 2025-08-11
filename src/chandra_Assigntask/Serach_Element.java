package chandra_Assigntask;

public class Serach_Element {

	public static void main(String[] args) {
		int []arr= {6,4,3,1,9,7};
		
		int target = 8;
		boolean found= false;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println(target +" value found in array ");
		}
		else {
			System.out.println(target +" value not found in array");
		}

	}

}
