public class SearchInArray {
    public static void main(String[] args){
        int[] arr ={74,53,59,154,108,21,43,20};
        System.out.println(Search(arr,20));
        System.out.println(Search(arr,75));
    }

    static boolean Search(int[] arr,int n){
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){        return true;
            }
        }
        return false;
    }
}
