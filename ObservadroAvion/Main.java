public class Main {
     public static void main(String[] args) {
          
        AvionLider  Lider = new AvionLider();
        
        Perseguidores perseguidor = new Perseguidores("delta");
        Lider.agregarObservador(perseguidor);
        Perseguidores perseguidor1 = new Perseguidores("delta bravo");
        Lider.agregarObservador(perseguidor1);
        Perseguidores perseguidor2 = new Perseguidores("delta jango");
        Lider.agregarObservador(perseguidor2);
        Perseguidores perseguidor3 = new Perseguidores("delta force");
        Lider.agregarObservador(perseguidor3);
          
        Lider.desplazaminetoDerecha();
        Lider.desplazamientoIzquierda();

    }
}
