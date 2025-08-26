package gallinas;

/**
 *
 * @author zullo
 */
public class Gallinas {
    int _idGallina;
    int _edad;
    int _huevosPuestos;

    public Gallinas(int idGallina, int edad, int huevosPuestos) {
        this._idGallina = idGallina;
        this._edad = edad;
        this._huevosPuestos = huevosPuestos;
    }
    
    public String ponerHuevo() {
        this._huevosPuestos ++;
        return "Se suma un huevo a la gallina " + this._idGallina + " con un total de " + this._huevosPuestos + " huevos puestos.";
    }
    
    public String envejecer() {
        this._edad ++;
        return "Un año para la gallina: " + this._idGallina + ", ahora tiene " + this._edad + " años";
    }
    
    public String mostrarEstado() {
         return this._idGallina + " " + this._edad + " " + this._huevosPuestos;
    }
}
