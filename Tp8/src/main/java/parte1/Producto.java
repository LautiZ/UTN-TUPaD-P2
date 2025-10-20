package parte1;

import parte1.interfaces.Pagable;


public class Producto implements Pagable {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    @Override
    public double calcularTotal() {
        return precio;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.printf("Pagado monto: %s", precio);
    }

    @Override
    public void aplicarDescuento(double monto) {
        precio -= monto;
        System.out.printf("Descuento de: %.2f%n \nTotal a pagar: %.2f%n", monto, precio);
    }
    
}
