
public class Roma implements Runnable {
    private String nombre;
    private Buffer buffer;

   

    public Roma(String nombre, Buffer buffer) {
        this.nombre = nombre;
        this.buffer = buffer;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public void run() {
        buffer.enviar(nombre);;
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        buffer.recibir(nombre);
        
    }
     

    
}
