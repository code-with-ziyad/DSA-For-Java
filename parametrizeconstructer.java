class Worker{
    String name, department;
    int workerid , sallery;

    // PRAMATERIZE CONSTRUCTER 
    Worker(String n, String d, int id, int sal) {
        name = n; 
         department = d;
         workerid = id; 
         sallery = sal;  
    }
public void workerinfo(){
    System.out.println(name +"\n"+ department +"\n"+ workerid +"\n"+ sallery);
}
 

}

public class parametrizeconstructer {
    public static void main(String[] args) {
        
        Worker w1 = new Worker("Ziyad", "Hr", 1001, 100000);     // code chota or readable hojata hai
        w1.workerinfo();
    }
}
