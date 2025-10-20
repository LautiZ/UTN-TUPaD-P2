package com.mycompany.tp7;
import ej1.Auto;
import ej2.Circulo;
import ej2.Figura;
import ej2.Rectangulo;
import ej3.Empleado;
import ej3.EmpleadoPlanta;
import ej3.EmpleadoTemporal;
import ej4.Animal;
import ej4.Gato;
import ej4.Perro;
import ej4.Vaca;
import java.util.ArrayList;
import java.util.List;


public class Tp7 {

    public static void main(String[] args) {
        //ej1();
        //ej2();
        //ej3();
        //ej4();
    }
    
    public static void ej1() {
        Auto miAuto = new Auto("Toyota", "Corolla", 4);
        miAuto.mostrarInfo();
    }
    
    public static void ej2() {
        Figura[] figuras = new Figura[3];
        
        figuras[0] = new Circulo("circulo1", 5.0);
        figuras[1] = new Rectangulo("rectangulo1", 4.0, 6.0);
        figuras[2] = new Circulo("circulo2", 3.5);
        
        for (Figura figura : figuras) {
            System.out.println("Area calculada: " + figura.calcularArea());
        }
    }
    
    public static void ej3() {
        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(new EmpleadoPlanta("Juan", "Perez", "E101", 50000, 3));
        listaEmpleados.add(new EmpleadoTemporal("Ana", "Gomez", "E102", 25.50, 160));
        listaEmpleados.add(new EmpleadoPlanta("Carlos", "Ruiz", "E103", 60000, 7));
        listaEmpleados.add(new EmpleadoTemporal("Marta", "López", "E104", 28.00, 180));
        
        for (Empleado empleado : listaEmpleados) {
            double sueldo = empleado.calcularSueldo();
            
            if (empleado instanceof EmpleadoPlanta) {
                System.out.printf("[Asalariado] %s (ID: %s) -> Sueldo: %.2f%n", empleado.getNombreCompleto(), empleado.getId(), sueldo);
            } else if (empleado instanceof EmpleadoTemporal) {
                System.out.printf("[Por Hora] %s (ID: %s) -> Sueldo: %.2f%n", empleado.getNombreCompleto(), empleado.getId(), sueldo);
            }
        }
    }
    
    public static void ej4() {
        List<Animal> listaAnimales = new ArrayList<>();

        // Añadir instancias de las subclases a la lista
        listaAnimales.add(new Perro("Pastor Alemán", "Mamífero", "Bobby"));
        listaAnimales.add(new Gato("Siamés", "Mamífero", "Mishu"));
        listaAnimales.add(new Vaca("Holstein", "Mamífero", 800.0, "vaca.jpg"));

        System.out.println("--- Sonidos de la granja ---");

        // Iterar sobre la lista e invocar el método hacerSonido() polimórficamente
        for (Animal animal : listaAnimales) {
            animal.hacerSonido();
        }
    }
}
