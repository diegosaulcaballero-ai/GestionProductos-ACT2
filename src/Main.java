/**
 * Clase principal Main: Prueba la implementación de herencia,
 * instanciando objetos de las clases derivadas y ejecutando sus métodos.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DE HERENCIA: PRODUCTO ELECTRÓNICO ===");
        // Instancia de la subclase ProductoElectronico
        ProductoElectronico laptop = new ProductoElectronico("Laptop Lenovo", 15000.0, 5, 12);
        laptop.mostrarDetalles();      // Método sobrescrito que llama a super.mostrarDetalles()
        laptop.vender(2);              // Método heredado directamente de la clase base Producto
        laptop.extenderGarantia(6);    // Método exclusivo de ProductoElectronico
        laptop.mostrarDetalles();      // Verificamos el stock y garantía actualizados

        System.out.println("\n=== PRUEBA DE HERENCIA: PRODUCTO ALIMENTICIO ===");
        // Instancia de la subclase ProductoAlimenticio
        ProductoAlimenticio leche = new ProductoAlimenticio("Leche Entera 1L", 28.50, 20, "25/11/2026");
        leche.mostrarDetalles();       // Método sobrescrito
        leche.verificarCaducidad();    // Método exclusivo de ProductoAlimenticio
        leche.vender(5);               // Método heredado de Producto
        leche.mostrarDetalles();       // Verificamos el inventario actualizado
    }
}
