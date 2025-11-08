public class swap {
    public static void main(String[] args) {
        int a = 10; 
        int b = 20;
       // Using a temp variable
       
        int temp = a;
        a = b;
        b = temp;
 
      // Without using a temp variable
        
    //     a = a + b; // b  =  30
    //     b = a - b; // a  =  10
    //     a = a - b; // a  =  20

        System.out.println("a = " + a);
        System.out.println("b = " + b);
   
}
}