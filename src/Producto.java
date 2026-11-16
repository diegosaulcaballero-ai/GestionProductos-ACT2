/**
 * Clase Producto: Representa un artículo dentro de un inventario.
 * Esta clase servirá como base para gestionar productos en la tienda.
 */
public class Producto {
    // Atributos de la clase (usamos 'protected' para facilitar la herencia en la Act. 3)
    protected String nombre;
    protected double precio;
    protected int stock;

    /**
     * Constructor de la clase Producto.
     */
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    /**
     * Calcula el valor total del inventario de este producto.
     */
    public double calcularValorInventario() {
        return precio * stock;
    }

    /**
     * Registra la venta de unidades y reduce el stock.
     */
    public void vender(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Venta exitosa: se vendieron " + cantidad + " unidades de " + nombre + ".");
        } else {
            System.out.println("Error: Stock insuficiente para vender " + cantidad + " unidades de " + nombre + ".");
        }
    }

    /**
     * Muestra la información actual del producto en consola.
     */
    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock + " uds.");
        System.out.println("Valor total en inventario: $" + calcularValorInventario());
    }
}
