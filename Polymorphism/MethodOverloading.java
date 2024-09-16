public class MethodOverloading {
    public static void main(String args){
        System.out.println("Hello");
    }

    public static void main(int args)
    {
        System.out.println("Hi");
    }
    public static void main(String[] args) {
        main(args.length);
        main(args[0]);
    }
}