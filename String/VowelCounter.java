public class VowelCounter {
    public static void main(String[] args) {
        String str = "my name is tejas babar";
        String vowels = "aeiouAEIOU";
        int vowelcount = 0;

        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                vowelcount++;
            }

        }
        System.out.println("Number of vowels is :" + vowelcount);
    }
}
