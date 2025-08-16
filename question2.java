
import java.util.Scanner;


public class question2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number range: ");

      int a = sc.nextInt();

      for (int i = 0; i <= a; i++) {
          if (i % 2 != 0) {
            System.out.println(i);
          }
        
      }
    }
}
