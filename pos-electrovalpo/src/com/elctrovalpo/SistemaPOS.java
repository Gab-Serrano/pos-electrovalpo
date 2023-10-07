package com.elctrovalpo;

import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class SistemaPOS {

    private ArrayList<Producto> productos = new ArrayList<>();

    public SistemaPOS() {
        this.productos = productos;
    }

    public boolean agregarProducto(Producto producto) {
        if (productos.add(producto)) {
            return true;
        } else {
            return false;
        }
    }

    public void listarProductos() {
        System.out.println("------ LISTA DE PRODUCTOS ------");
        for (Producto producto : productos) {
            System.out.println(producto.descripcionDetallada());
            System.out.println("----------------------------");
        }
    }
    
    
}
