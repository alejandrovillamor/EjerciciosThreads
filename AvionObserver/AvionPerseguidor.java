public class AvionPerseguidor extends Avion{
    private String nombre;

    // ---------------------------------

    public AvionPerseguidor(String nombre) {
        this.setNombre(nombre);
        System.out.println("Observador [" + this.nombre + "] creado");
    }

    // ---------------------------------

    public String getNombre() {
        return this.nombre;
    }

    // ---------------------------------

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void girarDerecha() {
        System.out.println("Observador [" + this.nombre + "] girando a la derecha");
    }

    @Override
    public void girarIzquierda() {
        System.out.println("Observador [" + this.nombre + "] girando a la izquierda");
    }

}
