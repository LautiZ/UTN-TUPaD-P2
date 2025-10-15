package ej3;

import java.util.ArrayList;
import java.util.List;


public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Curso> getCursos() {
        return cursos;
    }   
    
    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso curso: cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }
        return null;
    }
    
    public void agregarCurso(Curso c) {
        Curso cursoExistente = buscarCursoPorCodigo(c.getCodigo());
        
        if (cursoExistente == null) {
            cursos.add(c);
            c.setProfesor(this);
        }
    }
    
    public void eliminarCurso(Curso c) {
        Curso cursoExistente = buscarCursoPorCodigo(c.getCodigo());
        
        if (cursoExistente != null) {
            cursos.removeIf(curso -> curso.getCodigo().equals(c.getCodigo()));
            c.setProfesor(null);
        }
    }
    
    public void listarCursos() {
        System.out.println("Listado de cursos:");
        for (Curso curso: cursos) {
            System.out.println(curso.getCodigo() + " | " + curso.getNombre());
        }
    }
    
    public void mostrarInfo() {
        System.out.println("ID: " + id + "\nNombre: " + nombre + "\nEspecialidad: " + especialidad + "\nCantidad cursos: " + cursos.size());
    }
}
