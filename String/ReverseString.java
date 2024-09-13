package String;

public class ReverseString {
    public static void main(String[] args) {
        String str = "We are lucky";
        String result = revString(str);
        System.out.println("Reverse String is :" + result);

    }

    public static String revString(String str) {
        char[] chArray = str.toCharArray();
        int start = 0;
        int len = chArray.length - 1;
        while (start < len) {

            char temp = chArray[start];
            chArray[start] = chArray[len];
            chArray[len] = temp;

            start++;
            len--;
        }

        return new String(chArray);
    }

}
