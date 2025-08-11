package exception;

public class TryException {

	public static void main(String[] args) throws NullPointerException {
		try {
			int result=10/0;
			System.out.println("Found result");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithemetic Exception ");
		}
		catch(NullPointerException e) {
			System.out.println("Null pointer");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
