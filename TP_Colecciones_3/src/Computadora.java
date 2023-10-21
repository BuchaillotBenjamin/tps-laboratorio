import java.util.HashSet;
import java.util.Scanner;

public class Computadora {

	private String marca;
	private String modelo;
	private HashSet<ComponenteCPU> componentes = new HashSet<>();

	public Computadora(String marca,String modelo,HashSet<ComponenteCPU> componentes) {
		
		this.marca=marca;
		this.modelo=modelo;
		this.componentes=componentes;
		
	}
	
		public String getMarca() {
	        return marca;
	    }
	    public void setMarca(String marca) {
	        this.marca = marca;
	    }

	    public String getModelo() {
	        return modelo;
	    }
	    public void setModelo(String modelo) {
	        this.modelo = modelo;
	    }

	    public HashSet<ComponenteCPU> getComponentes() {
	        return componentes;
	    }
	    public void setComponentes(HashSet<ComponenteCPU> componentes) {
	        this.componentes = componentes;
	    }
	
	    
	    
	    
}
