
package patronbuilder.director;

import patronbuilder.abstract_builder.Pizza;
import patronbuilder.abstract_builder.PizzaBuilder;


public class Cocina {
    
    private static Cocina cocina;
    
    public static Cocina getInstance(){
       if(cocina==null){
          cocina = new Cocina();
       }
       return cocina;
    }
    private PizzaBuilder pizzaBuilder;
    
    public void serPizzaBuilder(PizzaBuilder pizzaBuilder){
        this.pizzaBuilder =  pizzaBuilder;
    }
    
    public void construirPizza(){
     this.pizzaBuilder.crearNuevaPizza();
     this.pizzaBuilder.buildMasa();
     this.pizzaBuilder.buildSalsa();
     this.pizzaBuilder.buildRelleno();
    }
    
    public Pizza getPizza(){
      return this.pizzaBuilder.getPizza();
    }
}
