package polymorphism;

public class PolyExmple {

	static void add(int a, int b) {
		System.out.println("sum:" +(a+b));
	}
	
	void add(int a, int b, int c) {
		System.out.println("Add:"+(a+b+c));
	}
	
	
	public static void main(String[]args) {
		PolyExmple.add(2, 4);
		PolyExmple pol= new PolyExmple();
		pol.add(2, 4, 6);
	}
}
