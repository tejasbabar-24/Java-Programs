// Polymorphism: Method overloading, Method overring, Runtime Polymorphis

class Fruits {
    static {
        System.out.println("4");
    }

    Fruits() {
        System.out.println("3");
    }
}

class Mango extends Fruits {
    Mango() {
        System.out.println("1");
    }
}

class Banana extends Fruits {
    static {
        System.out.println("5");
    }

    Banana() {
        System.out.println("2");
    }
}

public class Puzzle2 {

    public static void main(String[] args) {
        Banana b1 = new Banana();
    }
}