/**
 * Clase derivada ProductoAlimenticio: Hereda de la clase base Producto.
 * Implementa herencia para gestionar alimentos con fecha de caducidad.
 */
public class ProductoAlimenticio extends Producto {
    // Atributo exclusivo de esta subclase
    private String fechaCaducidad;

    /**
     * Constructor de ProductoAlimenticio.
     * Llama al constructor padre mediante 'super' e inicializa la fecha de caducidad.
     */
    public ProductoAlimenticio(String nombre, double precio, int stock, String fechaCaducidad) {
        super(nombre, precio, stock); // Reutilización de código de la clase base
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * Sobrescritura (@Override) del método mostrarDetalles.
     * Reutiliza la salida de la clase base y añade la fecha de vencimiento.
     */
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Ejecuta el método de la clase base
        System.out.println("Categoría: Alimento | Fecha de caducidad: " + fechaCaducidad);
    }

    /**
     * Método exclusivo de la subclase ProductoAlimenticio.
     * Verifica y muestra una alerta sobre el vencimiento del producto.
     */
    public void verificarCaducidad() {
        System.out.println("Aviso de inventario: El producto '" + nombre + "' debe consumirse antes del " + fechaCaducidad + ".");
    }
}
