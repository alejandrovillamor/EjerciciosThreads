import java.util.Random;

import javax.lang.model.util.ElementScanner14;
import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Jugador extends Thread {
      
        private String nombre;
        private int saldo;
        private Random numero;
        private Banca casino;

        public Jugador (String nombre, int saldo, Banca casino){
              this.nombre = nombre;
              this.saldo = saldo;
              this.numero = new Random();
              this.casino = casino;
        }

        private void resSaldo(int cantidad){
            if (saldo == 0){
                System.out.println(this.nombre+ " esta en banca rota");
               } 
               saldo -=  cantidad;
        }
        private synchronized void sumSaldo(int cantidad){

            saldo +=  cantidad;
        }

        private int numwin(){
            int win = 0;
            while(win == 0){
            win = numero.nextInt(36);
            }
            return win;
        }


        public void apostar(int numGanador){
            System.out.println("El numero ganador ha sido el: "+ numGanador );
           if (numwin() == numGanador ){
            System.out.println("El numero que ha elegido "+ this.nombre +" es: " + numwin() );
             resSaldo(10);
             sumSaldo(360);
             casino.resSaldo(360);
             casino.sumSaldo(10);
             System.out.println("Henorabuena has Ganado");
           }else if(numGanador == 0){
            System.out.println("Lo siento has perdido");
            resSaldo(10);
            casino.sumSaldo(10);
           }else{
               casino.sumSaldo(10);
               resSaldo(10);
               System.out.println("El numero que elegio "+ nombre +" es el: " + numwin());
           }
           System.out.println("El jugador " + nombre + "tiene de saldo "+saldo );

        }


    @Override
    public void run() {
        int num;
         num = numwin();
         
       
    }
    
}
