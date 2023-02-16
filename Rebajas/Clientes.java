public class Clientes {
    private String Nombre;
    private int intentos;
    
    public Clientes(String nombre) {
        this.Nombre = nombre;
         this.intentos = 10;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    

}
