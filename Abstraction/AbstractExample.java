abstract class A {
    A() {
        System.out.println("A:Constructor");
    }

    abstract void greeting();
}

public class AbstractExample extends A {
    void greeting() {
        System.out.println("Hello, Have Nice Day");
    }

    public static void main(String[] args) {
        A obj = new AbstractExample();
        obj.greeting();
    }
}
