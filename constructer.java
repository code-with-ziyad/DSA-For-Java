class Pen{
    String color;
    String type;

 public void write(){
  System.out.println("Write Something: ");
    }

    public void color(){
        System.out.println(this.color);
    }
    public void type(){
        System.out.println(this.type);
    }

    
}
class Students{
    String name; 
    int age; 

    public void student(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class constructer{
    public static void main(String[] args) {
        
        Students s1 = new Students();
         
        s1.name = "Ziyad";
        s1.age = 19;

        s1.student();

        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type = "Ball Pen";

        // Pen pen2 = new Pen();
        // pen2.color = "Black";
        // pen2.type = "Jell Pen";

        // pen1.color();
        // pen1.type();
        // pen1.write();

        //  pen2.color();
        //  pen2.type();
        //  pen2.write();


        

    }
}