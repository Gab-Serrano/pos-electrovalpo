package com.elctrovalpo;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class SistemaPOS {

    ArrayList<Producto> productos = new ArrayList<>();

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
    
    public void buscarProducto(String nombre){
        for (Producto producto : productos) {
            if (nombre.equalsIgnoreCase(producto.getNombre())) {
                System.out.println("Sí está");
                break;
            } else {
                System.out.println("No está");
            }
        }
    }
    
    public final void imprimirBoleta(){
        System.out.println("------------------- Boleta --------------------");
        System.out.println("Fecha de venta: " + LocalDate.now());
        int total = 0;
        
        for (Producto producto : productos) {
            //System.out.println(producto.getNombre() + " - $" + producto.getPrecioSinIVA());
            System.out.println(producto.getNombre() + " - $" + producto.obtenerPrecioConIVA());
            total += producto.obtenerPrecioConIVA();
        }
        
        System.out.println("Total: $" + total);
        System.out.println("-------------------------------------------------");
    }
}
