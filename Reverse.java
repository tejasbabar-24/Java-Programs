import java.util.Scanner;

public class Reverse{
    public static void  main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Number");
        int num = sc.nextInt();
        int rev=0, rem=0;
        while(num > 0)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("Reverse of number is "+ rev);

    }
}