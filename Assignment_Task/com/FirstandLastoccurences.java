package string.com;

public class FirstandLastoccurences {

	public static void main(String[] args) {
		 String input = "programming";
	        char ch = 'g';

	        int firstIndex = input.indexOf(ch);
	        int lastIndex = input.lastIndexOf(ch);

	        if (firstIndex == -1) {
	            System.out.println("Character '" + ch + "' not found in the string.");
	        } else {
	            System.out.println("First occurrence of '" + ch + "' at index: " + firstIndex);
	            System.out.println("Last occurrence of '" + ch + "' at index: " + lastIndex);
	        }

	}

}
