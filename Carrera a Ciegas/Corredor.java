public class Corredor extends Participantes {
    private String nombre;
    private int distancia;
    private Carrera pista;

    public Corredor(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        int random = (int) Math.floor(Math.random() * (1 - (10 + 1)));
        System.out.println("El participante " + super.getNombre() + " Indica que tiene que recorre " + random);
        avanzar(random);
    }

    public void avanzar(int pasos) {
        int contador = 0;
        while (true) {
            if (pista.hayGanador) { // wait() or/and notify()
                break;
            }
            if (contador != 0) {
                int random = (int) Math.floor(Math.random() * (10 + 1));
                System.out.println("El participante " + this.nombre + " Indica que tiene que recorre " + random);
                pasos = random;
            }
            distancia += pasos;
            System.out.println("[" + super.getNombre() + "] Ditancia = " + distancia + " m");
            if (distancia > pista.getMeta()) {
                pista.cruzarMeta(this);
                break;
            }
            try {
                sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            contador = contador + 1;
        }
    }

    public Carrera getPista() {
        return pista;
    }

    public void setPista(Carrera pista) {
        this.pista = pista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
