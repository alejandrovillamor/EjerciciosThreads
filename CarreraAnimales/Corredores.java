public class Corredores implements Runnable{
    private String nombre;
    private int numPasos;

    public Corredores(String nombre){
        this.nombre = nombre;
        this.numPasos =  (int)Math.random() *(10-1);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPasos() {
        return numPasos;
    }

    public void setNumPasos(int numPasos) {
        this.numPasos = numPasos;
    }

    @Override
    public void run() {
        
    }

}
