package parte1;

import parte1.interfaces.Notificable;


public class Cliente implements Notificable {
    private String nombre;
    private Pedido pedido;

    public Cliente(String nombre, Pedido pedido) {
        this.nombre = nombre;
        this.pedido = pedido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }        

    @Override
    public void recibirNotificacion(String mensaje) {
        System.out.printf("Cliente %s, ha recibido una notificacion.", nombre);
        System.out.println("  -> " + mensaje);
    }
}
