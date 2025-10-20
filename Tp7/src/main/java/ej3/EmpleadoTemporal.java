package ej3;


public class EmpleadoTemporal extends Empleado {
    private double sueldoXhr;
    private int horas;

    public EmpleadoTemporal(String nombre, String apellido, String id, double sueldoXhr, int horas) {
        super(nombre, apellido, id);
        this.sueldoXhr = sueldoXhr;
        this.horas = horas;
    }
    
    @Override
    public double calcularSueldo() {
        return sueldoXhr * horas;
    }
}
