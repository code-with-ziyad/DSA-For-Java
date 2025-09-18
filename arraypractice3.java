import java.util.*;
public class arraypractice3{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 System.out.println("Enter the  size of Array: ");

    int size = sc.nextInt();
    int [] numbers = new  int[size];

         for (int i = 0; i < size; i++) {
            System.out.println("Enter the "+ i + " array Index: ");
             numbers[i] = sc.nextInt();
         }
   
    int find = 19;

    boolean flag = false;
   
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == find) {
              System.out.println(find +" found index " + i);
           flag = true;
      break;
        }
      
    }

    if(flag == false)
    
        System.out.println("element not found ");
    }

}
