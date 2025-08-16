import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("enTER THE First number");
        int a = sc.nextInt();
         System.out.println("enTER THE Second  number");
        int b = sc.nextInt();
    
        if(a>b){
            System.out.println("The Greater Number is " +a);
        }
        else{
            System.out.println("The Greater number is " +b);
        }
    }
}
