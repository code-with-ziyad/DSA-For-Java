public class pattern11 {
    public static void main(String[] args) {
        
        int n = 4;
        for (int i = n; i>= 1; i--){
        for(int j = 1; j<=i; j++){
            System.out.print(" ");
        }
          int star = 5;
         for(int k = 1; k<= star; k++) {
            System.out.print("*");
             
         }
         System.out.println();
        }
    }
}
