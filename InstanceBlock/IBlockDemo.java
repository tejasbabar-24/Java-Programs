public class IBlockDemo{
    public static void main(String[] args){
        A obj = new A();        
        A obj1 = new A(1);
    }
}

class A{
    A(){
        System.out.println("Defult Constructor");
    }
    A(int n){
        System.out.println("Parameterized Constructor");
    }
    {
        System.out.println("Instance Block");
    }
}
