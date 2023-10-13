import java.util.Scanner;

public class ej13 {

	public static void main(String[] args) {
		

		Scanner leer = new Scanner(System.in);
		
		System.out.println("digame 2 cadenas");
		
		String cadena1 = leer.nextLine();
		String cadena2 = leer.nextLine();
		
		boolean siNo = cadena1.contains(cadena2);
		
		if (siNo==true) {
			
			System.out.println(" ");
			System.out.println("la cadena 2 SI se encuentra dentro de la cadena 1");	
			
		}else {
			
			System.out.println(" ");
			System.out.println("la cadena 2 NO se encuentra dentro de la cadena 1");	
			
		}
		
		
		
		
		
		
	}

}
