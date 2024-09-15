//Constructor Chaining:
// - In case of inheritance, when we create an object of child class 
// then constructors are invoked from top to bottom.

class A1 {
    A1() {
        System.out.println("A1:Constructor");
    }
}

class B1 extends A1 {
    B1() {
        System.out.println("B1:Constructor");
    }
}

public class ConstructorChaining {

    public static void main(String[] args) {
        B1 obj = new B1();
    }
}