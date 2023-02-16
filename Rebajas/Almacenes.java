import java.util.ArrayList;

public class Almacenes implements Runnable {
     private int mercancia;
     private Clientes cli;
     private ArrayList<Clientes> clientes = new ArrayList<Clientes>();;
     
     private boolean puedoEntrar = true;

     


    public Almacenes(int mercancia) {
        this.mercancia = mercancia;
        this.clientes = new ArrayList<Clientes>();
    }

    public void agregarCliente(Clientes c){
        clientes.add(c);
    }

    public synchronized void  Entrar(){
        if (this.mercancia != 0 ){
            mercancia = mercancia -1;
            System.out.println("Henorabuena has consegido un movil" );
        }else{
           Irse();
        }
    }
    public synchronized void Irse(){
        System.out.println("El Cliente Se fue con las manos vacias" );
    }

    @Override
    public void run() {
        int intentos = 10;
        while (puedoEntrar && intentos <= 10) {
            Entrar();
            if (puedoEntrar) {
                intentos = cli.getIntentos() - 1;
            } else if (intentos == 0) {
                Irse();
                puedoEntrar = true;
            }else{
               puedoEntrar = true;
            }
        }
    }
    
}
