
package threads01.factory;

import threads01.SoldierRunnable;


public class FactoryThreads {
    private static final String COMANDANTE = "COMANDANTE";
    private static final String CENTURION = "CENTURION";
    private static final String SOLDADO = "SOLDADO";
    
    public static SoldierRunnable getInstance(){
        SoldierRunnable soldado = new SoldierRunnable();
        switch (soldado) {
            case COMANDANTE:
                
                break;
            case CENTURION:
                
                break;
            case SOLDADO:
                
                break;
            default:
                throw new AssertionError();
        }
        return "";
    }
}
