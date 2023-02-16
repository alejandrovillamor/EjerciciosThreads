/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mafia.a.la.mesa;

/**
 *
 * @author Alejandro
 */
public class Factoria {
    public final static int Picante = 1;
    public final static int Pollo = 2;
    public final static int Barbacoa = 3;
    public final static int Carbonara = 4;
    
   
    public PizzaBuilder getInstancia(int valor){
        PizzaBuilder pizza = null;
      switch(valor){
          case Picante:
              PizzaBuilder picantePizza = new PicantePizza();
              pizza = picantePizza;
              break;
          case Pollo:
              PizzaBuilder polloPizza = new PolloPizza();
              pizza = polloPizza;
              break;
          case Barbacoa:
              PizzaBuilder barbacoaPizza = new BarbacoaPizza();
              pizza = barbacoaPizza;
              break;
          case Carbonara:
              PizzaBuilder carbonaraPizza = new CarbonaraPizza();
              pizza = carbonaraPizza;
              break;
      }
    return pizza;
    
    }
}
