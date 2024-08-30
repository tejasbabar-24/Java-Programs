public class OddArray{
    public static void main(String[] args) {
        int[] arr = {20, 10, 21, 45, 12, 8, 19, 37, 23};

        System.out.println("Odd numbers in the array:");
        for (int i =0;i<arr.length;i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}