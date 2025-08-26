package mascotas;

/**
 *
 * @author zullo
 */
public class Mascota {
    private String _nombre;
    private String _especie;
    private int _edad;
    
    public Mascota(String nombre, String especie, int edad) {
        this._nombre = nombre;
        this._especie = especie;
        this._edad = edad;
    }
    
    public String mostrarInfo() {
        return this._nombre + " " + this._especie + ", " + this._edad + " años";
    }
    
    public String complirAnios() {
        this._edad ++;
        return "Feliz cumple para: " + this._nombre + ", ahora tiene " + this._edad + " años";
    }
}
