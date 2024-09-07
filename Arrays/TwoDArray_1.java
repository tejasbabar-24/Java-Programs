public class TwoDArray_1 {
    public static void main(String[] args) {

        int[][] arr = new int[3][2];// 3 rows and 2 columns

        arr[0] = new int[] { 1, 2 };
        arr[1] = new int[] { 3, 4 };
        arr[2] = new int[] { 5, 6 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println();
    }
}
