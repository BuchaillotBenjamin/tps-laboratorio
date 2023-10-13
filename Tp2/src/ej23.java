import java.util.Scanner;

public class ej23 {

	public static String darVuelta(String frase){
		
		 if (frase.isEmpty()) {
			 
			 return frase; 
			 
	     } else {
	        	
	        	char primerCaracter = frase.charAt(0);
	        	String restoCadena = frase.substring(1);
	        	return darVuelta(restoCadena) + primerCaracter;
	     }

		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("digame una frase");
		
		
		String frase = leer.nextLine();
		
		System.out.print("frase al reves es: "+ darVuelta(frase) );
			
		
			
		
		
		
		
		
		
		
		
		
	}

}
