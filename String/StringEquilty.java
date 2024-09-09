package String;

public class StringEquilty {
    public static void main(String[] args) {
        // == operator checks memoery address and
        // equals() Method of string checks content

        String s1 = "Sunday";
        String s2 = new String("Sunday");
        String s3 = "Sunday";
        String s4 = new String("Sunday");

        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//true
        System.out.println(s1.equals(s4));//true
        System.out.println(s2.equals(s4));//true

        String s5 = "java";
        String s6 = "JAVA";
        System.out.println(s5 == s6);//false
        System.out.println(s5.equals(s6));//false
        System.out.println(s5.equalsIgnoreCase(s6));//true
    }
}
