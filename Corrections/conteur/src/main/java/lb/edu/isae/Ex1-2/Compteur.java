/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lb.edu.isae;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Lea
 */
public class Compteur implements Runnable {
    private static int ordre = 1;
    public Compteur(){}
    
    @Override
    public void run () {
        try {
            for (int i=0; i<10; i++){
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }  
        System.out.printf("\nCompteur thread %s a fini de compter jusqu'à 10 en position %d\n", Thread.currentThread().getName(), ordre++); 

    }
    

    
}
