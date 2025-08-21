import java.util.Scanner;

public  class linearsearch {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print ("input the size of Array: ");
    
    int size = sc.nextInt();

    int [] numbers = new int[size];



     System.out.println("Input the array numbers: ");
    for (int i = 0; i < size; i++) {
      numbers[i] = sc.nextInt();
    }
System.out.println("input the searching Number");
    int x = sc.nextInt();


    for (int i = 0; i < numbers.length; i++) {
       if (numbers[i] == x) {
        System.out.print("The number of x: " + i);
       }
    }

    }
}
