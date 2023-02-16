

public class Cliente implements Runnable {
    private String nombre;
    private int intentos;
    private Almacen tienda;
    private boolean Comprar;


     


    public Cliente(String nombre, Almacen tienda) {
        this.nombre = nombre;
        this.intentos = 10;
        this.tienda = tienda;
    }





    @Override
    public void run() {
        while(intentos > 0){
            if(tienda.entrar()){
                System.out.println("El Cliente "+ nombre+ " ha entrado en la tienda");
                Comprar = tienda.comprar();
                if(Comprar){
                    System.out.println("El Cliente "+nombre+" ha comparado un Iphone 14");
                }else {
                    System.out.println("El Cliente "+nombre+ " no ha podido comprar un Iphone 14");
                }
                intentos = 0;
                tienda.salir();
            }else{
                intentos = intentos - 1;
                System.out.println("Cliente "+nombre+ " sigue esperando ");
                  try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            

        }
        System.out.println("El Cliente "+nombre+ " se ha ido");
    }

    
}
