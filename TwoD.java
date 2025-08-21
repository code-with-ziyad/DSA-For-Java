import java.util.*;
public class TwoD {
    public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);
  
  System.out.print("enter the rows number: ");
  int rows = sc.nextInt();

   System.out.print("enter the colums number: ");
  int colums = sc.nextInt();
  
  int [][] number = new int[rows][colums];
     int k = 0;


     for(int i = 0; i < rows; i++ ){
        for (int j = 0; j < colums; j++) {
            number[i][j]= k;
            k++;
        }
     }
      for (int i = 0; i < rows; i++) {
          for (int j = 0; j < colums; j++) {
              System.out.print(number[i][j] + " ");
           
          }
          System.out.println();
      }

}

}


