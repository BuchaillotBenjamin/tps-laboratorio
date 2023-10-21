import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio_Agenda {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		boolean salida=false;
		String eleccion ;
		HashMap<String, Long> agenda = new HashMap<String, Long>();
		
		System.out.println("-----------AGENDA-----------");
		
		do {
			
			System.out.println("");
			System.out.println("1) Cargar datos en la agenda");
			System.out.println("2) Buscar telefonos por nombre");
			System.out.println("3) Listar agenda");
			System.out.println("4) Salir");
			eleccion=leer.next();
			
			switch(eleccion){
			case ("1"):
				
				agregarDatos(agenda);
				break;
				
			case ("2"):
				
				buscarTelefono(agenda);
				break;
			
			case ("3"):
				
				listarAgenda(agenda);
				break;
			
			case ("4"):
				
				salida=true;
				break;
				
			default:
				
				System.out.println("");
				System.out.println("Numero ingresado no es valido intente nuevamente");
				break;
				
			}
				
			
			
		}while(salida==false);
		
		System.out.println("Saliendo...");
	}

	
	public static HashMap<String, Long>  agregarDatos(HashMap<String, Long> agenda) {
		Scanner leer1 = new Scanner(System.in);
		String nombre;
		long telefono;
		String aux;
		boolean salida=false;
		
		do {
		
		System.out.println("");
		System.out.println("Ingrese el nombre de la persona");
		nombre=leer1.next();
		
		if(agenda.containsKey(nombre)) {
			
			System.out.println("");
			System.out.println("El nombre ingresado ya tiene asociado un numero");
			
		}else{	
			
			System.out.println("Ingrese el numero telefonico");
			telefono=leer1.nextInt();
			
		if (agenda.containsValue(telefono)||telefono<=0) {
			
			System.out.println("");
			System.out.println("El valor es negativo o ya fue ingreasdo antes, intente nuevamente");
			
		}else {
			
			agenda.put(nombre,telefono);
			
		}
		}
		
		System.out.println("");
		System.out.println("Si desea dejar de cargar numeros pulse 1, si quiere continuar pulse cualquier tecla");
		aux=leer1.next();
		
		if (aux.equals("1")) {
			
			salida=true;
			
		}
		
		}while(salida==false);
		
		return agenda;
	}
	
	public static void buscarTelefono(HashMap<String, Long> agenda) {
		Scanner leer2=new Scanner(System.in);
		String nombre;
		boolean salida=false;
		
		do {
		System.out.println("");
		System.out.println("Ingrese el nombre de la persona que quiere buscar");
		nombre=leer2.next();
		
		if(agenda.containsKey(nombre)) {
			
			System.out.println("");
			System.out.println("el telefono es " + agenda.get(nombre));
			salida=true;
			
        } else {
        	
        	System.out.println("");
            System.out.println("el nombre ingresado no esta en la agenda, intente nuevamente");
            
		}
		
		}while(salida==false);
		
	}
	
	public static void listarAgenda(HashMap<String, Long> agenda) {
		
		if (agenda.isEmpty()) {
			
			System.out.println("");
			System.out.println("La agenda esta vacia");
			
		}else {
			
		System.out.println("");
		System.out.println("Imprimiendo agenda...");
		
		 for (Map.Entry<String, Long> entrada : agenda.entrySet()) {
			 
	            String nombre = entrada.getKey();
	            Long telefono = entrada.getValue();
	            
	            System.out.println("");
	            System.out.println("Nombre: " + nombre + "  Teléfono: " + telefono);
	            
	        }
	}
	}
	
	
	
}
