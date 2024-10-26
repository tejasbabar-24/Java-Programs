import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static char findFirstNonRepeatedChar(String input) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Count occurrences of each character
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first character with a count of 1
        for (char c : input.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }

        return '\0'; // return null character if all characters repeat
    }

    public static void main(String[] args) {
        String input = "swiss";
        char result = findFirstNonRepeatedChar(input);

        if (result != '\0') {
            System.out.println("The first non-repeated character is: " + result);
        } else {
            System.out.println("All characters are repeated.");
        }
    }
}
