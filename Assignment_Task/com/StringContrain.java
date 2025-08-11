package string.com;

public class StringContrain {

	public static void main(String[] args) {
		String sentence = "Java programming is fun";
        String word = "programming";

        if (sentence.contains(word)) {
            System.out.println("The sentence contains the word '" + word + "'.");
        } else {
            System.out.println("The sentence does NOT contain the word '" + word + "'.");
        }

	}

}
