import java.util.ArrayList;

public class Carrera extends Thread{
    private static int meta = 5000;
    private ArrayList<Corredores> corredores = new ArrayList<Corredores>();

    public Carrera() {
    }

    public static int getMeta() {
        return meta;
    }

    public static void setMeta(int meta) {
        Carrera.meta = meta;
    }

    public ArrayList<Corredores> getCorredores() {
        return corredores;
    }

    public void setCorredores(ArrayList<Corredores> corredores) {
        this.corredores = corredores;
    }

    @Override
    public void run() {
        for (int i = 0; i < corredores.size(); i++) {
            Thread hilo = new Thread(corredores.get(i));
            hilo.start();
        }
    }

}
