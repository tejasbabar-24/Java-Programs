public class BlockPuzzle {
    static{
        System.out.println("Static");
    }

    BlockPuzzle(){
        System.out.println("constructor");
    }
}

class BlockPz1{
    {
        System.out.println("BlocckPz1:instance Block");
    }

    BlockPz1(){
        System.out.println("blockpz : constructor");
        BlockPuzzle pzz = new BlockPuzzle();
    }
}

class BlockPz2{
    public static void main(String[] args){
        new BlockPz1();
    }
}