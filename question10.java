
import java.util.Scanner;

public class question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter Number of terms: ");
        int n = sc.nextInt();


        int a = 0, b = 1;
        System.out.println("Fibonacci Series:");

        for (int i = 0; i <= n ; i++) {
         System.out.println(a + " ");
         int next = a + b;
         a = b; 
         b = next;
        }   
    }
}
