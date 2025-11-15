import java.util.*;
public class leetcode1 {  
public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
     
    int arr[] = {10,43,65,8,6,4,8,3,7};
    System.out.print("input the target: ");
    int target = sc.nextInt(); 

    for (int i = 0; i < arr.length; i++) {
    int j = i+1;
     if(arr[i]+arr[j] == target){
     System.out.println("[" + i + " " + j + "]");
     }
  }
}
}