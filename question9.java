import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first Number:");
        int a = sc.nextInt();

          System.out.println("Enter your second Number:");
        int b = sc.nextInt();

    int gcd = b;

        for (int i = 1; i <= a && i <= b; i++) {
              if (a % i == 0 && b % i == 0 ) {
                 gcd = i;  
              }
        }
        System.out.println("the Greatest Common Divider of: " + gcd);

    }
}
