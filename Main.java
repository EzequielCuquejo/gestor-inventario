import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creamos una lista para simular nuestra base de datos en memoria
        List<Producto> inventario = new ArrayList<>();

        // Instanciamos nuevos objetos de tipo Producto
        Producto prod1 = new Producto(1, "Teclado Mecánico", 45000.0, 15);
        Producto prod2 = new Producto(2, "Mouse Inalámbrico", 18500.0, 30);
        Producto prod3 = new Producto(3, "Monitor 24 pulgadas", 120000.0, 10);

        // Agregamos los productos al inventario
        inventario.add(prod1);
        inventario.add(prod2);
        inventario.add(prod3);

        // Mostramos el inventario por consola
        System.out.println("--- GESTIÓN DE INVENTARIO INICIAL ---");
        for (Producto p : inventario) {
            p.mostrarInformacion();
        }

        // Simulamos una venta (Actualización de stock)
        System.out.println("\n--- SIMULANDO VENTA DE 1 TECLADO ---");
        prod1.setStock(prod1.getStock() - 1);
        prod1.mostrarInformacion();
    }
}
