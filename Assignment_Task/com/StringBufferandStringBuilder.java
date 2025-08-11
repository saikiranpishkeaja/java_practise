package string.com;

public class StringBufferandStringBuilder {

	public static void main(String[] args) {
		
	        String input = "hello world";

	        String reversedWithBuffer = new StringBuffer(input).reverse().toString();
	        System.out.println("Reversed (StringBuffer): " + reversedWithBuffer);

	        String reversedWithBuilder = new StringBuilder(input).reverse().toString();
	        System.out.println("Reversed (StringBuilder): " + reversedWithBuilder);

	}

}
