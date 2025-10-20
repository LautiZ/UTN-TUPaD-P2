package ej4;


public class Vaca extends Animal {
    private double peso;
    private String foto;
    
    public Vaca(String raza, String tipo, double peso, String foto) {
        super(raza, tipo);
        this.peso = peso;
        this.foto = foto;
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("muuuu");
    }
}
