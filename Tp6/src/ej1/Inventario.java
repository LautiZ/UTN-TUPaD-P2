package ej1;
import java.util.ArrayList;


public class Inventario {
    ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public Inventario(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    
    public void agregarProducto(Producto p) {
        productos.add(p);
    }
    
    public void listarProductos() {
        for (Producto producto: productos) {
            producto.mostrarInfo();
        }
    }
    
    public Producto buscarProductoPorId(String id) {
        for (Producto producto: productos) {
            if (producto.getId().equals(id)) {
                return producto;
            }
        }
        return null;
    }
    
    public void eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.removeIf(producto -> producto.getId().equals(id));
        }
    }
    
    public Producto actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
        }
        return p;
    }
    
    public ArrayList<Producto> filtrarPorCategoria(Producto.CategoriaProducto categoria) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto producto: productos) {
            if (producto.getCategoria().equals(categoria)) {
                filtrados.add(producto);
            }
        }
        
        return filtrados;
    }
    
    public void obtenerTotalStock() {
        int cantidadTotal = 0;
        for (Producto producto: productos) {
            System.out.println("Stock de " + producto.getNombre() + ": " + producto.getCantidad());
            cantidadTotal += producto.getCantidad();
        }
        
        System.out.println("Cantidad total de stock: " + cantidadTotal);
    }
    
    public Producto obtenerProductoConMayorStock() {
        Producto p = productos.get(0);
        for (Producto producto: productos) {
            if (producto.getCantidad() > p.getCantidad()) {
                p = producto;
            }
        }
        
        return p;
    }
    
    public ArrayList<Producto> filtrarProductoPorPrecio(double min, double max) {
        ArrayList<Producto> filtrados = new ArrayList<>();
        for (Producto producto: productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                filtrados.add(producto);
            }
        }
        
        return filtrados;
    }
    
    public void mostrarCategoriasDisponibles() {
        System.out.println("Valores disponibles de TipoInstrumento:");
        for (Producto.CategoriaProducto categoria : Producto.CategoriaProducto.values()) {
            System.out.println(categoria + " " + categoria.getDescripcion());
        }
    }
}
