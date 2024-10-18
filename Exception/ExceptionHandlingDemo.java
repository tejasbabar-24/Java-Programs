import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter the first Number:");
            int num1 = sc.nextInt();

            System.out.println("Enter Second The Number:");
            int num2 = sc.nextInt();

            int result = num1 / num2;
            System.out.println("Result " + result);
        } catch (ArithmeticException ae) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("Error: Invalid input. Please enter valid integers.");
        } finally {
            System.out.println("Program execution completed.");
            sc.close();
        }
    }
}
