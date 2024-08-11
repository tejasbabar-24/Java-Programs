public class IntegerWrapperClass{
    public static void main(String[] args){
        int i = 20;
      Integer obj = Integer.valueOf(50); // Old way Integer obj = new Integer(50)

        int ans = i + obj;//Auto Boxing
        System.out.println("Addition is :"+ans);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //string to number conversion
        String s = "100";
        int num = Integer.parseInt(s);//"100"=>100 (String to number Conversion)
        System.out.println(num);


        String t = "123";
        int num1 = Integer.parseInt(t);
        System.out.println(num1);

        System.out.println(Integer.toBinaryString(12));
        System.out.println(Integer.toHexString(47));
        System.out.println(Integer.toOctalString(71));
    }
}