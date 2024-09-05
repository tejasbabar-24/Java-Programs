public class DuplicateElements {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 3, 5, 5, 4, 8 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate Elements is :" + arr[i]);
                }
            }
        }
    }
}
