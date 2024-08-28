import java.lang.reflect.Array;
import java.util.Arrays;

public class Binary_Search {
    public static void main(String[] args){
        int[] arr ={22,1,7,18,81,70,29,33,47,100,59};
        Arrays.sort(arr);
        for(int i=1;i<=100;i++)
        {
            if(binarySearch(arr, i)){
                System.out.println(i+"found");
            }
        }
    }
    static boolean binarySearch(int[] arr,int n){
        int start =0;
        int end = arr.length-1;
        int mid =(start +end)/2;

        while (start<=end) {
            if(n==arr[mid])
            return true;

            if(n>arr[mid]){
                start = mid +1;
            }
            else{
                end = mid -1;
            }
            mid = (start+end)/2;
            
        }
        return false;
    }
}
