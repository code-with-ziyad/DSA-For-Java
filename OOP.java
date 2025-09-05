class pen {
    String color;
    String type;

public void write() {
        System.out.println("write Something");
    }
    public void printcolor(){
        System.out.println(this.color+ "\n" +this.type);

    }
}

public class OOP{
    public static void main(String[] args) {
        
        pen pen1 = new pen();
        pen1.type = "gel";
        pen1.color = "blue";

        pen pen2 = new pen();
        pen2.type = "ball";
        pen2.color = "black";

        pen1.printcolor();   // call pen1 properties 
        pen2.printcolor();    // call pen2 properties
    }
}