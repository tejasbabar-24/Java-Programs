public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {3,21,6,8,6,90,100};
        int target =8;
        int index = linear_src(arr, target);

        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        }
        else{
            System.out.println("Element " + target + " not found in the array.");
        }
    }

    public static int linear_src(int[] arr,int target){

        for(int i = 0;i<arr.length;i++)
        {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
