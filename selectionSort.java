public class selectionSort{
    public static void main(String[] args) {
        
        int []arr = {3,5,7,2,6,1,4};

        for (int i = 0; i < arr.length-1; i++) {
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[smallest] > arr[j] ) {
                    smallest = j;
                }
              
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
             arr[i] = temp;
        
     }
     for (int a : arr) {
         System.out.print(a + " ");
     }
}
}