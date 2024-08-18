import java.util.Scanner;
class MultiplicationTable{
    public static void main(String[] args){
        System.out.println("enter number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintTable(n);
    }

    static void PrintTable(int num){
        for(int i = 1; i<=10;i++){
            System.out.println(num + "*" +i+"="+(num*i));
        }
    }
}