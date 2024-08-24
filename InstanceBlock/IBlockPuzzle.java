class IBlockPuzzle{
    static{
        System.out.println("1");
    }
    {
        System.out.println("2");
    }
    public static void main(String[] args){
        A1 object = new A1();
        IBlockDemo Obj = new IBlockDemo();
        A1 object1 = new A1();
    }
}

class A1{
    {
      System.out.println("4");
    }
    A1(){
        System.out.println("5");
    }
    static{
        System.out.println("3");
    }
}