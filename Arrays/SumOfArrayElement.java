import java.util.Arrays;

public class SumOfArrayElement{
    public static void main(String[] args){
        int [] arr = {10,20,30,40,50};
    // Addition of array elements using java8 aggregate function.
        int sum = Arrays.stream(arr).sum();
        System.out.println("sum using java 8:"+ sum);
 
        int ans = SumOfArray(arr);
    }

    static int SumOfArray(int[]a){
        int sum = 0;
        for(int n:a)
        {
            sum = sum + n;
        }
        return sum;
    }
}