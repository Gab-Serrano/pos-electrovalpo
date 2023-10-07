package com.elctrovalpo;

import java.time.LocalDate;
import javax.swing.JOptionPane;

public class TestMenu2 {

    public static void main(String[] args) {
        SistemaPOS pos = new SistemaPOS();

        while (true) {
            String opcion = JOptionPane.showInputDialog(null,
                    "----- MENU -----\n"
                    + "1. Agregar Telefono\n"
                    + "2. Agregar Ordenador\n"
                    + "3. Listar Productos\n"
                    + "4. Imprimir Boleta\n"
                    + "5. Salir\n"
                    + "Seleccione una opción:");

            switch (opcion) {
                case "1":
                    String nombreT = JOptionPane.showInputDialog("Ingrese nombre:");
                    double precioT = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio sin IVA:"));
                    String marcaT = JOptionPane.showInputDialog("Ingrese marca:");
                    String modeloT = JOptionPane.showInputDialog("Ingrese modelo:");
                    pos.agregarProducto(new Telefono(nombreT, (int) precioT, marcaT, modeloT));
                    break;
                case "2":
                    String nombreO = JOptionPane.showInputDialog("Ingrese nombre:");
                    double precioO = Double.parseDouble(JOptionPane.showInputDialog("Ingrese precio sin IVA:"));
                    String marcaO = JOptionPane.showInputDialog("Ingrese marca:");
                    String tipo = JOptionPane.showInputDialog("Ingrese tipo (ej. Laptop):");
                    pos.agregarProducto(new Computador(nombreO, (int) precioO, marcaO, tipo));
                    break;
                case "3":
                    StringBuilder productos = new StringBuilder("Productos:\n");
                    for (Producto producto : pos.productos) {
                        productos.append(producto.getNombre()).append(" - ").append(producto.descripcionDetallada()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, productos.toString());
                    break;
                case "4":
                    StringBuilder boleta = new StringBuilder("BOLETA\nFecha de venta: " + LocalDate.now() + "\n");
                    double total = 0;
                    for (Producto producto : pos.productos) {
                        boleta.append(producto.getNombre()).append(" - $").append(producto.obtenerPrecioConIVA()).append("\n");
                        total += producto.obtenerPrecioConIVA();
                    }
                    boleta.append("Total: $").append(total);
                    JOptionPane.showMessageDialog(null, boleta.toString());
                    break;
                case "5":
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        }
    }
}
