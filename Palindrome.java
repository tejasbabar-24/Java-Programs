import java.util.Scanner;

public class Palindrome{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int num = sc.nextInt();
         int sum=0,rev,temp;
         temp=num;
          while(num >0)
          {
            rev = num % 10;
            sum = sum * 10 + rev;
            num = num / 10;
          }
          if(sum==temp){
             System.out.println("Number is Palindrome");
          }
          else{
            System.out.println("Number is not Palindrome");
          }
    }
}