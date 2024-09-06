public class ArrayAdddition {
    public static void main(String[] args) {
        int[] arr = { 14, 52, 31, 14, 50, 1, 5 };
        int sum = SumofArrayElement(arr);
        System.out.println("Sum of Array Element is :" + sum);

    }

    public static int SumofArrayElement(int[] arr) {
        int total = 0;

        for (int i = 0; i < arr.length; i++) {

            total = total + arr[i];
        }
        return total;
    }
}
