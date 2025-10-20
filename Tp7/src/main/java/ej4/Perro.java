package ej4;


public class Perro extends Animal {
    private String nombre;

    public Perro(String raza, String tipo, String nombre) {
        super(raza, tipo);
        this.nombre = nombre;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("waw waw");
    }
    
}
