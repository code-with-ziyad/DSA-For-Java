
import java.util.Scanner;

public class question5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
   System.out.println("enter your age:");
   int age = sc.nextInt();

   if (age >=18) {
      System.out.println("You can vote:");
   }
   
    else if (age == 17) {
       System.out.println("wait 1 more year:");
   } 
    
   
   else {
    System.out.println("You can Not vote");
   }
           sc.close();
    }
}
