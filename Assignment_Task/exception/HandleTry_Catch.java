package exception;

public class HandleTry_Catch {

	public static void main(String[] args) {
		
		try {
            int[] arr = new int[3];
            arr[2] = 5;

            try {
                String s = null;
                System.out.println(s.length());  // NullPointerException
            } catch (NullPointerException npe) {
                System.out.println("Caught NullPointerException inside nested try: " + npe.getMessage());
            }

            System.out.println(arr[5]);  // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("Caught ArrayIndexOutOfBoundsException in outer try: " + aie.getMessage());
        }

	}

}
