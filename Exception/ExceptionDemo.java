import java.io.BufferedReader;
import java.io.*;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Enter Name:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        System.out.println("Your Name is :" + name);
    }
}
