import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        

   Scanner sc = new Scanner (System.in);
   System.out.println("enter your first Number:");
    int a = sc.nextInt();
    System.out.println("enter your operater Number:");
    char b = sc.next().charAt(0);
    System.out.println("enter your second Number:");
    int c = sc.nextInt();
    
   switch (b) {
    case '+':
        System.out.println(a+c);
        break;
   case '-':
        System.out.println(a-c);
        break;
        case '/':
        System.out.println(a/c);
        break;
        case '*':
        System.out.println(a*c);
        break;
    default:
    System.out.println(" operater is unvalid!");
        break;
   }
    
    }
}
