public  class min_max_avr{
    public static void main(String[] args) {
        
         int  size = 7;
        int [] arr = {8,54,654,45,5,43,3};

        int min  = arr[0];
        int max  = arr[0];
        int sum  = 0;
        double average = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min ) {
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }

         
             sum = sum + arr[i];
        }
    
        
        average = (double) sum/size;

        System.out.println("Minimum value " + min);
          System.out.println("Maximum value " + max);
          System.out.println("Average value " + average);

    
    }
}