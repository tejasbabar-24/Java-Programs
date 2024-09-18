class Animal {

    public void Run() {
        System.out.println("Animal can run");
    }
}

class Horse extends Animal {
    // @Override
    public void Run() {
        System.out.println("Horse is runing");

    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Horse hr = new Horse();
        hr.Run();
        Animal a = new Horse();
        a.Run();
    }
}
