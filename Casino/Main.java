public class Main {
    
      public static void main(String[] args) {
         Banca prueba = new Banca(500000);
         Jugador jugador1 = new Jugador("Pepe", 10000, prueba);
         Jugador jugador2 = new Jugador("Paco", 10000, prueba);
         Jugador jugador3 = new Jugador("Pepito", 10000, prueba);
         Jugador jugador4 = new Jugador("Pepo", 10000, prueba);


        prueba.anadirJugador(jugador1);
        prueba.anadirJugador(jugador2);
        prueba.anadirJugador(jugador3);
        prueba.anadirJugador(jugador4);

         prueba.start();
         
     }

}
