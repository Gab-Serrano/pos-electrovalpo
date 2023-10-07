/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.elctrovalpo;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class TestMenu1 {

    public static void main(String[] args) {

        SistemaPOS pos = new SistemaPOS();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----- MENU -----");
            System.out.println("1. Agregar Telefono");
            System.out.println("2. Agregar Computador");
            System.out.println("3. Listar Productos");
            System.out.println("4. Imprimir Boleta");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el enter

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese nombre: ");
                    String nombreT = scanner.nextLine();
                    System.out.print("Ingrese precio sin IVA: ");
                    double precioT = scanner.nextDouble();
                    System.out.print("Ingrese marca: ");
                    scanner.nextLine();  // Consumir el enter
                    String marcaT = scanner.nextLine();
                    System.out.print("Ingrese modelo: ");
                    String modeloT = scanner.nextLine();
                    pos.agregarProducto(new Telefono(nombreT, (int) precioT, marcaT, modeloT));
                    break;
                case 2:
                    System.out.print("Ingrese nombre: ");
                    String nombreO = scanner.nextLine();
                    System.out.print("Ingrese precio sin IVA: ");
                    double precioO = scanner.nextDouble();
                    System.out.print("Ingrese marca: ");
                    scanner.nextLine();  // Consumir el enter
                    String marcaO = scanner.nextLine();
                    System.out.print("Ingrese tipo (ej. Laptop): ");
                    String tipo = scanner.nextLine();
                    pos.agregarProducto(new Computador(nombreO, (int) precioO, marcaO, tipo));
                    break;
                case 3:
                    pos.listarProductos();
                    break;
                case 4:
                    pos.imprimirBoleta();
                    break;
                case 5:
                    System.out.println("Adiós!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}