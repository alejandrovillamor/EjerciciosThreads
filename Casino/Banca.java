import java.util.ArrayList;
import java.util.Random;

public class Banca extends Thread {
    
    private Random numGanadro; 
    private int num;
    private int saldo;
    private ArrayList<Jugador> jugadores;
    private boolean bancarota = false;


    public Banca(int saldo){
        this.saldo = saldo;
        this.jugadores = new ArrayList<>();
        this.numGanadro = new Random();
    }


    public synchronized void resSaldo(int cantidad){
            cantidad = saldo - cantidad;
        
    }
    public synchronized void sumSaldo(int cantidad){
        cantidad = saldo + cantidad;
    }

    public synchronized boolean isBancarota(){
        return  !bancarota;
    }
    public void anadirJugador(Jugador jugador ){
             jugadores.add(jugador);
    }


    @Override
    public void run() {
         

        while(bancarota == false){
            this.num = numGanadro.nextInt(36);
            System.out.println("Empieza el Juego");
             for (Jugador jugar : jugadores){
                 jugar.run();
                 jugar.apostar(num);
             }
             try {
                sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
          }
        
    }
    
}
