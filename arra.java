public class arra {
    public static void main(String[] args) {

     int [] size =  new int[5];
    size[0] = 10;
    size[1] = 15;
    size[2] = 20;
    size[3] = 30;
    size[4] = 40;
    // size[5] = 50;    array reached the size then  show the run time error

     for(int b : size) {
         System.out.print(b + " ");
     }
    }
}
