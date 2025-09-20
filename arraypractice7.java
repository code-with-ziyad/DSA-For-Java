public class arraypractice7{
    public static void main(String[] args) {

        int arr[] = {32,43,45,546,54,7,456,3,1000,56,75};
      
        int min = arr[0];
        int max = arr[0];
        double average = 0;
         int sum = 0;
       
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
              sum = sum + arr[i];

              average = (double)  sum /arr.length;
            
        }
        
        
             
           System.out.println("this the minimum value " +min);
           System.out.println("this is the maximum value " +max);

           System.out.println("this the average number of array " + average);
    }

}
