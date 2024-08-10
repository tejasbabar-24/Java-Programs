class A1{
    public static void main(String[] args){
        System.out.println("Hello");
        B1.f1();
        C1 obj = new C1();
        obj.f2();
    }
}

class B1{
    static void f1(){
        System.out.println("Good Morning");
    }
}

class C1{
    public void f2(){
        System.out.println("Have Nice day");
    }
}