import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        boolean isPangram = isPangram(sentence);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        // Create a boolean array to track the presence of each letter (a-z)
        boolean[] letters = new boolean[26];

        // Convert the input sentence to lowercase to make it case-insensitive
        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                int index = ch - 'a';
                letters[index] = true;
            }
        }

        // Check if all letters (a-z) are present
        for (boolean letter : letters) {
            if (!letter) {
                return false;
            }
        }

        return true;
    }
}
