package String;

public class CharCountPuzzle {
    public static void main(String[] args) {
        String str = "we are learning java";
        int output = CountCharacter(str, 'a');
        System.out.println("Occurence of e in str is:" + output);
    }

    static int CountCharacter(String input, char ch) {
        int cnt = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ch) {
                cnt++;
            }
        }
        return cnt;
    }
}
