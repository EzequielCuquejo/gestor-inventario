public class Producto {
    // Atributos encapsulados
    private int id;
    private String nombre;
    private double precio;
    private int stock;

    // Constructor
    public Producto(int id, String nombre, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Método para mostrar la información del producto
    public void mostrarInformacion() {
        System.out.println("ID: " + id + " | Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock + " un.");
    }

    // Getters y Setters (Encapsulamiento)
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
}
