public class Puzzle2 {
    public static void main(String[] args) {
        int n = args.length;
        String s = "Exception";
        try {
            System.out.println(12 / n);
            int n1 = Integer.parseInt(args[0]);
            System.out.println(s.charAt(n1));
        } catch (ArrayIndexOutOfBoundsException nfe) {
            System.out.println("AIOOBE");
        } catch (ArithmeticException ae) {
            System.out.println("AE");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Finally");
        }
        System.out.println("End");
    }
}
// a) #java Puzzle2 => AE
// b) #java Puzzle2 4 => 12 p Finally End
// c) #java Puzzle2 1 2 3 => 4 x Finally END    
// d) #javac Puzzle2
// 12
// e) #javac Puzzle2 TEN