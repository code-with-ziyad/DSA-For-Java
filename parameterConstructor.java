class Student{
    String name;
    int age;

Student(String name , int age){
    this.name = name;
    this.age = age; 

}
public void info(){
    System.out.print(this.name + " --> ");
    System.out.print(this.age);

}
}
public class parameterConstructor {
    public static void main(String[] args) {
         Student s1 = new Student("Ziyad Ahmed",20);
         s1.info();
    }
}
