package com.elctrovalpo;

/**
 *
 * @author Gabriel
 */
public class Main {
    public static void main(String[] args) {

    Telefono tel1 = new Telefono("IPhone X", 1200000, "IOS", "XFT1234");
    Telefono tel2 = new Telefono("Samsung Galaxy S20", 890000, "Samsung", "SG2345");
    Telefono tel3 = new Telefono("Xiaomi RedMi", 670000, "Xiaomi", "XA65234");
    
    SistemaPOS sistema = new SistemaPOS();
    
    sistema.agregarProducto(tel1);
    sistema.agregarProducto(tel2);
    sistema.agregarProducto(tel3);
    
    Producto prodBuscado = sistema.buscarProducto("IPhone X");
    System.out.println(prodBuscado.descripcionDetallada());
        System.out.println("");
    System.out.println(sistema.buscarProducto("Samsung Galaxy S20").descripcionDetallada()); 
    }
}
