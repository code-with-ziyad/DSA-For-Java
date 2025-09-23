class Student {
    String name;
    int age;

    // default constructer 

    public void Studentinfo(){
        System.out.println("Name: " + name +"\n" + "Age: " +  age );
    }
}
public class defaultconstructer{
public static void main(String[] args) {
    
    Student s1 = new Student();
    s1.Studentinfo();
}
}