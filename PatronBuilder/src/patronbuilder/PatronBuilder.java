
package patronbuilder;

import patronbuilder.abstract_builder.PizzaBuilder;
import patronbuilder.concrete_builder.HawaiiPizzaBuilder;
import patronbuilder.concrete_builder.PicantePizzaBuilder;
import patronbuilder.director.Cocina;


public class PatronBuilder {

    
    public static void main(String[] args) {
        Cocina cocina = Cocina.getInstance();
        
        PizzaBuilder hawaianPizza = new HawaiiPizzaBuilder();
        PizzaBuilder piacantePizza = new PicantePizzaBuilder();
        
        cocina.serPizzaBuilder(hawaianPizza);
        cocina.construirPizza();
        cocina.serPizzaBuilder(piacantePizza);
        cocina.construirPizza();
        
        
        
    }
    
}
