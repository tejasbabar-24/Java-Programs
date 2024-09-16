class A1 {

    public void f1() {
        System.out.println("A1:f1");
    }
}

class B1 extends A1 {
    @Override
    public void f1() {
        System.out.println("B1:f1");
    }
}

public class StaticMethodOverriding {
    public static void main(String[] args) {
        A1 obj = new B1();
        obj.f1();
    }
}