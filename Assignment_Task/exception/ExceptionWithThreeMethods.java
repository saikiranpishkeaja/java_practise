package exception;

public class ExceptionWithThreeMethods {

	public static void main(String[] args) {
		
		try {
            method1();
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        method3();
    }

    static void method3() throws Exception {
        throw new Exception("Exception thrown in method3");
    }


}
