public class MethodOverloading1 {

    public int Add(int x, int y) {
        int sum = x + y;
        return sum;
    }

    public float Add(int a, int b, float c) {
        float sum = a + b + c;
        return sum;
    }

    public float Add(float a, float b) {
        float sum = a + b;
        return sum;
    }

    public static void main(String[] args) {

        MethodOverloading1 obj = new MethodOverloading1();
        System.out.println(obj.Add(12, 110, 5));
        MethodOverloading1 obj1 = new MethodOverloading1();
        System.out.println(obj1.Add(12, 8));
    }
}
