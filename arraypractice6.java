public class arraypractice6{
    public static void main(String[] args) {

        int arr[] = {32,43,45,546,54,456,56,75};

      int count = 0;
      int x = 74;

      for (int i = 0; i < arr.length; i++) {
          if(arr[i] > x)
          count++;

      }
      System.out.println(count);
    }

}
