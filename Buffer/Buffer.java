public class Buffer {

    private boolean recibirCerveza = false;
    private boolean enviarCerveza = true;

    public synchronized void enviar(String nombre){
           while(!enviarCerveza  && recibirCerveza ){
              try {
                wait();// uno de los personajes de roma esta reciviendo cerveza
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                System.out.println(e);
                e.printStackTrace();
            }
           }
           //Si pude enviar 
           recibirCerveza = true;
           enviarCerveza = false;
           System.out.println(nombre + "Toma cerveza");
           notifyAll();
    }
    public synchronized void recibir(String nombre){
        while(!recibirCerveza && enviarCerveza){
           try {
            wait();
        } catch (InterruptedException e) {
            System.out.println(e);
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
          recibirCerveza = false;
           enviarCerveza = true;
           
           System.out.println(nombre + "Dejar cerveza");
           notifyAll();

    }
}
