package com.elctrovalpo;

/**
 *
 * @author Gabriel
 */
public class Computador extends Producto{
    
    private String procesador;
    private String tipo;

    //Constructor sin parámetros + super
    public Computador() {
        super();
    }

    //Constructor parámetros solo computador
    public Computador(String procesador, String tipo) {
        this.procesador = procesador;
        this.tipo = tipo;
    }

    //Constructor con parámetros + super
    public Computador(String nombre, int precioSinIVA, String procesador, String tipo ) {
            super(nombre, precioSinIVA);
        this.procesador = procesador;
        this.tipo = tipo;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Computador{" + "procesador=" + procesador + ", tipo=" + tipo + '}';
    }
    
    @Override
    public String descripcionDetallada() {
        String descripcion = "Computador: " + super.getNombre() + "\nPrecio sin IVA: $" + super.getPrecioSinIVA() + "\nProcesador: " + procesador + "\nTipo: " + tipo;
        return descripcion;
    }
    
}
