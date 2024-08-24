public class InnerClass {
    public static void main(String[] args) {
      Outer otr = new Outer();
      Outer.Inner otr1 = otr.new Inner();
      System.out.println(otr.x);
      System.out.println(otr1.y);
    }
}

class Outer{
    int x = 10;
    class Inner{
        int y = 20;
    }
}