package string.com;

public class Stringduplicate {

	public static void main(String[] args) {
		
		String input = "programming";
        input = input.toLowerCase(); // Optional: make case-insensitive

        char[] chars = input.toCharArray();
        boolean[] visited = new boolean[chars.length];

        System.out.print("Duplicate characters: ");

        boolean foundDuplicate = false;

        for (int i = 0; i < chars.length; i++) {
            if (visited[i]) {
                continue; // Already processed this char
            }

            int count = 1;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            if (count > 1) {
                System.out.print(chars[i] + " ");
                foundDuplicate = true;
            }
        }

        if (!foundDuplicate) {
            System.out.print("No duplicate characters found.");
        }

        System.out.println();

	}

}
