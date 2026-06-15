package laboratorioFinal;

import java.util.Scanner;

public class SistemaVentas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        // 1. Datos base del sistema (para no empezar desde cero)
        Categoria tecnologia = new Categoria(1, "Tecnología");
        
        // Creamos 3 productos de prueba disponibles
        Producto p1 = new Producto(101, "Laptop ASUS", 600.0, 850.0, tecnologia);
        Producto p2 = new Producto(102, "Mouse Gamer", 15.0, 30.0, tecnologia);
        Producto p3 = new Producto(103, "Teclado Mecánico", 40.0, 75.0, tecnologia);

        // Registramos al cliente y al empleado
        Cliente cliente = new Cliente(1, "Juan Pérez", "7777-1111", "San Salvador");
        Empleado empleado = new Empleado(5, "Ana Gómez", "Cajera Principal");

        // Creando la venta principal
        Venta nuevaVenta = new Venta(1, "15/06/2026", cliente, empleado);

        int opcion = 0;
        int contadorDetalle = 1; // Para asignarle ID a cada detalle de producto

        System.out.println("=================================");
        System.out.println("      LABORATORIO FINAL");
        System.out.println("=================================");
        System.out.println("Integrantes:");
        System.out.println("- Roberto Carlos Acevedo Hernández");
        System.out.println("- Jose Eduardo Ortiz Flores");
        System.out.println("- Ernesto Rafael Paula Castaneda");
        System.out.println("=================================");
        System.out.println("Sistema de Ventas Iniciado.");
        System.out.println("=================================\n");

        // MENÚ INTERACTIVO
        do {
            System.out.println("--- MENÚ DE OPCIONES ---");
            System.out.println("1. Ver catálogo de productos");
            System.out.println("2. Agregar producto a la venta");
            System.out.println("3. Mostrar ticket de venta (Total actual)");
            System.out.println("4. Finalizar y Salir");
            System.out.print("Selecciona una opción: ");
            
            opcion = leer.nextInt();
            System.out.println(); // Espacio en blanco

            switch (opcion) {
                case 1:
                    System.out.println("=== CATÁLOGO DE PRODUCTOS DISPONIBLES ===");
                    System.out.println("1. " + p1.getNombre() + " | Precio: $" + p1.getPrecioVenta());
                    System.out.println("2. " + p2.getNombre() + " | Precio: $" + p2.getPrecioVenta());
                    System.out.println("3. " + p3.getNombre() + " | Precio: $" + p3.getPrecioVenta());
                    System.out.println("=========================================\n");
                    break;

                case 2:
                    System.out.println("=== AGREGAR PRODUCTO ===");
                    System.out.println("¿Qué producto deseas agregar? (Digita 1, 2 o 3): ");
                    int prodElegido = leer.nextInt();
                    
                    System.out.println("¿Cuántas unidades deseas llevar?: ");
                    int cantidad = leer.nextInt();

                    Producto seleccionado = null;
                    if (prodElegido == 1) seleccionado = p1;
                    else if (prodElegido == 2) seleccionado = p2;
                    else if (prodElegido == 3) seleccionado = p3;

                    if (seleccionado != null && cantidad > 0) {
                        // Creamos el detalle y lo metemos a la venta
                        DetalleVenta nuevoDetalle = new DetalleVenta(contadorDetalle, cantidad, seleccionado);
                        nuevaVenta.agregarDetalle(nuevoDetalle);
                        contadorDetalle++;
                        System.out.println("¡Añadido con éxito: " + seleccionado.getNombre() + " x" + cantidad + "!\n");
                    } else {
                        System.out.println("Opción de producto o cantidad inválida.\n");
                    }
                    break;

                case 3:
                    System.out.println("=========================================");
                    System.out.println(nuevaVenta); // Imprime el método toString de la clase Venta
                    System.out.println("=========================================\n");
                    break;

                case 4:
                    System.out.println("=========================================");
                    System.out.println("Venta guardada. Gracias por usar el sistema.");
                    System.out.println("=========================================");
                    break;

                default:
                    System.out.println("Opción no válida, intenta de nuevo.\n");
            }

        } while (opcion != 4);

        leer.close(); // Cerramos el scanner
    }
}