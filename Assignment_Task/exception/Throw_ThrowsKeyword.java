package exception;

public class Throw_ThrowsKeyword {
	
	static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            // throw actually throws the exception object
            throw new ArithmeticException("Age must be 18 or above");
        } else {
            System.out.println("Age accepted: " + age);
        }
    }

	public static void main(String[] args) {
		
		try {
            checkAge(16);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }

}
