class X {
    void f1() {
        System.out.println("X:f1");
    }

    void f2() {
        System.out.println("X:f2");
    }
}

class Y extends X {
    void f2() {
        System.out.println("Y:f2");
    }

    void f3() {
        System.out.println("Y:f3");
    }
}

class Z extends Y {
    void f1() {
        System.out.println("Z:f1");
    }

    void f4() {
        System.out.println("Z:f4");
    }
}

public class RuntimePoly {
    public static void main(String[] args) {
        Y obj = new Z();
        obj.f1();
        obj.f2();
        obj.f3();
        ((Z) obj).f4();// Explicit downcasting

        X obj1 = new Y();
        obj1.f1();
        obj1.f2();
    }

}