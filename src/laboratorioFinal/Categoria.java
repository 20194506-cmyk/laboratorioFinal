package laboratorioFinal;

public class Categoria {
	
	    private int idCategoria;
	    private String nombre;

	    public Categoria(int idCategoria, String nombre) {
	        this.idCategoria = idCategoria;
	        this.nombre = nombre;
	    }

	    public int getIdCategoria() {
	        return idCategoria;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    @Override
	    public String toString() {
	        return nombre;
	    }
	}

