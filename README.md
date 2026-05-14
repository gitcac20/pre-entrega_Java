# 📦 Sistema de Gestión de Productos (Java)

Proyecto de consola desarrollado en Java para gestionar un inventario básico de productos.
Aplicación orientada a practicar **Programación Orientada a Objetos (POO)**, manejo de listas y excepciones.

---

# 🚀 Funcionalidades


* Agregar productos
* Listar productos   
* Eliminar producto por ID
* Excepción personalizada si el producto no existe

---

# 🧱 Estructura del proyecto

## 🔹 Clase Producto

```java
public class Producto {

    private static int contadorId = 1;

    private int id;
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
}
```

---

## 🔹 Servicio de productos

```java
public class ProductoService {

    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregar(String nombre, double precio, int stock) {
        Producto nuevo = new Producto(nombre, precio, stock);
        productos.add(nuevo);
    }
}
```

---

## 🔹 Excepción personalizada

```java
public class ProductoNoEncontrado extends RuntimeException {

    public ProductoNoEncontrado(int id) {
        super("No se encontró ningún producto con ID: " + id);
    }
}
```

---

## 🔹 Main (menú principal)

```java
public class Main {
    public static void main(String[] args) {
        // menú del sistema
    }
}
```

---

# ⚙️ Tecnologías usadas

* Java
* POO
* ArrayList
* Manejo de excepciones
* Consola (Scanner)

---

# ▶️ Cómo ejecutar

```bash
git clone https://github.com/gitcac20/pre-entrega_Java_facil.git
```

Luego abrir en un IDE y ejecutar:

```
Main.java
```

---

# 👨‍💻 Autor

Proyecto de práctica de Java para aprendizaje de POO.

