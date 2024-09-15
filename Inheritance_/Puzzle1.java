class A {
    static {
        System.out.println("A1:static block");
    }

    A() {
        System.out.println("A1:constructor");
    }

    {
        System.out.println("A1:Instance block");
    }
}

class B extends A {
    static {
        System.out.println("B static block");
    }

    {
        System.out.println("b instance block");
    }
}

class C extends B {
    static {
        System.out.println("C Static block executed");
    }

    C() {
        System.out.println("C Constructor");
    }
}

public class Puzzle1 {

    public static void main(String[] args) {
        C obj = new C();

    }
}