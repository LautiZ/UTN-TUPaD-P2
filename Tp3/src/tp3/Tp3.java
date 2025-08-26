package tp3;

import estudiantes.Estudiante;
import mascotas.Mascota;
import libros.Libro;
import gallinas.Gallinas;

/**
 *
 * @author zullo
 */
public class Tp3 {
    public static void main(String[] args) {
//        ejEstudiantes();
//        ejMascotas();
//        ejLibros();
        ejGallinas();
    }
    
    public static void ejEstudiantes() {
        Estudiante estudiante1 = new Estudiante("Lauti", "Zullo", "9A", 4.5);
        
        System.out.println(estudiante1.mostrarInfo());
        System.out.println(estudiante1.subirCalificacion(5.0));
        System.out.println(estudiante1.bajarCalificacion(1));
        System.out.println(estudiante1.bajarCalificacion(10)); // Prevencion de nro negativo
    }
    
    public static void ejMascotas() {
        Mascota mascota1 = new Mascota("Pipo", "Perro", 3);
        
        System.out.println(mascota1.mostrarInfo());
        System.out.println(mascota1.complirAnios());
        System.out.println(mascota1.complirAnios());
        System.out.println(mascota1.complirAnios());
        System.out.println(mascota1.complirAnios());
    }
    
    public static void ejLibros() {
        Libro libro1 = new Libro("Programacion 1", "Lauti", 2010);
        
        System.out.println(libro1.getAutor());
        System.out.println(libro1.getTitulo());
        System.out.println(libro1.getAnioPublicacion());
//        libro1.setAnioPublicacion(999);
        libro1.setAnioPublicacion(2024);
        System.out.println(libro1.getAnioPublicacion());
    }
    
    public static void ejGallinas() {
        Gallinas gallina1 = new Gallinas(1, 2, 7);
        Gallinas gallina2 = new Gallinas(2, 4, 123);
        
        System.out.println("Gallina 1: " + gallina1.mostrarEstado());
        System.out.println("Gallina 2: " + gallina2.mostrarEstado());
        
        System.out.println(gallina1.ponerHuevo());
        System.out.println(gallina1.ponerHuevo());
        System.out.println(gallina2.ponerHuevo());
        
        System.out.println(gallina1.envejecer());
        System.out.println(gallina2.envejecer());
        
        System.out.println("Gallina 1: " + gallina1.mostrarEstado());
        System.out.println("Gallina 2: " + gallina2.mostrarEstado());
    }
}
