import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.print("Characters at even indices: ");

        // Loop through the string and print characters at even indices
        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                System.out.print(input.charAt(i));
            }
        }

        scanner.close();
    }
}
