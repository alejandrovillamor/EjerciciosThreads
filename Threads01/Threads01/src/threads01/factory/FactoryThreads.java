package threads01.factory;

import threads01.Rangos.Centurion;
import threads01.Rangos.Comandante;
import threads01.Rangos.Soldado;
import threads01.Rangos.SoldierRunnable;


public class FactoryThreads {
    
    public static SoldierRunnable getInstance(String rango) {
        SoldierRunnable sR = null;
        switch (rango) {
            case "COMANDANTE":
                sR = new SoldierRunnable(new Comandante(), "COMANDANTE");
                break;
            case "CENTURION":
                sR = new SoldierRunnable(new Centurion(), "CENTURION");
                break;
            case "SOLDADO":
                sR = new SoldierRunnable(new Soldado(), "SOLDADO");
                break;
            default:
                throw new AssertionError();
        }
        return sR;
    }
    
}
