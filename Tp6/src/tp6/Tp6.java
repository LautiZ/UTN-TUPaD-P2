package tp6;

import ej1.Inventario;
import ej1.Producto;
import ej2.Autor;
import ej2.Biblioteca;
import ej2.Libro;
import java.util.ArrayList;
import java.util.List;


public class Tp6 {
    public static void main(String[] args) {
        // ejercicio1();
        ejercicio2();
    }
    
    public static void ejercicio1() {
        Inventario inventario = new Inventario();
        
        // 1. Crear al menos cinco productos con diferentes categorías
        System.out.println("=== 1. AGREGANDO PRODUCTOS AL INVENTARIO ===");
        inventario.agregarProducto(new Producto("P001", "Laptop HP", 2500.0, 15, Producto.CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto("P002", "Arroz Integral", 800.0, 50, Producto.CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("P003", "Camisa Polo", 1500.0, 30, Producto.CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto("P004", "Licuadora", 2200.0, 20, Producto.CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto("P005", "Fideos", 500.0, 100, Producto.CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto("P006", "Jean Azul", 2800.0, 25, Producto.CategoriaProducto.ROPA));
        System.out.println("Productos agregados exitosamente.\n");
        
        // 2. Listar todos los productos
        System.out.println("=== 2. LISTADO DE TODOS LOS PRODUCTOS ===");
        inventario.listarProductos();
        System.out.println();
        
        // 3. Buscar un producto por ID
        System.out.println("=== 3. BUSCAR PRODUCTO POR ID ===");
        String idBuscar = "P003";
        Producto encontrado = inventario.buscarProductoPorId(idBuscar);
        if (encontrado != null) {
            System.out.println("Producto encontrado con ID " + idBuscar + ":");
            encontrado.mostrarInfo();
        } else {
            System.out.println("No se encontró producto con ID: " + idBuscar);
        }
        System.out.println();
        
        // 4. Filtrar productos por categoría
        System.out.println("=== 4. FILTRAR PRODUCTOS POR CATEGORÍA (ALIMENTOS) ===");
        ArrayList<Producto> alimentos = inventario.filtrarPorCategoria(Producto.CategoriaProducto.ALIMENTOS);
        for (Producto p : alimentos) {
            p.mostrarInfo();
        }
        System.out.println();
        
        // 5. Eliminar un producto por ID
        System.out.println("=== 5. ELIMINAR PRODUCTO (ID: P005) ===");
        inventario.eliminarProducto("P005");
        System.out.println("Producto eliminado. Productos restantes:");
        inventario.listarProductos();
        System.out.println();
        
        // 6. Actualizar el stock de un producto
        System.out.println("=== 6. ACTUALIZAR STOCK DEL PRODUCTO P001 ===");
        Producto actualizado = inventario.actualizarStock("P001", 25);
        if (actualizado != null) {
            System.out.println("Stock actualizado:");
            actualizado.mostrarInfo();
        }
        System.out.println();
        
        // 7. Mostrar el total de stock disponible
        System.out.println("=== 7. TOTAL DE STOCK DISPONIBLE ===");
        inventario.obtenerTotalStock();
        System.out.println();
        
        // 8. Obtener el producto con mayor stock
        System.out.println("=== 8. PRODUCTO CON MAYOR STOCK ===");
        Producto mayorStock = inventario.obtenerProductoConMayorStock();
        if (mayorStock != null) {
            System.out.println("El producto con mayor stock es:");
            mayorStock.mostrarInfo();
        }
        System.out.println();
        
        // 9. Filtrar productos con precios entre $1000 y $3000
        System.out.println("=== 9. PRODUCTOS CON PRECIO ENTRE $1000 Y $3000 ===");
        ArrayList<Producto> filtradosPorPrecio = inventario.filtrarProductoPorPrecio(1000, 3000);
        for (Producto p : filtradosPorPrecio) {
            p.mostrarInfo();
        }
        System.out.println();
        
        // 10. Mostrar las categorías disponibles con descripciones
        System.out.println("=== 10. CATEGORÍAS DISPONIBLES ===");
        inventario.mostrarCategoriasDisponibles();
    }
    
    public static void ejercicio2() {
        // 1. Creamos una biblioteca
        System.out.println("=== 1. CREANDO BIBLIOTECA ===");
        Biblioteca biblioteca = new Biblioteca("Biblioteca Central");
        System.out.println("Biblioteca creada: " + biblioteca.getNombre());
        System.out.println();
        
        // 2. Crear al menos tres autores
        System.out.println("=== 2. CREANDO AUTORES ===");
        Autor autor1 = new Autor("A001", "Gabriel García Márquez", "Colombiano");
        Autor autor2 = new Autor("A002", "Jorge Luis Borges", "Argentino");
        Autor autor3 = new Autor("A003", "Isabel Allende", "Chilena");
        
        System.out.println("Autores creados:");
        autor1.mostrarInfo();
        autor2.mostrarInfo();
        autor3.mostrarInfo();
        System.out.println();
        
        // 3. Agregar 5 libros asociados a alguno de los Autores a la biblioteca
        System.out.println("=== 3. AGREGANDO 6 LIBROS ===");
        biblioteca.agregarLibro("978-3-16-148410-0", "Cien años de soledad", 1967, autor1);
        biblioteca.agregarLibro("978-0-06-112008-4", "El amor en los tiempos del cólera", 1985, autor1);
        biblioteca.agregarLibro("978-0-14-118776-6", "Ficciones", 1944, autor2);
        biblioteca.agregarLibro("978-0-06-093546-7", "La casa de los espíritus", 1982, autor3);
        biblioteca.agregarLibro("978-0-307-47572-4", "El Aleph", 1949, autor2);
        biblioteca.agregarLibro("978-0-14-243789-5", "El Zahir", 1949, autor2);
        System.out.println("6 libros agregados exitosamente");
        System.out.println();
        
        // 4. Listar todos los libros con su información y la del autor
        System.out.println("=== 4. LISTANDO TODOS LOS LIBROS ===");
        biblioteca.listarLibros();
        System.out.println();
        
        // 5. Buscar un libro por su ISBN y mostrar su información
        System.out.println("=== 5. BUSCANDO LIBRO POR ISBN ===");
        String isbnBuscar = "978-0-14-118776-6";
        System.out.println("Buscando ISBN: " + isbnBuscar);
        Libro libroEncontrado = biblioteca.buscarLibroPorIsbn(isbnBuscar);
        if (libroEncontrado != null) {
            System.out.println("Libro encontrado:");
            libroEncontrado.mostrarInfo();
        } else {
            System.out.println("Libro no encontrado");
        }
        System.out.println();
        
        // 6. Filtrar y mostrar los libros publicados en un año específico
        System.out.println("=== 6. FILTRANDO LIBROS POR AÑO ===");
        int anioBuscar = 1949;
        System.out.println("Libros publicados en " + anioBuscar + ":");
        List<Libro> librosFiltrados = biblioteca.filtrarLibrosPorAnio(anioBuscar);
        if (librosFiltrados.isEmpty()) {
            System.out.println("No se encontraron libros de ese año");
        } else {
            for (Libro libro : librosFiltrados) {
                libro.mostrarInfo();
                System.out.println("--------------------");
            }
        }
        
        // 7. Eliminar un libro por su ISBN y listar los libros restantes
        System.out.println("=== 7. ELIMINANDO LIBRO POR ISBN ===");
        String isbnEliminar = "978-0-06-112008-4";
        System.out.println("Eliminando libro con ISBN: " + isbnEliminar);
        biblioteca.eliminarLibro(isbnEliminar);
        System.out.println("** Libro eliminado **\nLibros restantes:");
        biblioteca.listarLibros();
        System.out.println();
        
        // 8. Mostrar la cantidad total de libros en la biblioteca
        System.out.println("=== 8. CANTIDAD TOTAL DE LIBROS ===");
        int cantidadLibros = biblioteca.obtenerCantidadLibros();
        System.out.println("Total de libros en la biblioteca: " + cantidadLibros);
        System.out.println();
        
        // 9. Listar todos los autores de los libros disponibles en la biblioteca
        System.out.println("=== 9. LISTANDO AUTORES DISPONIBLES ===");
        biblioteca.mostrarAutoresDisponibles();
    }
}
