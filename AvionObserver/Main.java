public class Main
{
    public static void main(String[] args)
    {
        // Instanciar el objeto que será Observado
        AvionLider objObservado = new AvionLider();
        // Instanciar y registrar un Observador
        AvionPerseguidor objObservadorPepe  = new AvionPerseguidor("Pepe");
        objObservado.agregarObservador(objObservadorPepe);
        // Instanciar y registrar otro Observador
        AvionPerseguidor objObservadorJuan  = new AvionPerseguidor("Juan");
        objObservado.agregarObservador(objObservadorJuan);
        // Instanciar y registrar otro Observador
        AvionPerseguidor objObservadorMarta = new AvionPerseguidor("Marta");
        objObservado.agregarObservador(objObservadorMarta);

        objObservado.girarDerecha();
        objObservado.girarIzquierda();
    }
}