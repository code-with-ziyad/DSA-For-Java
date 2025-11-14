public class bubbleSort {
public static void main(String[] args) {
    
    String arr[] = {"Ziyad", "Ahmed", "Ali", "Basit", "Imam", "Yaya", "Sagar"};
   
     // bubble sort

     for (int i = 0; i < arr.length-1; i++) {
         for (int j = 0; j < arr.length-i-1; j++) {

            if(arr[j].compareTo(arr[j+1]) >0 ) {
                
            
             String temp = arr[j];
             arr[j] = arr[j+1];
             arr[j+1] = temp;
            }
         }
     }

     for(String a : arr){
        System.out.println(a);
     }

}
}
