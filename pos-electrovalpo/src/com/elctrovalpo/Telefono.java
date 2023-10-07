package com.elctrovalpo;

/**
 *
 * @author Gabriel
 */
public class Telefono extends Producto{
    private String marca;
    private String modelo;
    
    //Constructor sin parámetros + super
    public Telefono() {
        super();
    }

    //Constructor parámetros solo teléfono
    public Telefono(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //Constructor con parámetros + super
    public Telefono(String nombre, int precioSinIVA, String marca, String modelo) {
        super(nombre, precioSinIVA);
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Telefono{" + super.toString() + "marca=" + marca + ", modelo=" + modelo + '}';
    }

    @Override
    public String descripcionDetallada() {
        String descripcion = "Teléfono: " + super.getNombre() + "\nPrecio sin IVA: $" + super.getPrecioSinIVA() + "\nMarca: " + marca + "\nModelo: " + modelo;
        return descripcion;
    }
    
}
