import java.util.*;
class Student{
    String name;
    int [] marks;
    int total;

Student(String name, int [] marks){
        this.name = name;
        this.marks = marks;
         calculateTotal();
  }
  public void calculateTotal(){
     total = 0;
     for (int m : marks) { 
        total += m;   
     }
  }
    
public void calculateTotal(int bonus){
     total = 0;
     for (int m : marks) { 
        total += m;   
        total += bonus; 
     }
    }
  void display(){
            System.out.println("Name: "+ name + ":, Total Mark: " + total);
        }
    
}


public class midtopic {
    public static void main(String[] args){

     Scanner sc = new Scanner(System.in);
     
    System.out.print("Enter Number of Student: ");
    int n = sc.nextInt();
    sc.nextLine();

    Student[] students = new Student[n];

    for(int i = 0; i < n; i++){
      System.out.print("Enter Name: ");
        String name = sc.nextLine();
       
           int[] marks = new int[3];
    for(int j = 0; j< 3; j++){
    System.out.print("Enter Mark" + (j+1) + ":");
        marks[j] = sc.nextInt();
    }
      sc.nextLine();

     students[i] = new Student(name, marks);

    }

  
     System.out.println("\n=====Students Result=====");

    for(Student s : students){
        s.display();
     
    }


    }
}
