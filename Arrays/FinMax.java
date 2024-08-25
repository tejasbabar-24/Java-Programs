public class FinMax {

    public static void main(String[] args){
        int[] arr ={13,17,10,4,78,18,51};
        int max = FindMax(arr);
        System.out.println("Maximum Number is:"+max);
    }
    static int FindMax(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;

    }
}