package libros;

/**
 *
 * @author zullo
 */
public class Libro {
    private String _titulo;
    private String _autor;
    private int _anioPublicacion;
    
    public Libro(String titulo, String autor, int anioPulicacion) {
        this._titulo = titulo;
        this._autor = autor;
        this._anioPublicacion = anioPulicacion;
    }

    public String getTitulo() {
        return this._titulo;
    }

    public String getAutor() {
        return this._autor;
    }

    public int getAnioPublicacion() {
        return this._anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 1000 && anioPublicacion < 2025) {
            this._anioPublicacion = anioPublicacion;            
        }
    }
    
    
}
