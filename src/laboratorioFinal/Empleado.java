package laboratorioFinal;

public class Empleado {

    private int idEmpleado;
    private String nombre;
    private String cargo;

    public Empleado(int idEmpleado, String nombre, String cargo) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return nombre + " - " + cargo;
    }
}