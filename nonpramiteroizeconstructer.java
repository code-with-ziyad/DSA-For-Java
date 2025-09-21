    class Empoleye{

       String name;
       int age;
       int sallery;

       public void Empoleyeinfo(){
   System.out.println("Empoleye Name " + name);
     System.out.println("Empoleye age " + age );
       System.out.println("Empoleye sallery " + sallery);

       }

       Empoleye(){
        System.out.println();
       }

}

public class nonpramiteroizeconstructer {
    public static void main(String[] args) {
        
    
    Empoleye e1 = new Empoleye();

      e1.name = "Ziyad";
      e1.age = 20;
      e1.sallery = 50000;

      e1.Empoleyeinfo();
    
    Empoleye e2 = new Empoleye();
      
      e2.name = "Mohsin";
      e2.age = 21;
      e2.sallery = 25000;


      e2.Empoleyeinfo();

       Empoleye e3 = new Empoleye();
      
      e3.name = "Amjad";
      e3.age = 31;
      e3.sallery = 29000;


      e3.Empoleyeinfo();



}
}