class Carrera{
    private Corredor c1;
    private Corredor c2;
    private Corredor c3;
    private Participantes p1;
    private Participantes p2;
    private Participantes p3;
    private int meta;
    public boolean hayGanador = false;

    public Carrera(int meta) {
        this.meta = meta;
    }

    public int getMeta() {
        return meta;
    }

    public void setCorredores(Corredor c1,Corredor c2, Corredor c3) {
        c1.setPista(this);
        c2.setPista(this);
        c3.setPista(this);
       
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        
    }
    public void setParticipantes(Participantes p1,Participantes p2, Participantes p3){
         p1.setPista(this);
         p2.setPista(this);
         p3.setPista(this);

         this.p1 = p1;
         this.p2 = p2;
         this.p3 = p3;
 
    }


    public synchronized void cruzarMeta(Participantes corredor) {
        if(!hayGanador) {
            hayGanador = true;
            System.out.println("Corredor " + corredor.getNombre()+ " es el ganador");
            System.out.println("Carrera finalizada");

        }
    }

}