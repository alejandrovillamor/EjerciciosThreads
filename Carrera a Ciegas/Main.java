public class Main {
    public static void main(String[] args) {
        
        Participantes guia1 = new Participantes("Pepa");
        Participantes guia2 = new Participantes("Lola");
        Participantes guia3 = new Participantes("Marta");
        Corredor corredor1 = new Corredor("Pepe");
        Corredor corredor2 = new Corredor("Lolo");
        Corredor corredor3 = new Corredor("Mirto");
        Carrera pista = new Carrera(100);
        pista.setParticipantes(guia1, guia2, guia3);
        pista.setCorredores(corredor1, corredor2, corredor3);
        guia1.agregarCorredores(corredor1);
        guia2.agregarCorredores(corredor2);
        guia3.agregarCorredores(corredor3);

        guia3.start();

        guia1.start();

        guia2.start();
    }
}