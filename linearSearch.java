public class linearseach{
    public static int linearSearch(int[] arr , int  key){
       for(int i = 0;i< arr.length;i++){
            if(arr[i] == key){
                return i;

            }
        }
        return -1;
    }
    public static void main(String[] args){
        
        int arr[] = {3,12,2,22,6,8,5,};
        int key = 22;
        
        int result = linearSearch(arr, key);
        
        
     
        if(result != -1){
            System.out.println("ELEMENT FOUND: " + result);
        }
        else{
             System.out.println("ELEMENT NOT FOUND: ");
        }
    }
}