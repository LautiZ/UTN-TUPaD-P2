package tp2;

import java.util.Scanner;

/**
 *
 * @author Zullo Lautaro
 */
public class Tp2 {
    // Variable global para no declarar input en cada uso.
    final static Scanner input = new Scanner(System.in);
    
    // Ejercicio 11
    final static double DESCUENTO_GLOBAL = 0.20;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ejercicio1();
        ejercicio2();
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio7();

        // Ejercicio 8
        System.out.println("Ingrese el precio base del producto:");
        double precio = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%):");
        int impuesto = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%):");
        int descuento = Integer.parseInt(input.nextLine());
        
        double impuestoDecimal = (double)impuesto / 100;
        double descuentoDecimal = (double)descuento / 100;
        
        double resultado = calcularPrecioFinal(impuestoDecimal, descuentoDecimal, precio);
        
        System.out.println("El precio final del producto es: " + resultado);

        // Ejercicio 9
        System.out.println("Ingrese el precio del producto:");
        double precio9 = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el peso del paquete en kg:");
        double peso = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese la zona de envío (Nacional/Internacional):");
        String zona = input.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precio9, costoEnvio);
        
        System.out.println("El costo de envio es: " + costoEnvio + "\nEl total a pagar es: " + total);

        // Ejercicio 10
        System.out.println("Ingrese el stock actual del producto:");
        int stockActual = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la cantidad vendida:");
        int cantVendida = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese la cantidad recibida:");
        int cantRecibida = Integer.parseInt(input.nextLine());
        
        int nuevoStock = actualizarStock(stockActual, cantVendida, cantRecibida);
        System.out.println("El nuevo stock del producto es: " + nuevoStock);

        // Ejercicio 11
        System.out.println("Ingrese el precio del producto:");
        double precio11 = Double.parseDouble(input.nextLine());
        
        double resultadoEspecial = calcularDescuentoEspecial(precio11);
        System.out.println("El descuento especial aplicado es: " + (Math.round(DESCUENTO_GLOBAL * 100)) + "\nEl precio final con descuento es: " + resultadoEspecial);

        // Ejercicio 12  
        ModificacionArray.ejercicio12();
        
        // Ejercicio 13
        ModificacionArray.ejercicio13();
    }
    
    private static void ejercicio1() {
        System.out.println("Ingrese un anio: ");
        int anio = Integer.parseInt(input.nextLine());
        
        if (((anio % 4 == 0) && !(anio % 100 == 0)) || (anio % 400 == 0)) {
            System.out.println("El anio " + anio + " es bisiesto.");
        } else {
            System.out.println("El anio " + anio + " no es bisiesto.");            
        }        
    }
    
    private static void ejercicio2() {
        System.out.println("Ingrese un numero x1: ");
        int x1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese un numero x2: ");
        int x2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese un numero x3: ");
        int x3 = Integer.parseInt(input.nextLine());
        
        if (x1 > x2 && x1 > x3) {
            System.out.println("El mayor es: " + x1);
        } else if (x2 > x1 && x2 > x3) {
            System.out.println("El mayor es: " + x2);
        } else {
            System.out.println("El mayor es: " + x3);
        }
    }
    
    private static void ejercicio3() {
        System.out.println("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine());
        
        if (edad >= 60) {
            System.out.println("Adulto mayor");
        } else if (edad >= 18) {
            System.out.println("Adulto");
        } else if (edad >= 12) {
            System.out.println("Adolescente");            
        } else {
            System.out.println("Niño");
        }
    }
    
    private static void ejercicio4() {
        System.out.println("Ingrese precio: ");
        double precio = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese categoria (A, B, C): ");
        String categoria = input.nextLine();
        
        double resultado;
        double descuento;
        
        switch (categoria) {
            case "A":
                descuento = 0.10;
                resultado = precio - (precio * descuento);
                break;
            case "B":
                descuento = 0.15;
                resultado = precio - (precio * descuento);
                break;
            case "C":
                descuento = 0.20;
                resultado = precio - (precio * descuento);
                break;    
            default:
                descuento = 0.00;
                resultado = precio;
                System.out.println("Categoria no valida");
                break;
        }
        
        System.out.println("Descuento aplicado: " + (Math.round(descuento * 100)) + "%\nPrecio final: " + resultado);
    }
    
    private static void ejercicio5() {
        System.out.println("Ingrese numero: ");
        int numero = Integer.parseInt(input.nextLine());
        
        int resultado = 0;
        
        while (numero != 0) {
            if (numero % 2 == 0) {
                resultado += numero;
            }
            
            System.out.println("Ingrese otro numero: ");
            numero = Integer.parseInt(input.nextLine());
        }
        
        System.out.println("La suma de los numeros pares es: " + resultado);
    }
    
    private static void ejercicio6() {
        int positivos = 0;
        int negativos = 0;
        int ceros = 0;
        for (int i = 0; i < 10; i++){
            System.out.println("Ingrese numero: ");
            int numero = Integer.parseInt(input.nextLine());
            
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                ceros++;
            }
        }
        
        System.out.println("Resultados:\nPositivos: " + positivos + "\nNegativos: " + negativos + "\nCeros: " + ceros);
    }
    
    private static void ejercicio7() {
        int nota;
        do {    
            System.out.println("Ingrese numero: ");
            nota = Integer.parseInt(input.nextLine());
            if (nota < 0 || nota > 10) {
                System.err.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }
        } while (nota < 0 || nota > 10);
        
        System.out.println("Nota guardada correctamente.");
    }
    
    // Ejercicio 8
    private static double calcularPrecioFinal(
            double impuesto, 
            double descuento, 
            double precioBase
    ) {
        double precioFinal = precioBase + (precioBase * impuesto) - (precioBase * descuento);
        return precioFinal;
    }
    
    // Ejercicio 9
    private static double calcularCostoEnvio(double peso, String zona) {
        String nacional = "Nacional";
        String internacional = "Internacional";
        
        if (nacional.equalsIgnoreCase(zona)) {
            return peso * 5;
        } else if (internacional.equalsIgnoreCase(zona)) {
            return peso * 10;
        } 
        
        return 0.00;
    }
    
    private static double calcularTotalCompra(
            double precioProducto, 
            double costoEnvio
    ) {
        return precioProducto + costoEnvio;
    }
    
    //Ejercicio 10
    private static int actualizarStock(
            int stockActual, 
            int cantidadVendida, 
            int cantidadRecibida
    ) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }
    
    // Ejercicio 11
    private static double calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio - (precio * DESCUENTO_GLOBAL);
        return descuentoAplicado;
    }
}
