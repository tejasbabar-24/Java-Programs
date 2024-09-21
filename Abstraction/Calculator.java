interface Cal {
    void Add();
}

public class Calculator implements Cal {

    public void Add() {
        System.out.println("Addition");
    }

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.Add();
    }
}
