package estudiantes;

/**
 *
 * @author zullo
 */
public class Estudiante {
    private String _nombre;
    private String _apellido;
    private String _curso;
    private double _calificacion;
    
    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this._nombre = nombre;
        this._apellido = apellido;
        this._curso = curso;
        this._calificacion = calificacion;
    }
    
    public String mostrarInfo() {
        return this._nombre + " " + this._apellido + ", " + this._curso + " | " + this._calificacion;
    }
    
    private boolean puntosDisponibles(double cantidad) {
        return this._calificacion >= cantidad;
    }
    
    public double bajarCalificacion(double puntos) {
        if (puntosDisponibles(puntos)) {
            this._calificacion -= puntos;
        }
        
        return this._calificacion;
    }
    
    public double subirCalificacion(double puntos) {
        this._calificacion += puntos;
        return this._calificacion;
    }
}
