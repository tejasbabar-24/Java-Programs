import java.util.Arrays;
//WAP ehich will convert an array with Square of Array Values
public class PassingArraysToFunction {
    public static void main(String[] args){
        int[] arr = {33,3,4,54};
        fun(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void fun(int[] x){
        for(int i=0; i<x.length;i++)
        {
            x[i] = x[i] * x[i];
        }
    }

}
