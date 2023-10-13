
public class ej9 {

	public static void main(String[] args) {
		
		
		String frase = "La lluvia en Mendoza es escasa"; 
		
		int numCaracteres = frase.length();
		
		int i;
		
		for(i=0 ; i < numCaracteres ; i++) {
			
			char letraActual = frase.charAt(i);
			int ascii = (int) letraActual;
			System.out.println(ascii);
		        
		}
	   
		
		
		
		
		
		
		
		
		
	}

}
