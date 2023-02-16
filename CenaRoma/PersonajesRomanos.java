public abstract class PersonajesRomanos implements Runnable {
    private String nombrePersonaje;
    private Buffer buffer;

    public PersonajesRomanos(String nombrePersonaje, Buffer buffer) {
        this.nombrePersonaje = nombrePersonaje;
        this.buffer = buffer;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }


    @Override
    public void run() {
        buffer.pedirCerveza(nombrePersonaje);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        buffer.dejarCerveza(nombrePersonaje);

    }

}
