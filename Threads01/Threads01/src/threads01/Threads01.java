package threads01;

import threads01.Rangos.SoldierRunnable;
import threads01.factory.FactoryThreads;

/**
 *
 * @author S1-PC55
 */
public class Threads01 extends Thread{

    public Threads01(String threadName){
        super(threadName);
    }
    
    public static void main(String[] args) {

        SoldierRunnable sR1 = FactoryThreads.getInstance("COMANDANTE");
        SoldierRunnable sR2 = FactoryThreads.getInstance("CENTURION");
        SoldierRunnable sR3 = FactoryThreads.getInstance("SOLDADO");
        sR1.start();
        sR2.start();
        sR3.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + super.getName());
            System.out.println("Termina Thread: " + super.getName());
        }
    }
    
    
}
