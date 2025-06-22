import java.util.Scanner;

public class input{
    public static void main(String[] args) {

    System.out.print("*\n**\n***\n****\n"); // solve 1 question for println and \n.

    int a = 27;
    int b = 35;

    int sum = a*b;
    System.out.println(sum); // multiply two numbers 

    // solve 2 question for 2nd class
    int x = 10;
    int y = 5;

    int ans = (x*y) / (x-y);
    
    System.out.println(ans);

    //scanner
//    Scanner Anas = new Scanner(System.in);
//    String fullname = Anas.nextLine();
//    System.out.println(fullname);

   //nextint
   //nextfloat
   //nextdouble, etc...
   
    Scanner Numbers = new Scanner(System.in);
    System.out.println("enter your first Number ");
   int number1 = Numbers.nextInt();
       System.out.println("enter your Second Number ");
   int number2 = Numbers.nextInt();
   System.out.println(number1 + number2);

    }
}
