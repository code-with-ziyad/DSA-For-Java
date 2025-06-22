import java.util.Scanner;
public class conditional{
    public static void main(String[] args) {

        //  if, else
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();

    if(x % 2 == 0){
    System.out.println("Even");
    }
else{
    System.out.println("odd");
}


////////////////////////////////////////////////////////////////////////////////////////////////////
   // SWITCH BREAKE  

  int button = sc.nextInt();
switch (button) {
    case 1: System.out.println("How are you");
    break;
    case 2: System.out.println("kese Ho");
    break;
    case 3: System.out.println("chone");
    break;
    default: System.out.println("Invalid button");
     
}
  }
}
    