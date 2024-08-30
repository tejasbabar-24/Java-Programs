public class FindMinimumInSet{
    public static void main(String[] args){
        int [] num ={18,8,21,15,12,6,18,37,23};
        System.out.println("minimum number is:"+minNum(num));
    }

    static int minNum(int[]num){
        int min =num[0];
        for(int i =0;i<num.length;i++)
        {
            if (num[i]<min) {
                min = num[i];
            }
        }
        return min;
    }
}