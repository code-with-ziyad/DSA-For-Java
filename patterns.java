import java.util.Scanner;

public class patterns {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Input Square Rows: ");
   
  

    int iLimit = sc.nextInt();
        System.out.println("Input Square Colums ");
int jLimit = sc.nextInt();
    for (int i = 0; i <= iLimit; i++) {
   
      
      for (int j = 0; j <= jLimit; j++)
        System.out.print("* ");
      System.out.println();

    
    }
  sc.close();
  }
}
