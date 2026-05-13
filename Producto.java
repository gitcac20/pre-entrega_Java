
/**
 * Modelo que representa un producto de la tienda.
 */
public class Producto {

    // Generador automático de IDs
    private static int contadorId = 1;

    private int id;
    private String nombre;
    private double precio;
    private int stock;

    /**
     * Constructor principal
     */
    public Producto(String nombre, double precio, int stock) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    // Setters
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Representación visual del producto
     */
    @Override
    public String toString() {

        return " Producto #" + id +
               " | Nombre: " + nombre +
               " | Precio: $" + precio +
               " | Stock disponible: " + stock;
    }
}