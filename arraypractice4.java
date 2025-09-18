public class arraypractice4{
    public static void main(String[] args) {

        int arr[] = {32,43,45,546,54,456,56,75};

        int max = arr[0];
      for (int i = 0; i < arr.length; i++) {
          if(arr[i] > max) {
            max = arr[i];
          }
      }

      System.out.println(max);

    }

}
