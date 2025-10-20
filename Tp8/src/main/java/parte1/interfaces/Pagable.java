package parte1.interfaces;


public interface Pagable extends Pago, PagoConDescuento {
    public double calcularTotal();
}
