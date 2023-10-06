package com.elctrovalpo;

/**
 *
 * @author Gabriel
 */
abstract class Producto {
    private String nombre;
    private int precioSinIVA;

    //Constructor sin parámetros
    public Producto() {
    }

    //Constructor con parámetros
    public Producto(String nombre, int precioSinIVA) {
        this.nombre = nombre;
        this.precioSinIVA = precioSinIVA;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioSinIVA() {
        return precioSinIVA;
    }

    public void setPrecioSinIVA(int precioSinIVA) {
        this.precioSinIVA = precioSinIVA;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", precioSinIVA=" + precioSinIVA + '}';
    }

    public abstract String descripcionDetallada ();
    
}
