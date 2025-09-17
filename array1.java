public class array1{
    public static void main(String[] args) {
        
     int []marks = {67,54,92,43,32,43,34,8,99,21};

     for (int i = 0; i <marks.length; i++) {
         if(marks[i] < 35){
             System.out.println(i + "-->"+ marks[i]);
         }
     }
   
        }
}