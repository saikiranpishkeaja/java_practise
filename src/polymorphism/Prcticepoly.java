package polymorphism;

public class Prcticepoly {

	static int add(int a, int b) {
		return a+b;
	}
	
	static double add(int a, int b) {
		return a+b;
	}
	
	public static void main(String[]args) {
		Prcticepoly.add(2, 4);
		System.out.println("sum");
		System.out.println("Hi bro unnava");
	}
}
