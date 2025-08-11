package polymorphism;

class Exmple{
	static int sum(int a, int b) {
		return a+b;
	}
	void sum(double a, double b) {
		System.out.println("SUM:"+a+b);
	}
}

public class ClassImplementAnotherClass {

	public static void main(String[] args) {
		
		System.out.println(Exmple.sum(2, 3));
		Exmple ex= new Exmple();
		ex.sum(3.0, 6.0);

	}

}
