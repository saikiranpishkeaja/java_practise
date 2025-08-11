package chandra_Task;

public class Even_Odd {

	public static void main(String[] args) {
//		int a=46;
//		
//		if(a%2==0) {
//			System.out.println("The value is Even Number");
//		}
//		else {
//			System.out.println("The value is Odd Number");
//		}
//		
//		System.out.println("----CONDITION LEAP YEAR OR NOT----");
//		
//		int year=2025;
//		
//		if(year%4==0) {
//			System.out.println("Its a leap year");
//		}
//		else {
//			System.out.println("Not leap Year");
//		}
//		
		System.out.println("----CONDITION CHECK DIGIT OR NOT----");
		
	        char a = 'a';
	        if (Character.isDigit(a)) {
	            System.out.println(a+ " Its a digit");
	        } else {
	            System.out.println(a+ " Not a digit");
	        }
	   
	    System.out.println("----CONDITION CHECK ALPHABET OR NOT----");
	    
	    char ch = '1';
	    
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
	        
	        
	}

}
