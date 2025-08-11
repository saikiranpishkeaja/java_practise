package polymorphism;

public class StaticStringMethod {

	static String concat(String s1, String s2) {
		return s1+s2;
	}
	
	static String concat(String s1, String s2, String s3) {
		return s1+s2+s3;
	}
	
	public static void main (String[]args) {
		
//		System.out.println(StaticStringMethod.concat("Arjun", "ramulu"));
//		System.out.println(StaticStringMethod.concat("Arjun", "ramulu","relation"));

		String result= concat("Welcome","kit");
		System.out.println(result);
	
		
		// from another class using classname
//		public class Main {
//		    public static void main(String[] args) {
//		        String result = StringMethod.concat("Java", "Rocks");
//		        System.out.println(result);
//		    }
//		}
		
		
		
	}
}
