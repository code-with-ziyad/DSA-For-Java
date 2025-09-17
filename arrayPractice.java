import java.util.*;
public class arrayPractice{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      System.out.println("Array ka size dalain:");
        int size = sc.nextInt();
        int [] numbers = new int[size];


        for (int i = 0; i < size; i++) {
            System.out.println("Enter the " + i + " index Array:");
            numbers[i] = sc.nextInt();
        }

        System.out.println("This the values of arrays: ");
 for (int i = 0; i < size; i++) {
     System.out.println(numbers[i]);
 }
   
        }
}