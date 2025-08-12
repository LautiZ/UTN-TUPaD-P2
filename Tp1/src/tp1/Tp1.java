package tp1;

import java.util.Scanner;


public class Tp1 {
    final static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        ejercicio3();
        ejercicio4();
        ejercicio5();
        ejercicio6();
        ejercicio8();
        ejercicio9();
    }
    
    private static void ejercicio3() {
        String nombre = "Lauti";
        int edad = 23;
        double altura = 1.80;
        boolean estudiante = true;
        
        System.out.println(nombre + " | " + edad + " años " + altura + "m Estudiante: " + estudiante);
    }
    
    private static void ejercicio4() {
        System.out.println("Ingrese su nombre: ");
        String nombre = input.nextLine();
        
        System.out.println("Ingrese su edad: ");
        int edad = Integer.parseInt(input.nextLine());
        
        System.out.println(nombre + ", edad: " + edad);
    }
    
    private static void ejercicio5() {
        System.out.println("Ingrese un numero x1: ");
        int x1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese un numero x2: ");
        int x2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Suma: " + (x1 + x2));
        System.out.println("Resta: " + (x1 - x2));
        System.out.println("Multiplicacion: " + (x1 * x2));
        System.out.println("Division: " + (x1 / x2));
    }
    
    private static void ejercicio6() {
        String nombre = "Juan Perez";
        int edad = 30;
        String direccion = "\"Calle falsa 123\"";
        
        System.out.println("Nombre: " + nombre + "\nEdad: " + edad + "\nDireccion: " + direccion);
    }
    
    private static void ejercicio8() {
        System.out.println("Ingrese un numero x1: ");
        int x1 = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese un numero x2: ");
        int x2 = Integer.parseInt(input.nextLine());
        
        System.out.println("Division enteros: " + (x1 / x2));
        System.out.println("Division con un double: " + ((double)x1 / 0));
    }
    
    private static void ejercicio9() {
        System.out.print("Ingresa tu nombre: "); 
        // String nombre = input.nextInt(); // ERROR 
        String nombre = input.nextLine(); // CORREGIDO
        
        System.out.println("Hola, " + nombre); 
    }
}
