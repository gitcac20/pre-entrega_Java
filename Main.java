
import java.util.Scanner;

/**
 * Sistema simple de gestión de productos.
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ProductoService servicio = new ProductoService();
        servicio.agregar("Mouse Gamer", 25000       , 8);
        servicio.agregar("Teclado Mecánico", 50000, 4);
        servicio.agregar("Monitor 144Hz", 320000, 2);
        servicio.agregar("Auriculares RGB", 45000, 6);
        servicio.agregar("Silla Gamer", 210000, 1);
        int opcion = -1;

        System.out.println("=================================");
        System.out.println("  SISTEMA DE INVENTARIO JAVA     ");
        System.out.println("=================================");

        while (opcion != 0) {

            System.out.println("\nElegí una opción:");
            System.out.println("***** 1 Agregar producto *****");
            System.out.println("***** 2 Mostrar productos *****");
            System.out.println("***** 3 Buscar producto *****");
            System.out.println("***** 4 Eliminar producto *****");
            System.out.println("***** 0 Salir *****");

            System.out.print(" Opción: ");

            if (!sc.hasNextInt()) {

                System.out.println("Precaucion Debés ingresar un número válido.");
                sc.next();
                continue;
            }

            opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {

                System.out.print(" Nombre del producto: ");

                String nombre = sc.nextLine();

                if (nombre.isBlank()) {

                    System.out.println("Precaucion El nombre no puede estar vacío.");
                    continue;
                }

                System.out.print(" Precio: ");

                if (!sc.hasNextDouble()) {

                    System.out.println("Precaucion El precio debe ser numérico.");
                    sc.next();
                    continue;
                }

                double precio = sc.nextDouble();

                if (precio <= 0) {

                    System.out.println("Precaucion El precio debe ser mayor que cero.");
                    sc.nextLine();
                    continue;
                }

                System.out.print(" Stock: ");

                if (!sc.hasNextInt()) {

                    System.out.println("Precaucion El stock debe ser un número entero.");
                    sc.next();
                    continue;
                }

                int stock = sc.nextInt();
                sc.nextLine();

                if (stock < 0) {

                    System.out.println(" El stock no puede ser negativo.");
                    continue;
                }

                servicio.agregar(nombre, precio, stock);

            } else if (opcion == 2) {

                servicio.listar();

            } else if (opcion == 3) {

                System.out.print(" Ingresá el ID a buscar: ");

                if (!sc.hasNextInt()) {

                    System.out.println("Precaucion ID inválido.");
                    sc.next();
                    continue;
                }

                int id = sc.nextInt();
                sc.nextLine();

                try {

                    Producto p = servicio.buscarPorId(id);

                    System.out.println(" Producto encontrado:");
                    System.out.println(p);

                } catch (ProductoNoEncontrado e) {

                    System.out.println(e.getMessage());
                }

            } else if (opcion == 4) {

                System.out.print(" Ingresá el ID a eliminar: ");

                if (!sc.hasNextInt()) {

                    System.out.println("Precaucion ID inválido.");
                    sc.next();
                    continue;
                }

                int id = sc.nextInt();
                sc.nextLine();

                try {

                    servicio.eliminar(id);

                } catch (ProductoNoEncontrado e) {

                    System.out.println(e.getMessage());
                }

            } else if (opcion != 0) {

                System.out.println("Precaucion Opción inválida. Elegí entre 0 y 4.");
            }
        }

        System.out.println("\n Gracias por usar el sistema.");

        sc.close();
    }
}