/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadscajeroscompra;

import java.util.HashMap;

/**
 *
 * @author A10-PC105
 */
public class Cliente {
    private String nombre;
    private HashMap <Integer, String> productos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<Integer, String> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<Integer, String> productos) {
        this.productos = productos;
    }
    
    
    
}
