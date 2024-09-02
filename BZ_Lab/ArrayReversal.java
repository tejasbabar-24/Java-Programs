import java.util.Arrays;

public class ArrayReversal {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 67, 89 };
        System.out.println("Original Array is :" + Arrays.toString(arr));

        reversearray(arr);
        System.out.println("Reverse Array is:" + Arrays.toString(arr));

    }

    public static void reversearray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while ((start < end)) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
    }
}