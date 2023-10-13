import java.util.ArrayList;

public class Plato {

	private String nombreCompleto;
	private Double precio;
	private boolean esBebida;
	ArrayList<Ingrediente>ingredientes= new ArrayList<Ingrediente>();
	
	public Plato(String nombreCompleto,Double precio,boolean esBebida,ArrayList<Ingrediente>ingredientes) {
		
		this.nombreCompleto=nombreCompleto;
		this.precio=precio;
		this.esBebida=esBebida;
		this.ingredientes=ingredientes;
	}
	
		public String getNombreCompleto() {
	        return nombreCompleto;
	    }
	    public void setNombreCompleto(String nombreCompleto) {
	        this.nombreCompleto = nombreCompleto;
	    }
	    
	    public Double getPrecio() {
	        return precio;
	    }
	    public void setPrecio(Double precio) {
	        this.precio = precio;
	    }
	    
	    public boolean isEsBebida() {
	        return esBebida;
	    }
	    public void setEsBebida(boolean esBebida) {
	        this.esBebida = esBebida;
	    }
	    
	    public ArrayList<Ingrediente> getIngredientes() {
	        return ingredientes;
	    }
	    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
	        this.ingredientes = ingredientes;
	    }
	
}
