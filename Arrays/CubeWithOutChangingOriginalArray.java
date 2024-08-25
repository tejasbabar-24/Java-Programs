import java.util.Arrays;

public class CubeWithOutChangingOriginalArray {
    public static void main(String[] args){
        int[] arr ={1,2,3,4,5};
        int[] ans = cube(arr);
        System.out.println("Input Array:"+ Arrays.toString(arr) );
        System.out.println("Output Array :" + Arrays.toString(ans));
    }

    static int[] cube(int[] x){
        int[] result = new int[x.length];
        for(int i=0; i<x.length;i++){
            result[i] = x[i] * x[i] * x[i];
        }
        return result;
    }
}
