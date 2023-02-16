/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mafia.a.la.mesa;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author S2-PC105
 */
public class Cocina implements Runnable {

    private static Cocina cocina;
    private PizzaBuilder pizzabuilder;
    private Factoria factoria = new Factoria();

    public static Cocina getInstacia() {
        if (cocina == null) {
            cocina = new Cocina();
        }
        return cocina;
    }

    public void setPizzabuilder(PizzaBuilder pizzabuilder) {
        this.pizzabuilder = pizzabuilder;
    }

    public void Cocinar() {
        this.pizzabuilder.crearPizza();
        this.pizzabuilder.crearMasa();
        this.pizzabuilder.crearRelleno();
        this.pizzabuilder.crearSalsa();
    }

    public Pizza getPizza() {
        return this.pizzabuilder.getPizza();
    }

    @Override
    public void run() {
        int contador = 0;
        while (contador < 6) {
            int valor = (int) (Math.random() * 4);
            while(valor == 0){
              valor = (int) (Math.random() * 4);
            }
            PizzaBuilder pizza = factoria.getInstancia(valor);
            cocina.setPizzabuilder(pizza);
            Cocinar();
            if (valor == 1) {
                System.out.println("Pizza picante creada");
            } else if (valor == 2) {
                System.out.println("Pizza de pollo creada");
            } else if (valor == 3) {
                System.out.println("Pizza barbacoa creada");
            } else {
                System.out.println("Pizza carbonara creada");
            }
            contador = contador + 1;
        }
        try {
            wait(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Cocina.class.getName()).log(Level.SEVERE, null, ex);
        };
    }
}
