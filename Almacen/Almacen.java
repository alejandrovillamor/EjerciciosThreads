import java.io.StringReader;

public class Almacen implements Runnable {
    private String producto;
    private int Cliente;
    private int Iphone;
    private boolean tiendaLibre;
    private boolean unidades;
    public Almacen( int clientes) {
        this.producto = "Iphone 14";
        Cliente = clientes;
        Iphone = 100;
        this.tiendaLibre = true;
        this.unidades = true;
    }


    public synchronized boolean comprar(){
        if(Iphone - 1 == 0 ){
            Iphone = 0;
            unidades = false;
            return true;
        }else if(Iphone - 1 > 0 ){
            unidades = true;
            Iphone = Iphone - 1;
            return true;
        } else {
            unidades = false;
            return false;
        }
    }


    public synchronized void salir(){
        tiendaLibre = true;
    }

    public synchronized boolean entrar(){
        if(tiendaLibre){
            tiendaLibre = false;
             return true;
        }else {
            return false;
        }
    }


    @Override
    public void run() {
         for(int i = 0; i < Cliente; i++){
            String cadena;
            String numero = Integer.toString(i);
            cadena = "Cliente nº "+ numero;
            Cliente cliente = new Cliente(cadena, this);
            cliente.run();
              
         }
        
    }

    
}
