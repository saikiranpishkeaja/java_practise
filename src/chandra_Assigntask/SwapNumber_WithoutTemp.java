package chandra_Assigntask;

public class SwapNumber_WithoutTemp {

	public static void main(String[] args) {
		int a=10, b=20;
		
		System.out.println("The value of Before swap a :" +a+ " and b: "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The value of After swap a : " +a+ " and b: "+b);

	}

}
