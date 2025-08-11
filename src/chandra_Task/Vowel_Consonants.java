package chandra_Task;

public class Vowel_Consonants {

	public static void main(String[] args) {
		char ch='1';
		
		if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println("This character are Vowel");
		}
	   else if(Character.isDigit(ch)){
			System.out.println("This character is Digit");
		}
	   else {
		   System.out.println("This character are Consonants");
	   }

	}

}
