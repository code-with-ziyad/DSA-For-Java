interface Animal{
    int eyes = 2;
    void walk();
}
interface Harbivore{    // horse multiple parent ke class ko 1 sath inherit karsakri hai 
    //  
}

class Horse implements Animal, Harbivore{
    public void walk(){
        System.out.println("walk on 4 legs:");
    }
}

public class interfaces{
    public static void main(String[]args){
      
        Horse horse = new Horse();
        horse.walk();
        
        System.out.println("Eyes: " + Animal.eyes);
    }
}