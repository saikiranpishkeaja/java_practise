package chandra_Assigntask;

public class Basic_Program {

	public static void main(String[] args) {
//		int num=16;
		
		System.out.println("The value of prime Number 1 to 100 :");
		 
		for(int i=0;i<=100;i++) {
		if(isPrime(i)) {
			System.out.println(i+ " It's a prime number");
		}
//			else {
//			System.out.println(num+ " It's not prime number");
//		}
//		
		}
		
	}
		
		static boolean isPrime(int num) {
			
			if(num <= 1) {
				
			return false;
			}
			
			for(int i=2;i*i< num;i++) {
				if(num%i==0) {
					return false;
				}
			}	
			return true;
			
//			int count=0;
//			for(int i=1;i<=num;i++) {
//				if(num%i==0) {
//					count++;
//				}
//			}
//			
//			return count==2;
		}
}


