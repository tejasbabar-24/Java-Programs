public class SecondLargestElement1 {
    public static void main(String[] args) {
        int[] array = { 12, 23, 89, 20, 90, 99 };
        int secondBiggest = SecondlargestNumber(array);
        System.out.println("The second largest element is: " + secondBiggest);

    }

    public static int SecondlargestNumber(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

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
