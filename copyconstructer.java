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

     Worker(Worker w) {
        name = w.name;
        department = w.department;
         workerid = w.workerid; 
         sallery = w.sallery;  

    }

    
public void workerinfo(){
    System.out.println(name +"\n"+ department +"\n"+ workerid +"\n"+ sallery);
    System.out.println();

}
 

}

public class copyconstructer {
    public static void main(String[] args) {
        
        Worker w1 = new Worker("Ziyad", "Hr", 1001, 100000);   
        Worker w2 = new Worker(w1);   //   ksi constructer ko copy karna ho tho os ke leye ye wala constructer use  karna best

        w1.workerinfo();
        w2.workerinfo();
    }
}


