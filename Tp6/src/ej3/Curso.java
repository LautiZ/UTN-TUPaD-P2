package ej3;


public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void getProfesor() {
        if (profesor != null) {
            System.out.println("Titular: " + profesor.getId());
        } else {
            System.out.println("No tiene titular");
        }
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
        
        if (profesor != null) {
            profesor.agregarCurso(this);
        }
    }
    
    public void mostrarInfo() {
        System.out.println("Codigo: " + codigo + "\nNombre: " + nombre);
        if (profesor != null) {
            System.out.println("Profesor: " + profesor.getNombre());
        }
    }
}
