public class WordReverse {
    public static void main(String[] args) {
        String str = "We are learning java";
        String output = reverseword(str);
        System.out.println("Output is :" + output);
    }

    static String reverseword(String str) {
        String[] words = str.split("");
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < words.length - 1; i++) {
            String rev = reverstring(words[i]);
            buffer.append(rev + "");
        }
        return buffer.toString().trim();
    }

    static String reverstring(String str) {
        String output = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            output += str.charAt(i);
        }
        return output;

    }
}
