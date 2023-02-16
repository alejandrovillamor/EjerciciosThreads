public class Filosofo extends Thread{
    private Mesa mesa;
    private int comensal;
    private int indiceComensal;


    public Filosofo(Mesa m, int comensal){
        this.mesa = m;
        this.comensal = comensal;
        this.indiceComensal = comensal - 1;
    }

    @Override
    public void run() {
        while (true) {
            /*¿Tiene aspecto de patrón? */
            this.pensando();
            this.mesa.cogerTenedores(indiceComensal);
            this.comiendo();
            System.out.println("Filosofo->" + comensal
                                + " deja de comer, tenedores libres "
                                + (this.mesa.tenedorIzquierda(this.indiceComensal) + 1)
                                + ", "
                                + (this.mesa.tenedorDerecha(this.indiceComensal) + 1)
                            );
            this.mesa.dejarTenedores(this.indiceComensal);
            int indiceJarra = this.mesa.cogerJarra();
            this.bebiendo();
            this.mesa.dejarJarra(indiceJarra);
            System.out.println("Filosofo->" + comensal
                                + " deja de beber, jarra libre " + (indiceJarra + 1));
        }
    }

    public void comiendo(){
        System.out.println("Filosofo->" + comensal + " comiendo");
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void pensando(){
        System.out.println("Filosofo->" + comensal + " pensando");
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void bebiendo(){
        System.out.println("Filosofo->" + comensal + " bebiendo");
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
