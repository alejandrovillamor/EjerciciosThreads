public class Main {
     

     public static void main(String[] args) {
        Buffer pepe = new Buffer();
        Thread emperador = new Thread(new Emperador("Emperador", pepe));
        Thread general = new Thread(new General("General", pepe));
        Thread soldado = new Thread(new Soldado("Soldado", pepe));

        emperador.start();
        general.start();
        soldado.start();
     }

}
