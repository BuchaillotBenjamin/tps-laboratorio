import java.util.HashSet;
import java.util.Scanner;

public class CostoComputadora {

	public static void main(String[] args) {
		Scanner leer2 = new Scanner(System.in);
		String salida;
		boolean salida1=false;
		
		do {
			
		Computadora nuevaPC = marcaModelo();
		factura(nuevaPC);
		
		
		System.out.println("");
		System.out.println("¿Desea ingresar una Nueva PC? SI/NO");
		salida=leer2.next();
		
		if(salida.toUpperCase().equals("NO")) {
			
			salida1=true;
			
		}
		
		}while(salida1==false);
		
		
	}

	
	public static Computadora marcaModelo() {
    	Scanner leer = new Scanner(System.in);
    	String marca;
		String modelo;
		
		System.out.println("Ingrese la marca de la computadora");
		marca=leer.next();
		
		System.out.println("Ingrese el modelo");
		modelo=leer.next();
		
		Computadora computadoraNueva=new Computadora(marca,modelo,cargarComponentes());
		
    	return computadoraNueva;
	}
	
	public static HashSet<ComponenteCPU>cargarComponentes(){
		Scanner leer1 = new Scanner(System.in);
    	HashSet<ComponenteCPU>componentesCargados=new HashSet<>();;
    	boolean salida1=false;
    	boolean salida2=false;
    	boolean salida3=false;
    	String componente;
    	String marca;
    	String salida;
    	int cantidad;
    	double precio;
    	
    	
    	do	{
    		
    	System.out.println("");
    	System.out.println("Ingrese el nombre del componente");
    	componente=leer1.next();
    	
    	System.out.println("");
    	System.out.println("Ingrese la marca del componente");
    	marca=leer1.next();
    	
    	do	{
    		
    	System.out.println("");
    	System.out.println("Ingrese la cantidad");
    	cantidad=leer1.nextInt();
    	
    	if(cantidad>0) {
    		
    		salida2=true;
    		
    	}else {
    		
    		System.out.println("");
    		System.out.println("La cantidad no puede ser negativa o 0");
    		salida2=false;
    		
    	}
    	
    	}while(salida2==false);
    	
    	do {
    		
    	System.out.println("");
    	System.out.println("Ingrese el precio de cada unidad");	
    	precio=leer1.nextDouble();
    	
    	if (precio>0) {
    		
    		salida3=true;
    		
    	}else {
    		
    		System.out.println("");
    		System.out.println("el precio no puede ser negativo o 0");
    		salida3=false;
    		
    	}
    	
    	}while(salida3==false);
    	
    	ComponenteCPU componenteAgregar= new ComponenteCPU(componente, marca, cantidad, precio);
    	
    	componentesCargados.add(componenteAgregar);
    	
    	System.out.println("");
    	System.out.println("Si desea dejar de cargar componentes pulse 1 si quiere continuar pulse cualquier tecla");
    	salida=leer1.next();
    	
    	if (salida.equals("1")) {
    		
    	salida1=true;
    	
    	}
    	
    	}while(salida1==false);
    
    	
    	return componentesCargados;
    }
	
	public static void factura(Computadora nuevaPC){
			HashSet<ComponenteCPU> componentesCargados = nuevaPC.getComponentes();
			double precioTotal=0.0;
			double precioComponente=0.0;
			
			System.out.println("----------COMPUTADORA----------");
			System.out.println("Marca: "+nuevaPC.getMarca());
			System.out.println("Modelo: "+nuevaPC.getModelo());
			
			System.out.printf("%-15s %-15s %-15s %-20s%n", "Componente", "Marca", "Cantidad", "Precio");

			for (ComponenteCPU componente : componentesCargados) {
			   
			    //System.out.println("Componente: " + componente.getComponente());
			    //System.out.println("Marca: " + componente.getMarca());
			    //System.out.println("Cantidad: " + componente.getCantidad());
			    //System.out.println("Precio: " + componente.getPrecio());
			    
				System.out.printf("%-15s %-15s %-15d %-15.2f%n", componente.getComponente(), componente.getMarca(), componente.getCantidad(), componente.getPrecio());

			    precioComponente = componente.getPrecio() * componente.getCantidad();
	            precioTotal += precioComponente;
			    
			}
		
			if (precioTotal > 50000) {
				
	            precioTotal *= 1.3; 
	            
	        } else {
	        	
	            precioTotal *= 1.4; 
	            
	        }
			
		    String precioTotalString = "Precio total: " + precioTotal;

		    System.out.printf("%-15s %-15s %-15s %-20s%n", "", "", "", precioTotalString);
		
	}
	
    
	
}
