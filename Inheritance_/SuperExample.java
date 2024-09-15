class X {
    int x;

    X() {
        System.out.println("X:Default");
    }

    X(int x) {
        this.x = x;
        System.out.println("X:parameterised");
    }

    void fun() {
        System.out.println("X:fun");
    }
}

class Y extends X {
    int y;

    Y(int x, int y) {
        // super()
        System.out.println("Y:parameterised");
        this.y = y;
    }

    void fun() {
        System.out.println("Y fun");
        super.fun();
    }
}

public class SuperExample {
    public static void main(String[] args) {
        Y obj = new Y(10, 20);
        obj.fun();
    }

}