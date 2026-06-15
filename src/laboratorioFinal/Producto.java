package laboratorioFinal;

public class Producto {

    private int idProducto;
    private String nombre;
    private double precioCompra;
    private double precioVenta;
    private Categoria categoria;

    public Producto(int idProducto,
                    String nombre,
                    double precioCompra,
                    double precioVenta,
                    Categoria categoria) {

        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.categoria = categoria;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precioVenta;
    }
}