import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("digame una frase");
		
		//String frase = leer.nextLine();
		String frase = "hola anibal";
		
		int numCaracteres = frase.length(); 
		
		int vocales = 0;
		
		for (int i = 0; i < numCaracteres ; i++) {
			
		    char letraActual = frase.charAt(i);
		    
		    if (esVocal(letraActual)) vocales++;
		    
		}
		
		System.out.println("la frase: " +frase+ ". tiene:");
		System.out.println(numCaracteres+" caracteres y " +vocales+ " vocales");
		
		frase = frase.replaceAll("a","e");
		
		System.out.println(frase);
		
		
	
	}

	private static boolean esVocal(char letra) {
	    return "aeiou".contains(String.valueOf(letra).toLowerCase());
	}

}
