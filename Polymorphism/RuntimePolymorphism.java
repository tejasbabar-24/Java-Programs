class A {
    void f1() {
        System.out.println("A:f1");
    }
}

class B extends A {
    void f1() {
        System.out.println("B:f1");
    }
}

public class RuntimePolymorphism {

    public static void main(String[] args) {
        A obj1 = new A();
        obj1.f1();

        B obj2 = new B();
        obj2.f1();

        A obj3 = new B();
        obj3.f1();

        // op: A:f1 B:f1 B:f1
    }
}