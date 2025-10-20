package ej4;


public class Animal {
    protected String raza;
    protected String tipo;

    public Animal(String raza, String tipo) {
        this.raza = raza;
        this.tipo = tipo;
    }
    
    public void hacerSonido() {
        System.out.println("rawr");
    }
    
    public void describirAnimal() {
        System.out.printf("Raza: %s Tipo %s", raza, tipo);
    }
}
