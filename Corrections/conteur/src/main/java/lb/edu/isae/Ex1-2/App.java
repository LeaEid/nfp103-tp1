package lb.edu.isae;
import java.util.concurrent.atomic.AtomicInteger;

public class App {
    public static void main( String[] args ){
        System.out.println( "Start Counting!");
        
        Runnable cpt1 = new Compteur();
        Runnable cpt2 = new Compteur(); 
        Runnable cpt3 = new Compteur(); 

        Thread t1= new Thread(cpt1, "cpt1");
        Thread t2= new Thread(cpt2, "cpt2");
        Thread t3= new Thread(cpt3, "cpt3");
        
        t1.start();
        t2.start();
        t3.start();
    }
   
}
