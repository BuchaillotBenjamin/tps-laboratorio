import java.util.Scanner;

public class ej11 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("digame 2 palabras, yo indicare si son iguales");
		
		String palabra = leer.nextLine();
		String palabra2 = leer.nextLine();
		
		palabra=palabra.toLowerCase();
		palabra2=palabra2.toLowerCase();
		
		if (palabra.equalsIgnoreCase(palabra2)) {
		
			System.out.println(" ");
			System.out.println("las 2 palabras son iguales");
		
		}else {
			System.out.println(" ");
			System.out.println("las 2 palabras son distintas");
			
			
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}

}