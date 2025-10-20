/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import parte1.Cliente;
import parte1.Estados;
import parte1.Pedido;
import parte1.Producto;

/**
 *
 * @author zullo
 */
public class Tp8 {

    public static void main(String[] args) throws EdadInvalidaException {
        //ejInterfaces();
        ejExcepciones();
    }
    
    public static void ejInterfaces() {
        // 1. Crear productos para el pedido
        Producto producto1 = new Producto("Laptop", 1200.00);
        Producto producto2 = new Producto("Mouse inalámbrico", 25.50);
        Producto producto3 = new Producto("Teclado mecánico", 75.00);

        // 2. Crear una lista de productos para el pedido
        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(producto1);
        listaProductos.add(producto2);
        listaProductos.add(producto3);

        // 3. Crear una instancia de Pedido
        Pedido miPedido = new Pedido("PEDIDO-001", listaProductos);

        // 4. Crear una instancia de Cliente
        Cliente miCliente = new Cliente("Mariaa Lopez", miPedido);

        // 5. Agregar al cliente como observador del pedido
        miPedido.agregarObservador(miCliente);
        
        System.out.println("--- PRUEBA DEL SISTEMA ---");
        System.out.println("Pedido creado para " + miCliente.getNombre() + ".");
        System.out.println("Numero de pedido: " + miPedido.getNumeroPedido());
        
        // 6. Calcular y mostrar el total del pedido
        System.out.printf("Total del pedido sin descuento: %.2f%n", miPedido.calcularTotal());
        System.out.println("------------------------------------");

        // 7. Simular un cambio de estado en el pedido
        miPedido.cambiarEstado(Estados.PAGADO);

        System.out.println("------------------------------------");

        // 8. Aplicar un descuento al pedido
        miPedido.aplicarDescuento(50.00);

        System.out.println("------------------------------------");

        // 9. Eliminar el cliente como observador y cambiar el estado de nuevo (ya no debería notificar)
        System.out.println("Eliminando observador...");
        miPedido.eliminarObservador(miCliente);
        miPedido.cambiarEstado(Estados.NO_PAGADO);
    }
    
    public static void ejExcepciones() throws EdadInvalidaException {
        Scanner input = new Scanner(System.in);
        
        // Ejercicio 1
        try {
            System.out.print("Introduce el primer numero: ");
            int numero1 = Integer.parseInt(input.nextLine());
            System.out.print("Introduce el segundo numero: ");
            int numero2 = Integer.parseInt(input.nextLine());
            
            double division = (double) numero1 / numero2;
            System.out.printf("Resultado de division: %.2f%n\n", division);
        } catch (ArithmeticException e) {
            System.out.println("Dividiste por 0, ocurrio un error.");
        }
        
        // Ejercicio 2
        try {
            System.out.println("Ingrese texto: ");
            String string = input.nextLine();
        
            int numero = Integer.parseInt(string);
            System.out.printf("Numero: %s\n", numero);
        } catch (NumberFormatException e) {
            System.out.println("Error, el string ingresado no es un numero");
        }
        
        // Ejercicio 3
        String rutaArchivo = "mi_archivo2.txt";
        
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            System.out.println("--- Contenido del archivo ---");
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            System.out.println("--- Fin del contenido ---");
            
        } catch (FileNotFoundException e) {
            System.err.println("Error, archivo no encontrado.");
            System.err.println("Mensaje de error: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ocurrio un error al leer el archivo.");
            System.err.println("Mensaje de error: " + e.getMessage());
        }
        
        // Ejercicio 4
        //validarEdad(-1);
        
        // Ejercicio 5
        String rutaArchivo2 = "mi_archivo.txt";
        
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo2))) {
            String linea;
            System.out.println("--- Contenido del archivo ---");
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            System.out.println("--- Fin del contenido ---");                   
        } catch (IOException e) {
            System.err.println("Ocurrio un error al leer el archivo.");
            System.err.println("Mensaje de error: " + e.getMessage());
        }
    }
    
    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0) {
            throw new EdadInvalidaException("La edad no puede ser negativa.");
        }
        if (edad > 120) {
            throw new EdadInvalidaException("La edad no puede ser mayor a 120.");
        }
        System.out.println("Edad validada correctamente: " + edad);
    }
}