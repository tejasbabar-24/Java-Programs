import java.util.Scanner;
public class TempratureConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the temprature in farenhnite :");

        double farenhnite = sc.nextDouble();
        double celcius = (farenhnite -32)* 5/9;

        System.out.println("temprature in celcius is" + celcius);
        sc.close();
    }
}
