package ej4;


public class Gato extends Animal {
    private String nombre;

    public Gato(String raza, String tipo, String nombre) {
        super(raza, tipo);
        this.nombre = nombre;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("miau miau");
    }
}
