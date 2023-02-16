import java.util.ArrayList;

public abstract class Avion implements IAcciones {
    private ArrayList<IAcciones> observadores = new ArrayList<IAcciones>();

    // ---------------------------------

    public Avion() {
    }

    // ---------------------------------

    public void agregarObservador(IAcciones o){
        observadores.add(o);
        // Según nuestro ejemplo, cada vez que se agregue un nuevo observador, los existentes serán notificados
        System.out.println("Avión agregado al array");
    }

    // ---------------------------------

    public void eliminarObservador(IAcciones o) {
        observadores.remove(o);
    }

    // ---------------------------------
    @Override
    public void girarIzquierda(){
        System.out.println("Avion lider girando a la izquierda");
        // Enviar la notificación a cada observador a través de su propio método
        for (IAcciones obj : observadores) {//Recorres el array de observadores y les dices que giren a la izquierda
            obj.girarIzquierda();
        }
    }

    @Override
    public void girarDerecha(){
        System.out.println("Avion lider girando a la derecha");
        // Enviar la notificación a cada observador a través de su propio método
        for (IAcciones obj : observadores) {//Recorres el array de observadores y les dices que giren a la derecha
            obj.girarDerecha();
        }
    }
}
