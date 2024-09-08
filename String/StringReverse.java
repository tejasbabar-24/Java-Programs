package String;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Java Programe";
        String output = reverse(str);
        System.out.println("Reverse String is : " + output);
    }

    static String reverse(String str) {
        char[] arr = str.toCharArray();
        // Reverse array logic
        for (int i=0, j=arr.length-1 ; i < j; i++, j--) {
            //Swap
            char t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
        return new String(arr);
    }
}
