import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		
		String [] [] paisesCiudades = new String [4] [4];
		paisesCiudades = llenarArray(paisesCiudades);
		mostrarArray(paisesCiudades);
		
		
		
		
		
	}

	public static String[][] llenarArray (String[][] paisesCiudades) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("indique 1 pais y 3 ciudades del mismo");
		
		for(int i=0; i<4; i++) {
			for(int x=0; x<4; x++) {
				
				paisesCiudades[i][x]=leer.nextLine();
				
			}
		}
		
		return paisesCiudades;	

	}
	
	public static void mostrarArray (String[][] paisesCiudades) {
		
		System.out.println(" ");
		System.out.println("Resultados:");
		System.out.println(" ");
		int x=0;
		
		for(int i=0; i<4; i++) {
			
			System.out.println("  ");	
		
			for( x =0; x<4; x++) {
			
				if(x==0) {
					System.out.print(" pais: "+ paisesCiudades[i][x]);	
				}else if(x==1) {
					System.out.print(" ciudades: "+ paisesCiudades[i][x]);	
				}else if(x>0) { 
					System.out.print(", "+ paisesCiudades[i][x]);	
				}
			}
		}
	
}
	
	
	
	
	
	
	
	
	
	
	
	}
	