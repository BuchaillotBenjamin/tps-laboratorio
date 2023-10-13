import java.util.Scanner;

public class ej1 {

	
	
	
	public static void main(String[] args) {
		
		Scanner leer = new Scanner(System.in);
		
		System.out.print("digame un numero decimal");
		
		double valorDecimal = leer.nextDouble();
		
		
		String pasarCadena = String.valueOf (valorDecimal);
		
		int pasarInt = (int) valorDecimal ;
		
		short pasarShort = (short) valorDecimal;
		
		long pasarLong = (long) valorDecimal; 
		
		float pasarFloat = (float) valorDecimal;
		
		
		
		
		
		
		System.out.println(" ");
		System.out.println("Double");
		System.out.println(valorDecimal);
		
		System.out.println(" ");
		System.out.println("double a float");
		System.out.println(pasarFloat);
		
		System.out.println(" ");
		System.out.println("Double a String");
		System.out.println(pasarCadena);
			
		System.out.println(" ");
		System.out.println("double a short");
		System.out.println(pasarShort);
	
		System.out.println(" ");
		System.out.println("double a int");
		System.out.println(pasarInt);
		
		System.out.println(" ");
		System.out.println("double a long");
		System.out.println(pasarLong);
		
		
		
	}

}
