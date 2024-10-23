public class StringOperations {

    public static void stringOperations(String str1, String str2) {

        String concatenated = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatenated);

        System.out.println("Length of str1: " + str1.length());
        System.out.println("Length of str2: " + str2.length());

        System.out.println("str1 in uppercase: " + str1.toUpperCase());
        System.out.println("str2 in uppercase: " + str2.toUpperCase());

        if (str1.contains(str2)) {
            System.out.println("str1 contains str2");
        } else {
            System.out.println("str1 does not contain str2");
        }

        if (str1.equals(str2)) {
            System.out.println("str1 and str2 are equal");
        } else {
            System.out.println("str1 and str2 are not equal");
        }

        if (str1.length() > 3) {
            System.out.println("Substring of str1 (first 3 characters): " + str1.substring(0, 3));
        } else {
            System.out.println("str1 is too short to extract a substring");
        }
    }

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "World";

        stringOperations(str1, str2);
    }
}
