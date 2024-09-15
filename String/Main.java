// public class  {
    import java.util.Arrays;

    public class ArrayofString{
    
        // Function to sort the array based on the length of strings
        public static void sort(String[] arr, int size) {
            for (int step = 0; step < size - 1; step++) {
                for (int i = 0; i < size - step - 1; i++) {
                    if (arr[i].length() > arr[i + 1].length()) {
                        // Swap the strings if they are out of order
                        String temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
            }
        }
    
        // Function to print the array
        public static void print(String[] arr, int size) {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + ", ");
            }
            System.out.println(); // To move to the next line after printing the array
        }
    
        public static void main(String[] args) {
            String[] arr = {"ram", "a", "ab"};
            int size = arr.length;
    
            sort(arr, size);
            print(arr, size);
        }
    }
    