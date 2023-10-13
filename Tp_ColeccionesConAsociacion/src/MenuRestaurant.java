import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurant {

	public static void main(String[] args) {
		Scanner leer= new Scanner(System.in);
		ArrayList<Plato>platosMenu=new ArrayList<Plato>();
		int j=0;
		int i=0;
		String bebida;
		boolean esBebida;
		String nombrePlato;
		double precio;
		
		do {
			i=0;
			System.out.println("Indique 0 si quiere salir, para continuar ingrese cualquier tecla ");
			String salida=leer.nextLine();
			
			if(!salida.equals("0")){
				
			System.out.println("Indique B si va a ingresar una bebida o cualquier tecla si va a ingresar un plato ");
			bebida=leer.nextLine();
			
			if (!bebida.toUpperCase().equals("B")) {
				esBebida=false;
				System.out.println("Ingrese el nombre del plato ");
				nombrePlato=leer.nextLine();
				do {
				System.out.println("Ingrese el precio del plato ");
				precio=leer.nextDouble();
				
				if (precio>0) {
					i++;
				}else {
					System.out.println("El precio no puede ser negativo, intente nuevamente ");
				}
				
				}while(i==0);
				
				Plato plato= new Plato(nombrePlato,precio,esBebida,agregarIngredientes());
				platosMenu.add(plato);
			}else {
				esBebida=true;
				System.out.println("Ingrese el nombre de la bebida ");
				nombrePlato=leer.nextLine();
				do {
				System.out.println("Ingrese el precio de la bebida ");
				precio=leer.nextDouble();
				
				if (precio>0) {
					i++;
				}else {
					System.out.println("El precio no puede ser negativo, intente nuevamente ");
				}
				
				}while(i==0);
				
				Plato plato= new Plato(nombrePlato,precio,esBebida,null);
				platosMenu.add(plato);
			}
		
			}else {
				j++;
				System.out.println("Ingreso 0 ");
				System.out.println("Presione enter ");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		leer.nextLine();
		}while(j==0);
		
		mostrarMenu(platosMenu);
		
		
	}
	
	public static ArrayList<Ingrediente> agregarIngredientes(){
		Scanner leer1=new Scanner(System.in);
		
		ArrayList<Ingrediente>ingredientes=new ArrayList<Ingrediente>();
		int j=1;
		String ingrediente;
		double cantidad;
		String medida;
		
		do {
			int i=0;
			System.out.println("Ingrese el ingrediente ");
			ingrediente=leer1.nextLine();
			
			do {
				System.out.println("Ingrese la cantidad ");
				cantidad=leer1.nextDouble();
			if(cantidad>0 ) {
				i=1;
			}else {
				System.out.println("Valor incorrecto, intente nuevamente");
			}
			leer1.nextLine();
			System.out.println("Ingrese la medida ");
			medida=leer1.nextLine();
			}while(i==0);
			
			Ingrediente ingredientesPlato = new Ingrediente(ingrediente, cantidad,medida);
			ingredientes.add(ingredientesPlato);
		    
			System.out.println("Si desea dejar de cargar ingredientes a este plato ingrese 0, para continuar toque cualquier tecla");
			String valor=leer1.nextLine();
			
			if (valor.equals("0")){
				j=0;
			}
			
		}while(j==1);
			
		return ingredientes;
	}

	public static void mostrarMenu(ArrayList<Plato> platos) {
		
		 System.out.println("---------------Menu-----------------");
		    for (Plato plato : platos) {
		        System.out.println(plato.getNombreCompleto());
		        System.out.println("Precio: " + plato.getPrecio() + "$");

		        if (!plato.isEsBebida()) {
		            System.out.println("Ingredientes:");
		            System.out.println("Nombre\t\tCantidad\tUnidad de Medida");

		            for (Ingrediente ingrediente : plato.getIngredientes()) {
		                System.out.printf("%s\t%.2f\t%s%n", ingrediente.getNombre(), ingrediente.getCantidad(), ingrediente.getMedida());
		            }
		        }
		        System.out.println("------------------------------------");
		    }
}
}

