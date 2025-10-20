package ej3;


public abstract class Empleado {
    protected String nombre;
    protected String apellido;
    protected String id;
    
    public Empleado(String nombre, String apellido, String id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }
    
    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public String getId() {
        return id;
    }
    
    public abstract double calcularSueldo();
}
