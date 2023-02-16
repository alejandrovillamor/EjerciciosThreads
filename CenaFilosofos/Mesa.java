public class Mesa{
    private boolean[] tenedores;
    private boolean[] jarras;

    public Mesa(int numTenedores, int numJarras){
        this.tenedores = new boolean[numTenedores];
        this.jarras = new boolean[numJarras];
    }

/*************TENEDORES***********/

    public int tenedorIzquierda(int indiceComensal){
        return indiceComensal;
    }

    public int tenedorDerecha(int indiceComensal){
        if (indiceComensal == 0) {
            return this.tenedores.length -1;
        }else{
            return indiceComensal-1;
        }
    }

    public synchronized void cogerTenedores(int comensal){
        boolean izquierda = tenedores[tenedorIzquierda(comensal)];
        boolean derecha = tenedores[tenedorDerecha(comensal)];
        //TENEDORES OCUPADOS
        while (izquierda || derecha) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //TENEDORES LIBRES
        tenedores[tenedorIzquierda(comensal)] = true;
        tenedores[tenedorDerecha(comensal)] = true;
    }

    public synchronized void dejarTenedores(int comensal){
        tenedores[tenedorIzquierda(comensal)] = false;
        tenedores[tenedorDerecha(comensal)] = false;
        notifyAll();
    }

    /*************JARRAS***********/

    public int jarra1(){
        return 0;
    }

    public int jarra2(){
        return 1;
    }

    public synchronized int cogerJarra(){
        boolean jarra1 = jarras[jarra1()];//En lugar de jarra1(), se puede poner 0 y te ahorras el public int jarra1()
        boolean jarra2 = jarras[jarra2()];//En lugar de jarra2(), se puede poner 1 y te ahorras el public int jarra2()
        //JARRAS OCUPADAS
        while (jarra1 && jarra2) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //COMPRUEBO QUE JARRA ESTÁ LIBRE
        if(!jarra1){
            jarras[jarra1()] = true;
            return jarra1();
        }else{
            jarras[jarra2()] = true;
            return jarra2();
        }
    }

    public synchronized void dejarJarra(int indiceJarra){
        jarras[indiceJarra] = false;
        notifyAll();
    }
}