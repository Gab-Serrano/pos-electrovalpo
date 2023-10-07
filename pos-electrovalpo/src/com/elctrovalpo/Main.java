package com.elctrovalpo;

/**
 *
 * @author Gabriel
 */
public class Main {
    public static void main(String[] args) {
        
        Telefono iphone = new Telefono("IPhone X", 890000, "IOS", "X34565");
        Telefono android = new Telefono("Samsung Galaxy 7", 760000, "Android", "F9788");
        Computador computador = new Computador("Asus Air 4", 1200000, "Intel I7", "Notebook");
        
        SistemaPOS sistema = new SistemaPOS();
        
        sistema.agregarProducto(iphone);
        sistema.agregarProducto(android);
        sistema.agregarProducto(computador);
        
        //sistema.listarProductos();
        //sistema.buscarProducto("Samsung Galaxy 7").descripcionDetallada();
        //sistema.buscarProducto("Xiaomi").descripcionDetallada();
    }
}
