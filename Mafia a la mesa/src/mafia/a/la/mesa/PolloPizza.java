/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mafia.a.la.mesa;

/**
 *
 * @author S2-PC105
 */
public class PolloPizza  extends PizzaBuilder {
     private String masa = "Fina";
    private String relleno = "pollo";
    private String salsa = "pollo";

    
    @Override
    public void crearMasa() {
         super.pizza.setMasa(masa);
    }

    @Override
    public void crearSalsa() {
        super.pizza.setSalsa(salsa);
    }

    @Override
    public void crearRelleno() {
        super.pizza.setRelleno(relleno);
    }
    
}
