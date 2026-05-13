import java.util.ArrayList;

/**
 * Servicio encargado de gestionar los productos.
 */
public class ProductoService {

    private ArrayList<Producto> productos = new ArrayList<>();

    /**
     * Agrega un producto nuevo
     */
    public void agregar(String nombre, double precio, int stock) {

        Producto nuevo = new Producto(nombre, precio, stock);

        productos.add(nuevo);

        System.out.println("********** Producto agregado correctamente. **********");
        System.out.println(nuevo);
    }

    /**
     * Lista todos los productos
     */
    public void listar() {

        if (productos.isEmpty()) {

            System.out.println("********** No hay productos cargados todavía.**********");
            return;
        }

        System.out.println("\n*********** LISTA DE PRODUCTOS ************");

        for (Producto p : productos) {

            System.out.println(p);
        }
    }

    /**
     * Busca un producto por ID
     */
    public Producto buscarPorId(int id) {

        for (Producto p : productos) {

            if (p.getId() == id) {

                return p;
            }
        }

        throw new ProductoNoEncontrado(id);
    }

    /**
     * Elimina un producto por ID
     */
    public void eliminar(int id) {

        Producto p = buscarPorId(id);

        productos.remove(p);

        System.out.println(" Producto eliminado: " + p.getNombre());
    }
}