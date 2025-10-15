package ej3;

import java.util.ArrayList;
import java.util.List;


public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }

    public List<Curso> getCursos() {
        return cursos;
    }
    
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor profesor: profesores) {
            if (profesor.getId().equals(id)) {
                return profesor;
            }
        }
        return null;
    }
    
    public void agregarProfesor(Profesor p) {
        Profesor profesorExistente = buscarProfesorPorId(p.getId());
        
        if (profesorExistente == null) {
            profesores.add(p);
        }
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
        }
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso cursoExistente = buscarCursoPorCodigo(codigoCurso);
        Profesor profesorExistente = buscarProfesorPorId(idProfesor);
        
        if (cursoExistente != null && profesorExistente != null) {
            cursoExistente.setProfesor(profesorExistente);
        }
    }
    
    public void listarProfesores() {
        System.out.println("Listado de profesores:");
        for (Profesor profesor: profesores) {
            System.out.println(profesor.getId()+ " | " + profesor.getNombre());
        }
    }
    
    public void listarCursos() {
        System.out.println("Listado de cursos:");
        for (Curso curso: cursos) {
            System.out.println(curso.getCodigo() + " | " + curso.getNombre());
        }
    }
    
    public void eliminarCurso(String codigo) {
        Curso cursoExistente = buscarCursoPorCodigo(codigo);
        
        if (cursoExistente != null) {
            cursoExistente.setProfesor(null);
            cursos.removeIf(curso -> curso.getCodigo().equals(codigo));
        }
    }
    
    public void eliminarProfesor(String id) {
        Profesor profesorExistente = buscarProfesorPorId(id);
        
        if (profesorExistente != null) {
            List<Curso> cursosProfesor = new ArrayList<>(profesorExistente.getCursos());
            for (Curso curso : cursosProfesor) {
                profesorExistente.eliminarCurso(curso);
            }
            profesores.removeIf(profesor -> profesor.getId().equals(id));
        }
    }
}
