import java.util.*;
public class question1 {
    public static void main(String[] args) {
         
    Scanner sc = new Scanner(System.in);
   
      System.out.print("which times use Number?");

      int n = sc.nextInt();
         
      int sum = 0;
      
      for (int i = 0; i < n; i++) {
        System.out.println("Enter number" +(i+1) + ": ");
          int a = sc.nextInt();
        sum = sum + a;
      }
         System.out.print("this the some of number: " + sum);
     
    
      
    
    
     
    }
}