package chandra_Task;

public class CheckSpecialCharacter {

	public static void main(String[] args) {
		char ch='%';
		
		if(Character.isDigit(ch)) {
			System.out.println("The Character is Digit");
		}
		else if(Character.isLetter(ch)) {
			System.out.println("The Character is Letter");
		}
		else {
			System.out.println("The special character");
		}

	}

}
