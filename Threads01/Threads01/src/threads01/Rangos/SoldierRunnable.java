/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads01.Rangos;

/**
 *
 * @author S1-PC55
 */
public class SoldierRunnable extends Thread{

    public SoldierRunnable() {
    }

    public SoldierRunnable(Runnable r) {
        super(r);
    }

    public SoldierRunnable(ThreadGroup tg, Runnable r) {
        super(tg, r);
    }

    public SoldierRunnable(String string) {
        super(string);
    }

    public SoldierRunnable(ThreadGroup tg, String string) {
        super(tg, string);
    }

    public SoldierRunnable(Runnable r, String string) {
        super(r, string);
    }

    public SoldierRunnable(ThreadGroup tg, Runnable r, String string) {
        super(tg, r, string);
    }

    public SoldierRunnable(ThreadGroup tg, Runnable r, String string, long l) {
        super(tg, r, string, l);
    }

    
    
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i + ": " + Thread.currentThread().getName());
            System.out.println("Termina Thread " + Thread.currentThread().getName());
        }
    }
    
    
}
