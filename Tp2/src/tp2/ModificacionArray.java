/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2;

/**
 *
 * @author zullo
 */
public class ModificacionArray {
    
    static double[] preciosProductos = {199.99, 299.99, 149.75, 399.00, 89.99};
    
    public static void ejercicio12() {
        // Mostrar precios originales
        System.out.println("Precios originales: ");
        for (int i = 0; i < preciosProductos.length; i++) {
            System.out.println("Precio: " + preciosProductos[i]);
        }
        
        // Modificar valor
        preciosProductos[2] = 129.99;
        
        // Mostrar precios modificados
        System.out.println("Precios modificados: ");
        for (int i = 0; i < preciosProductos.length; i++) {
            System.out.println("Precio: " + preciosProductos[i]);
        }
    }
    
    public static void ejercicio13() {
        // Mostrar precios originales
        System.out.println("Precios originales: ");
        for (double precio : preciosProductos) {
            System.out.println("Precio: " + precio);
        }

        // Modificar valor (acá sí necesitamos índice)
        preciosProductos[2] = 129.99;

        // Mostrar precios modificados
        System.out.println("Precios modificados: ");
        for (double precio : preciosProductos) {
            System.out.println("Precio: " + precio);
        }
    }
}
