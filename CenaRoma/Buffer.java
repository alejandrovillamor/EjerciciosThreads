public class Buffer{
    //private boolean dejarCerveza = false;
    private boolean pedirCerveza = true;

    public synchronized void pedirCerveza(String nombrePersonaje){
        while (!pedirCerveza) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(nombrePersonaje + " quiere cerveza");
        //recibirMensaje = true;
        pedirCerveza = false;

        notifyAll();
    }

    public synchronized void dejarCerveza(String nombrePersonaje){
        while (pedirCerveza) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(nombrePersonaje + " dejando cerveza");
        //recibirMensaje = false;
        pedirCerveza = true;

        notifyAll();

    }
}