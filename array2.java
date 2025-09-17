import java.util.*;
public class array2{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 System.out.println("Enter the  size of Array: ");

    int size = sc.nextInt();
    int [] numbers = new  int[size];

         for (int i = 0; i < size; i++) {
            System.out.println("Enter the "+ i + " array Index: ");
             numbers[i] = sc.nextInt();
         }

         int sum  =  0;

         for (int i = 0; i < size; i++) {
             
            sum += numbers[i];
         
         }
    System.out.println(sum);
        

    }
}