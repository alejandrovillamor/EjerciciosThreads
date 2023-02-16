import java.util.ArrayList;

public class Participantes extends Thread{
    private Carrera pista;
    private int distancia;
    private String nombre;
    private ArrayList<Corredor> corredores = new ArrayList<>();

    public Participantes(String nombre) {
        this.distancia = 0;
        this.nombre = nombre;
    }

    
    @Override
    public void run() {
        int random = (int) Math.floor(Math.random() *  (10 + 1));
        System.out.println("El participante " + this.nombre +" Indica que tiene que recorre " + random );
        for(Corredor corredor : corredores ){
            corredor.avanzar(random);
        }
    }

    public int getDistanciaRecorrida() {
        return this.distancia;
    }

    public String getNombre() {
        return nombre;
    }


    public void setPista(Carrera pista) {
        this.pista = pista;
    }

    public void agregarCorredores(Corredor c ){
        corredores.add(c);
    }
    
}