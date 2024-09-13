public class ReverseWordsInString {

    // Function to reverse each word in the string
    public static String reverseWords(String str) {
        // Split the string into words
        String[] words = str.split(" ");

        // StringBuilder to store the result
        StringBuilder reversedString = new StringBuilder();

        // Loop through each word in the array
        for (String word : words) {
            // Reverse the current word
            String reversedWord = new StringBuilder(word).reverse().toString();

            // Append the reversed word to the result
            reversedString.append(reversedWord).append(" ");
        }

        // Convert StringBuilder to String and trim any extra space at the end
        return reversedString.toString().trim();
    }

    public static void main(String[] args) {
        String originalString = "we are lucky";
        String result = reverseWords(originalString);

        System.out.println("Original String: " + originalString);
        System.out.println("Reversed Words String: " + result);
    }
}
