import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
 
     int positiveCount = 0;
     int negativeCount = 0;
     int zeroCount = 0;  

     Scanner sc = new Scanner(System.in);

     char choice;
do {
    System.out.print("Enter a number: ");
    int num = sc.nextInt();

    
       if (num < 0) {
        System.out.println(negativeCount++);
       }
       else if (num == 0) {
        System.out.println(zeroCount++);
       } else {
        System.out.println(positiveCount++);
       }
    System.out.print("Do you want to continue? (y/n): ");
    choice = sc.next().charAt(0);

} while (choice == 'y' || choice == 'Y');

     
      System.out.println("positiveCount "+positiveCount);
      System.out.println("negativeCount "+negativeCount);
      System.out.println("zeros "+zeroCount);
 }
}