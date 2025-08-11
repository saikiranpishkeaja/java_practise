package polymorphism;

public class StringMethod {

		String concat(String s1, String s2) {
			return s1+s2;
		}
		
		String concat(String s1, String s2, String s3) {
			return s1+s2+s3;
	}
		
		public static void main(String[]args) {
			
			StringMethod sm = new StringMethod();
		
			String result1= sm.concat("Arjun", "Maya");
			String result2 = sm.concat("Developer", result1);
			
			System.out.println(result1);
			System.out.println(result2);
			
		}
}
