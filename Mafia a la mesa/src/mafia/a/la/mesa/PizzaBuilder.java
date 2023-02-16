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
public abstract class PizzaBuilder {
    
    protected Pizza pizza;

    public Pizza getPizza() {
        return this.pizza;
    }
    
    public void crearPizza(){
      this.pizza = new Pizza();
    }
            
    public abstract void crearMasa();
    public abstract void crearSalsa();
    public abstract void crearRelleno();
}
