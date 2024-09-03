public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 4, 45, 99, 99, 45 };

        int secondlargest = find_second_largest(arr);

        if (secondlargest != Integer.MIN_VALUE) {
            System.out.println("The second largest element is: " + secondlargest);
        } else {
            System.out.println("There is no second largest element.");
        }
    }

    public static int find_second_largest(int[] arr) {
        // Initialize the largest and second largest variables
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MAX_VALUE;

        // Iterate through the array
        for (int num : arr) {

            if (num > largest) {
                secondlargest = largest;
                largest = num;
            } else if (num > secondlargest && num != largest) {
                secondlargest = num;
            }
        }
        return secondlargest;
    }
}
