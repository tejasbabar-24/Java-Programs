/**
 * Puzzle1
 * // a) #java Puzzle1 b) #java Puzzle1 100 10 c) #java Puzzle1 0 1 d) #java
 * Puzzle1 11 two
 */
public class Puzzle1 {

    public static void main(String[] args) {

        try {
            System.out.println("Try Start");
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            System.out.println(num1 / num2);
            System.out.println(args[num1]);
            System.out.println("try end");
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticExeption");
        } catch (NumberFormatException nfe) {
            System.out.println("NFE");
        } catch (Exception e1) {
            System.out.println("Exception Ocuured");
        } finally {
            System.out.println("finally");
        }
        System.out.println("End");
    }
}