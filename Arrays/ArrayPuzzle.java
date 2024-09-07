public class ArrayPuzzle {
    public static void main(String[] args) {
        int[] arr = { 1, 81, 22, 71, 84, 70 };
        int result = AddMaxOddMaxEven(arr);
        System.out.println("Sum odd Max and Even is :" + result);
    }

    public static int AddMaxOddMaxEven(int[] arr) {
        int max_even = 0;
        int max_odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                if (arr[i] > max_even) {
                    max_even = arr[i];
                }
            } else {
                if (arr[i] > max_odd) {
                    max_odd = arr[i];
                }
            }
        }

        return max_even + max_odd;
    }
}
