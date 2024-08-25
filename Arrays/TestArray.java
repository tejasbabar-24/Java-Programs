import java.util.Arrays;;

public class TestArray {
    public static void main(String[] args){
        int[] a = new int[5]; //Array Declaration and instantiation
        a[0] = 10;//Initalization
        a[1] = 20;
        a[2] = 30;
        a[3] = 40;
        a[4] = 50;

        //traversing Array using for loop
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }

        //for each loop in java
        for(int data: a){
            System.out.println(data);
        }
    }
}
