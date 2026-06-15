package laboratorioFinal;

import java.util.ArrayList;

public class Venta {

    private int idVenta;
    private String fecha;
    private Cliente cliente;
    private Empleado empleado;
    private ArrayList<DetalleVenta> detalles;

    public Venta(int idVenta, String fecha,
                 Cliente cliente,
                 Empleado empleado) {

        this.idVenta = idVenta;
        this.fecha = fecha;
        this.cliente = cliente;
        this.empleado = empleado;

        detalles = new ArrayList<>();
    }

    public void agregarDetalle(DetalleVenta detalle) {
        detalles.add(detalle);
    }

    public double calcularTotal() {

        double total = 0;

        for (DetalleVenta detalle : detalles) {
            total += detalle.getSubtotal();
        }

        return total;
    }

    @Override
    public String toString() {

        String texto = "";

        texto += "VENTA #" + idVenta + "\n";
        texto += "Fecha: " + fecha + "\n";
        texto += "Cliente: " + cliente.getNombre() + "\n";
        texto += "Empleado: " + empleado.getNombre() + "\n\n";

        texto += "DETALLES:\n";

        for (DetalleVenta detalle : detalles) {
            texto += detalle + "\n";
        }

        texto += "\nTOTAL: $" + calcularTotal();

        return texto;
    }
}
