/**
 * Clase Main: Punto de entrada de la aplicación.
 * Aquí se instancian los objetos y se prueban los métodos de la clase Producto.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE PRODUCTOS ===\n");

        // 1. Instanciación de objetos usando el constructor
        Producto producto1 = new Producto("Laptop Dell", 15000.00, 10);
        Producto producto2 = new Producto("Mouse Inalámbrico", 350.50, 25);

        // 2. Prueba de métodos en el primer objeto
        producto1.mostrarDetalles();
        producto1.vender(3);
        producto1.mostrarDetalles();

        System.out.println("\n----------------------------------------\n");

        // 3. Prueba de métodos en el segundo objeto
        producto2.mostrarDetalles();
        producto2.vender(30);
    }
}
