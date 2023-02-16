import java.util.ArrayList;

public abstract class Avion{

    private ArrayList<IAvion> observadores = new ArrayList<IAvion>();

    // ---------------------------------

    public Avion() {
    }

    // ---------------------------------

    public void agregarObservador(IAvion o)
    {
        observadores.add(o);
        // Según nuestro ejemplo, cada vez que se agregue un nuevo observador, los existentes serán notificados
    }

    // ---------------------------------

    public void eliminarObservador(IAvion o) {
        observadores.remove(o);
    }

    // ---------------------------------

    public void desplazaminetoDerecha(){
        System.out.println("Lider Tira para a la derecha");
          for (IAvion obj : observadores) {
            obj.desplazaminetoDerecha();;
        }
    }
    public void desplazamientoIzquierda(){
        System.out.println("Lider Tira para a la derecha");
          for (IAvion obj : observadores) {
            obj.desplazamientoIzquierda();;
        }
    }
}