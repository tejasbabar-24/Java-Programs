public class wordSequenceReverse {
    public static void main(String[] args) {
        String str = "I am learning java";
        String output = reverseword(str);
        System.out.println("Output is :" + output);
    }

    static String reverseword(String str) {
        String[] words = str.split("");
        StringBuffer sbf = new StringBuffer();
        for (int i = words.length -1; i >= 0; i--) {
            sbf.append(words[i] + " ");
        }
        String output = sbf.toString().trim();
        return output;
    }
}
