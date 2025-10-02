import java.util.*;
class Calculator{
    int num1, num2;

    Calculator(int a, int b){
        num1 = a;
        num2 = b; 
    }
  int add(){
      return  num1 + num2;
  }
  int sub(){
    return num1 - num2;

  }
  int multiply(){
    return  num1 * num2;

  }
  double divide(){
    return  num1 / num2;

  }

}

public  class oopcalculator{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

       System.out.println("Enter your first number: ");
       int num1 = sc.nextInt();

       System.out.println("Enter your second number: ");
       int num2 = sc.nextInt();

       System.out.println("Enter the operator");
       Calculator calc =  new Calculator(num1, num2);
       char opr = sc.next().charAt(0);

       switch (opr) {
           case '+':
               System.out.println("Result = " + calc.add());
               break;
                   case '-':
               System.out.println("Result = " + calc.sub());
               break;
                   case '*':
               System.out.println("Result = " + calc.multiply());
               break;
                   case '/':
               System.out.println("Result = " + calc.divide());
               break;
           default:
           System.out.println("invalid Operator");
              
       }
    
    }
}