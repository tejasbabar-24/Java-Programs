import java.util.Scanner;

public class MiscellaneousProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Greeting message
        System.out.println("Welcome to the Miscellaneous Java Program!");

        // 2. Checking if a number is even or odd
        System.out.print("Enter a number to check if it's even or odd: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // 3. Simple Calculator
        System.out.print("\nEnter two numbers for basic calculations:\nNumber 1: ");
        double num1 = scanner.nextDouble();
        System.out.print("Number 2: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("Select operation: +, -, *, /");
        char operation = scanner.next().charAt(0);
        
        double result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
                break;
        }
        
        if (operation == '+' || operation == '-' || operation == '*' || operation == '/') {
            System.out.println("Result: " + result);
        }

        // 4. Array operations
        System.out.print("\nEnter the number of elements in the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Sum of array elements
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Sum of array elements: " + sum);

        // Find maximum and minimum
        int max = array[0];
        int min = array[0];
        for (int num : array) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        System.out.println("Maximum: " + max + ", Minimum: " + min);

        scanner.close();
    }
}
