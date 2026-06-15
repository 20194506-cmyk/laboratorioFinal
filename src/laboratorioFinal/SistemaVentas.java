package laboratorioFinal;

public class SistemaVentas {

    public static void main(String[] args) {

        System.out.println("=================================");
        System.out.println("      LABORATORIO FINAL");
        System.out.println("=================================");
        System.out.println("Integrantes:");
        System.out.println("- Roberto Carlos Acevedo Hernández");
        System.out.println("- Jose Eduardo Ortiz Flores");
        System.out.println("- Ernesto Rafael Paula Castaneda");
        System.out.println("=================================");
        System.out.println("Sistema de Ventas Iniciado (Modo Automático).");
        System.out.println("=================================\n");

        // 1. Instanciamos la Categoría
        Categoria tecnologia = new Categoria(1, "Tecnología");
        
        // 2. Instanciamos los Productos disponibles
        Producto p1 = new Producto(101, "Laptop ASUS", 600.0, 850.0, tecnologia);
        Producto p2 = new Producto(102, "Mouse Gamer", 15.0, 30.0, tecnologia);
        Producto p3 = new Producto(103, "Teclado Mecánico", 40.0, 75.0, tecnologia);

        // 3. Instanciamos el Cliente y el Empleado
        Cliente cliente = new Cliente(1, "Juan Pérez", "7777-1111", "San Salvador");
        Empleado empleado = new Empleado(5, "Ana Gómez", "Cajera Principal");

        // 4. Creamos la venta principal
        Venta nuevaVenta = new Venta(1, "15/06/2026", cliente, empleado);

        // 5. Agregamos los productos directamente a la venta (Simulando la compra)
        // Ejemplo: 1 Laptop, 2 Mouses y 1 Teclado
        nuevaVenta.agregarDetalle(new DetalleVenta(1, 1, p1)); 
        nuevaVenta.agregarDetalle(new DetalleVenta(2, 2, p2)); 
        nuevaVenta.agregarDetalle(new DetalleVenta(3, 1, p3)); 

        // 6. Mostramos el ticket final con todo el desglose y el total calculado
        System.out.println("=========================================");
        System.out.println(nuevaVenta); // Llama al método toString() de tu clase Venta
        System.out.println("=========================================");
    }
}