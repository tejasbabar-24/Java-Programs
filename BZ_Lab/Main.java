import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input word from the user
        System.out.println("Enter a word:");
        String word = scanner.nextLine();

        // Input character to check from the user
        System.out.println("Enter a character to check:");
        char characterToCheck = scanner.next().charAt(0);

        // Check if the character is present in the word
        boolean isPresent = word.indexOf(characterToCheck) != -1;

        // Output the result
        if (isPresent) {
            System.out.println("Character '" + characterToCheck + "' is present in the word \"" + word + "\".");
        } else {
            System.out.println("Character '" + characterToCheck + "' is not present in the word \"" + word + "\".");
        }

        scanner.close();
    }
}
