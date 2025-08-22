import  java.util.*;
public class question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number counts: ");
        int n = sc.nextInt();

        int sum = 0;
        double average = 0;
       
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Number" +(i +1) + " :");
            int a = sc.nextInt();
            sum = sum + a;
        }
       average = (double) sum/n;
        System.out.print("this is the Avarage of Numbers = ");
        System.out.print(average);

    }
}
