
public class AverageofoddNumber {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7 };

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                sum = sum + arr[i];
                count++;
            }
        }

        int average = sum / count;
        System.out.println("Average of odd Numbers is :" + average);
    }

}