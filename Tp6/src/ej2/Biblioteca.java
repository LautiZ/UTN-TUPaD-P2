package ej2;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    private String nombre;
    private List<Libro> libros = new ArrayList<>();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarLibro(String isbn, String titulo,int anioPublicacion, Autor autor) {
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void listarLibros(){
        for (Libro libro: libros) {
            libro.mostrarInfo();
            System.out.println("--------------------");
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn) {
        Libro libroObtenido = null;
        for (Libro libro: libros) {
            if (libro.getIsbn().equals(isbn)) {
                libroObtenido = libro;
                break;
            }
        }
        
        return libroObtenido;
    }
    
    public void eliminarLibro(String isbn) {
        Libro l = buscarLibroPorIsbn(isbn);
        if (l != null) {
            libros.removeIf(libro -> libro.getIsbn().equals(isbn));
        }
    }
    
    public int obtenerCantidadLibros() {
        return libros.size();
    }
    
    public List<Libro> filtrarLibrosPorAnio(int anio) {
        ArrayList<Libro> filtrados = new ArrayList<>();
        for (Libro libro: libros) {
            if (libro.getAnioPublicacion() == anio) {
                filtrados.add(libro);
            }
        }
        
        return filtrados;
    }
    
    public void mostrarAutoresDisponibles() {
        for (Libro libro: libros) {
            Autor autor = libro.getAutor();
            autor.mostrarInfo();
        }
    }
}
