
import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        System.out.println("first number");
        int a = sc.nextInt();
        System.out.println("Second number");
        int b = sc.nextInt();
        System.out.println("THIRD number");
        int c = sc.nextInt();
        int sum = a+b+c;
        System.out.println("this is the addition of 3 value:" + sum);

        System.out.println("this is the divition of 3 numbers " + sum/3);

    }
}
