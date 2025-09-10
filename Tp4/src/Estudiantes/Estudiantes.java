package Estudiantes;
import java.util.Random;

public class Estudiantes {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;

    public Estudiantes(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Estudiantes(String nombre, String puesto) {
        Random random = new Random();
        id = random.nextInt(10000);
        this.nombre = nombre;
        this.puesto = puesto;
        salario = 1000000.00;
        totalEmpleados++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static String mostrarTotalEmpleados() {
        return "Total empleados: " + totalEmpleados;
    }
    
    public String actualizarSalario(int cantidadFija) {
        salario += cantidadFija;
        return "Se aumento el salario en: " + cantidadFija + " ahora es de: " + salario;
    }
    
    public String actualizarSalario(double porcentaje) {
        salario = salario * ((porcentaje / 100) + 1);
        return "Se aumento el salario en: " + porcentaje + "% ahora es de: " + salario;
    }
    
    @Override
    public String toString() {
        return "id: " + id + "\nnombre: " + nombre + "\npuesto: " + puesto + "\nsalario: " + salario;
    }
}
