public class Main {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();

        // PersonajesRomanos general1 = new PersonajesRomanos("General 1");
        // PersonajesRomanos emperador1 = new PersonajesRomanos("Emperador 1");
        // PersonajesRomanos soldado1 = new PersonajesRomanos("Soldado 1");

        Thread general2 = new Thread(new General("General 2", buffer));
        Thread emperador2 = new Thread(new Emperador("Emperador 2", buffer));
        Thread soldado2 = new Thread(new Soldado("Soldado 2", buffer));


        general2.start();
        emperador2.start();
        soldado2.start();
    }
}
