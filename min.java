public  class min{
    public static void main(String[] args) {
        
        int [] arr = {8,54,654,45,5,43,3};

        int min  = arr[0];
        int max  = arr[0];
   

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min ) {
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Minimum value " + min + ":");
          System.out.println("Maximum value " + max + ":");
    
    }
}