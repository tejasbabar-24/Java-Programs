public class IBlockPuzzle1 {

    IBlockPuzzle1() {
        System.out.println("2");
    }

    {
        System.out.println("1");
    }
    static {
        System.out.println("8");
    }

    public static void main(String[] args) {
        new P();
    }
}

class P {
    static {
        System.out.println("3");
        System.out.println("4");
        Q objQ = new Q();
    }
    {
        System.out.println("5");
        new IBlockPuzzle1();
    }

}

class Q {
    Q() {
        System.out.println("7");
    }

    static {
        System.out.println("6");
    }
}

class R {
    static {
        System.out.println("9");
    }
}