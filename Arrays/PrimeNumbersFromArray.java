import java.util.ArrayList;

public class PrimeNumbersFromArray {
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than 2 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible by any number other than 1 and itself, not prime
            }
        }
        return true; // Prime number
    }

    public static void main(String[] args) {
        // Original array containing duplicate and distinct numbers
        int[] numbers = { 11, 13, 17, 4, 5, 6, 13, 8, 17, 19, 23, 5 };

        // Using ArrayList to store prime numbers
        ArrayList<Integer> primeNumbers = new ArrayList<>();

        // Checking each number if it's prime
        for (int number : numbers) {
            if (isPrime(number)) { // If the number is prime
                if (!primeNumbers.contains(number)) { // Avoid duplicate prime numbers
                    primeNumbers.add(number); // Add to the prime numbers list
                }
            }
        }

        // Converting ArrayList to array for the final result
        int[] primeArray = primeNumbers.stream().mapToInt(Integer::intValue).toArray();

        // Displaying the prime numbers
        System.out.println("Prime numbers in the array:");
        for (int prime : primeArray) {
            System.out.print(prime + " ");
        }
    }
}
