public class arrays {

    public static void main(String[] args) {
        
    int marks [] = new int [6];
      marks [0] = 60;
      marks [1] = 50;
      marks [2] = 70;
      marks [3] = 65;
      marks [4] = 68;
      marks [5] = 90;
      
       int sum = 0;
      for (int i = 0; i<= 5; i++) {
        System.out.println(marks[i]);
           
      }
      for (int i = 0; i < 6; i++) {
          sum = sum + marks[i];
      }
      System.out.println();
      System.out.println("total marks = " + sum);
         System.out.println();
    }
}