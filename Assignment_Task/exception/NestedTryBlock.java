package exception;

public class NestedTryBlock {

	public class NestedTryCatchExample {
	    public static void main(String[] args) {
	        try {
	            // Outer try block
	            System.out.println("Outer try block");
	            int[] numbers = {1, 2, 3};
	            try {
	                // Inner try block
	                System.out.println("Inner try block");
	                // This will throw ArrayIndexOutOfBoundsException
	                System.out.println(numbers[5]);
	            } catch (ArrayIndexOutOfBoundsException e) {
	                System.out.println("Caught an ArrayIndexOutOfBoundsException in inner catch: " + e.getMessage());
	            }
	            // This line will execute after the inner try-catch
	            int result = 10 / 0; // This will throw ArithmeticException
	        } catch (ArithmeticException e) {
	            System.out.println("Caught an ArithmeticException in outer catch: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("Caught a general exception in outer catch: " + e.getMessage());
	        }
	        System.out.println("Program continues after exception handling.");
	    }
	}
}
