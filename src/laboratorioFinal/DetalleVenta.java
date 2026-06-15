package laboratorioFinal;

public class DetalleVenta {

    private int idDetalle;
    private int cantidad;
    private Producto producto;
    private double subtotal;

    public DetalleVenta(int idDetalle, int cantidad, Producto producto) {
        this.idDetalle = idDetalle;
        this.cantidad = cantidad;
        this.producto = producto;
        this.subtotal = cantidad * producto.getPrecioVenta();
    }

    public double getSubtotal() {
        return subtotal;
    }

    @Override
    public String toString() {
        return producto.getNombre() +
                " x" + cantidad +
                " = $" + subtotal;
    }
}