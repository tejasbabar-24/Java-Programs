import java.util.Scanner;

public class Reverse_String{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to Revers");
        String str = sc.nextLine();
        String rev ="";
        int len = str.Length()-1;
        while(len >= 0){
            rev = rev + str[len];
            len--;
        }
        System.out.println("Reverse String is :" + rev);
         
    }
}