public class Perseguidores implements IAvion {
     private String nombre;

    public Perseguidores(String nombre ){
        this.setNombre(nombre);
        System.out.println("Perseguidor ["+ this.nombre + "] creado");
    }

    public String getNombre(){
         return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    @Override
    public void observadoActualizado() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void desplazamientoIzquierda() {
        System.out.println("Perseguidor [" + this.getNombre() + "] Tira para la izquierda");
        
    }

    @Override
    public void desplazaminetoDerecha() {
        System.out.println("Perseguidor [" + this.getNombre() + "] Tira para la derecha");
        
    }


    
}
