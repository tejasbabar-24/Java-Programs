public class AlternateCase {
    public static void main(String[] args) {
        String str = "Cavista";
        String result = convertCase(str);
        System.out.println(result);
    }

    public static String convertCase(String str) {
        char[] ch = str.toCharArray();
        StringBuilder strbld = new StringBuilder();

        for (int i = 0; i < ch.length; i++) {
            if (i % 2 == 0) {
                ch[i] = Character.toUpperCase(ch[i]);
            } else {
                ch[i] = Character.toLowerCase(ch[i]);
            }

            strbld.append(ch[i]);
        }

        return strbld.toString();
    }

}
