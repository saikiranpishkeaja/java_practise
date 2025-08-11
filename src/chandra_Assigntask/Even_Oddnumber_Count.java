package chandra_Assigntask;

public class Even_Oddnumber_Count {

	public static void main(String[] args) {
		int arr[]= {7,5,2,9,4,1,8};
		
		int ecount=0, ocount=0;
		
		for(int num:arr) {
			if(num%2==0) {
				System.out.println("Even number are: "+num);
				ecount++;
			}else {
				System.out.println("Odd number are: "+num);
				ocount++;
			}
		}
		System.out.println("Total Even number:"+ecount);
		System.out.println("Total Odd number:" +ocount);

	}

}
