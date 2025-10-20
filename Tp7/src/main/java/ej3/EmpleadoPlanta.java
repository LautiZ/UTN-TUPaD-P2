package ej3;


public class EmpleadoPlanta extends Empleado {
    private double sueldo;
    private int antiguedad;

    public EmpleadoPlanta(String nombre, String apellido, String id, double sueldoXhr, int antiguedad) {
        super(nombre, apellido, id);
        this.sueldo = sueldoXhr;
        this.antiguedad = antiguedad;
    }
    
    @Override
    public double calcularSueldo() {
        return sueldo * antiguedad;
    }
}
