package ej1;


public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto fotoPasaporte;
    private Titular titular;

    public Pasaporte(String linkImagen) {
        this.fotoPasaporte = new Foto(linkImagen, "4:3");
    }

    public Pasaporte(String numero, String fechaEmision, Foto fotoPasaporte, Titular titular, String linkImagen) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.titular = titular;
        this.fotoPasaporte = new Foto(linkImagen, "4:3");
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Foto getFotoPasaporte() {
        return fotoPasaporte;
    }

    public void setFotoPasaporte(Foto fotoPasaporte) {
        this.fotoPasaporte = fotoPasaporte;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }
    
    
}
