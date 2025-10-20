package parte1;

import java.util.ArrayList;
import parte1.interfaces.Pagable;
import java.util.List;
import parte1.interfaces.Notificable;


public class Pedido implements Pagable {
    private String numeroPedido;
    private List<Producto> productos;
    private Estados estado;
    private List<Notificable> observadores = new ArrayList<>();

    public Pedido(String numeroPedido, List<Producto> productos) {
        this.numeroPedido = numeroPedido;
        this.productos = productos;
        estado = Estados.NO_PAGADO;
    }
    
    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }

    @Override
    public void procesarPago(double monto) {
        estado = Estados.PAGADO;
        System.out.printf("Pagado!");
    }

    @Override
    public void aplicarDescuento(double monto) {
        double total = calcularTotal();
        total -= monto;
        System.out.printf("Descuento de: %.2f%n \nTotal a pagar: %.2f%n", monto, total);
    }
    
    public void agregarObservador(Notificable observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Notificable observador) {
        observadores.remove(observador);
    }

    private void notificarObservadores() {
        String mensaje = String.format("El estado del pedido %s ha cambiado a %s.", numeroPedido, estado);
        for (Notificable observador : observadores) {
            observador.recibirNotificacion(mensaje);
        }
    }

    // Método que cambia el estado y notifica a los observadores
    public void cambiarEstado(Estados nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.printf("El pedido %s ha cambiado de estado. Notificando a los clientes...%n", numeroPedido);
        notificarObservadores();
    }
    
    public String getNumeroPedido() {
        return numeroPedido;
    }
    
}
