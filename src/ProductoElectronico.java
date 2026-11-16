/**
 * Clase derivada ProductoElectronico: Hereda de la clase base Producto.
 * Reutiliza los atributos (nombre, precio, stock) y métodos de Producto,
 * añadiendo características específicas de aparatos electrónicos.
 */
public class ProductoElectronico extends Producto {
    // Atributo único de esta subclase
    private int mesesGarantia;

    /**
     * Constructor de ProductoElectronico.
     * Utiliza 'super' para llamar al constructor de la clase base Producto.
     */
    public ProductoElectronico(String nombre, double precio, int stock, int mesesGarantia) {
        super(nombre, precio, stock); // Reutilización del constructor de la superclase
        this.mesesGarantia = mesesGarantia;
    }

    /**
     * Sobrescritura (@Override) del método mostrarDetalles de la clase base.
     * Amplía la información original agregando los meses de garantía.
     */
    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método original de Producto
        System.out.println("Categoría: Electrónica | Garantía incluida: " + mesesGarantia + " meses.");
    }

    /**
     * Método exclusivo de la subclase ProductoElectronico.
     * Permite extender la garantía del producto electrónico.
     */
    public void extenderGarantia(int mesesAdicionales) {
        this.mesesGarantia += mesesAdicionales;
        System.out.println("Garantía extendida para " + nombre + ". Nueva garantía: " + mesesGarantia + " meses.");
    }
}
